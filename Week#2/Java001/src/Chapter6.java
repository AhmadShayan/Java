public class Chapter6 {
    public static void main(String[] args){
        float[] arr = {1.1f, 2.2f, 3, 4, 1.2f, 2.3f};
        int[] arr2 = {1, 2, 3, 10, 5, 6, 7, 0, -4, 11};
        float[] arr3 = {20, 30, 40, 50};

        int[][] a1 = { {1, 1, 1}, {1, 1, 1} };
        int[][] a2 = { {7, 8, 9}, {10, 11, 12} };

        System.out.println("1. Sum: " + calcSum(arr));

        String checkInt = (checkInteger(arr2, 1) == true) ? ("Present") : ("Not Present");
        System.out.println("2. " + checkInt);

        System.out.println("3. Average: " + checkAvgMarks(arr3));

        System.out.println("_________________");
        int[][] matric = sumTwoArray(a1,a2);
        for (int i = 0; i<matric.length; i++){
            for(int j = 0; j<matric[i].length; j++){
                System.out.print(" " + matric[i][j]);
            }
            System.out.println();
        }
        System.out.println("_________________");

        System.out.println("_________________");
        int[] data = reverseArray(arr2);
        for(int i : data){
            System.out.print(i + " ");
        }

        System.out.println("\nNEW_________________");
        int[] data1 = reverseArrayNew(arr2);
        for(int i : data1){
            System.out.print(i + " ");
        }

        System.out.println("\n_________________");
        System.out.println("MAX: " + maxInt(arr2));
        System.out.println("MIN: " + minInt(arr2));

        int[] arr4 = {20, 30, 40, 90};
        int[] arr5 = {4, 3, 2, 3};
        String result = (checkSorted(arr5)) ? ("SORTED!") : ("NOT SORTED");
        System.out.println(result);
//        System.out.println(checkSorted(arr4));

    }

    static float calcSum(float[] x){
        float sum = 0;
        for (float i : x){
            sum += i;
        }
        return sum;
    }

    static boolean checkInteger(int[] x, int y){
        for (int i : x){
            if(i==y){
                return true;
            }
        }
        return false;
    }

    static float checkAvgMarks(float[] x){
        float total = 0;
        for (float i : x){
           total += i;
        }
        return total/x.length;
    }

    static int[][] sumTwoArray(int[][] x, int[][] y){
        int[][] sum = new int[2][3];
        for(int i=0; i< x.length; i++){
            for(int j=0; j<x[i].length; j++){
                sum[i][j] = x[i][j] + y[i][j];
            }
        }
        return sum;
    }

    static int[] reverseArray(int[] x){
        for(int i=0; i<x.length/2; i++){
            int temp = x[i];
            x[i] = x[x.length - i - 1];
            x[x.length - i - 1] = temp;
        }
        return x;
    }

    static int[] reverseArrayNew(int[] x){
        int[] arr = new int[x.length];
        for (int i=x.length-1; i>=0; i--){
            arr[x.length-i-1] = x[i];
        }
        return arr;
    }

    static int maxInt(int[] x){
        int max = x[0];
        for (int i : x){
            if (i>max){
                max = i;
            }
        }
        return max;
    }

    static int minInt(int[] x){
        int min = x[0];
        for (int i : x){
            if (min>i){
                min = i;
            }
        }
        return min;
    }

    static boolean checkSorted(int[] arr){
        boolean status = false;
        for (int i=0; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]) {
                status = true;
            } else {
                status = false;
                break;
            }
        }
        for (int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]) {
                status = true;
            } else {
                status = false;
                break;
            }
        }
        return status;
    }
}
