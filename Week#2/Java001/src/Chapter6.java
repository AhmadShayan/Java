public class Chapter6 {
    public static void main(String[] args){
        float[] arr = {1.1f, 2.2f, 3, 4, 1.2f, 2.3f};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
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

    static int[] reverseArrau(int[] x){
        int[] reverse = new int[x.length];
        for (i=x.length+1; x>=0; x--){
            for(j=0; j<x.length; j++){
                reverse[j] = x[i];
            }
        }
        return reverse;
    }
}
