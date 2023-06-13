public class Main {
    public static void main(String[] args){
        System.out.print("1. Adding Three Numbers: ");
        int sum = addThreeNum(1,2,4);
        System.out.println(sum);

        System.out.print("2. Calculating Percentage: ");
        float percentage = calcPercent(98,98,98);
        System.out.println(percentage);

        System.out.print("3. Converting Kms to Miles: ");
        System.out.println(kmToMiles(34));

        isInteger(6);

        System.out.println("5. " + (7/4)*(9/2));

        doEncryptDecrypt(54.8f);


    }
    public static int addThreeNum(int x, int y, int z){
        return x + y + z;
    }

    static float calcPercent(float s1, float s2, float s3){
        float percentage = ((s1 + s2 + s3)*100)/300;
        return percentage;
    }

    static float kmToMiles(float km){
        float miles = km * 0.621371f;
        return miles;
    }

    static void isInteger(float x){
        if(Math.floor(x) == Math.ceil(x)){
            System.out.println("4. The Number Is An Integer.");
        } else {
            System.out.println("4. The Number Is Not An Integer.");
        }
    }

    static void doEncryptDecrypt(float grade){
        System.out.println("6. Encryption & Decryption");
        float encrypted = grade + 8;
        System.out.println("\ta. Encrypted Grades: " + encrypted);
        float decrypted = encrypted - 8;
        System.out.println("\tb. Decrypted Grades: " + decrypted);



    }
}