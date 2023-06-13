public class Chapter5 {
    public static void main(String[] args){
        System.out.println("___________________________");
        starPattern();
        System.out.println("___________________________");

        System.out.println("___________________________");
        reverseStarPattern();
        System.out.println("___________________________");

        System.out.println("___________________________");
        System.out.println("Total Sum: " + calcSumEvenNum(5) + " (Using While Loop)");
        System.out.println("___________________________");

        System.out.println("___________________________");
        System.out.println("Total Sum: " + calcSumEvenNumForLoop(6) + " (Using For Loop)");
        System.out.println("___________________________");

        System.out.println("___________________________");
        multiTable(7);
        System.out.println("___________________________");

        System.out.println("___________________________");
        reverseMultiTable(7);
        System.out.println("___________________________");

        System.out.println("___________________________");
        System.out.println("Factorial: " + calcFactorial(5) + " (Using For Loop)");
        System.out.println("___________________________");

        System.out.println("___________________________");
        System.out.println("Factorial: " + calcFactorialWhileLoop(5) + " (Using While Loop)");
        System.out.println("___________________________");

        System.out.println("___________________________");
        System.out.println("Total Sum: " + calSumMultiTable(2));
        System.out.println("___________________________");

        System.out.println("___________________________");
        starPatternWhile();
        System.out.println("___________________________");

        System.out.println("___________________________");
        reverseStarPatternWhile();
        System.out.println("___________________________");
    }

    static void starPattern(){
        for (int i=1; i<5; i++){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void reverseStarPattern(){
        for (int i=4; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static int calcSumEvenNum(int n){
        int sum,  num;
        sum = 0;
        num = 0;

        while(num <= (n*2)){
            sum += num;
            num += 2;
        }
        return sum;
    }

    static void multiTable(int n){
        for(int i=1; i<=10; i++){
            int result = i*n;
            System.out.println(n + " x " + i + " = " + result);
        }
    }

    static void reverseMultiTable(int n){
        for(int i=10; i>0; i--){
            int result = i*n;
            System.out.println(n + " x " + i + " = " + result);
        }
    }

    static int calcFactorial(int n){
        int result=1;
        for (int i=1; i<=n; i++){
            result *= i;
        }
        return result;
    }

    static int calcFactorialWhileLoop(int n){
        int result, i;
        result = 1;
        i = 1;
        while(i<=n){
            result *= i;
            i++;
        }
        return result;
    }

    static int calcSumEvenNumForLoop(int n){
        int sum = 0;
        for (int i=0; i<=n*2; i+=2){
            sum += i;
        }
        return sum;
    }

    static int calSumMultiTable(int n){
        int sum = 0;
        for(int i=1; i<=10; i++){
            int result = i*n;
            System.out.println(n + " x " + i + " = " + result);
            sum += result;
        }
        return sum;
    }

    static void starPatternWhile(){
        int i=1;
        while(i<5){
            int j=0;
            while(j<i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }

    }

    static void reverseStarPatternWhile(){
        int i=4;
        while(i>0){
            int j=0;
            while(j<i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }

    }

}
