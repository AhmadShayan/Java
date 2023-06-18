public class Practice01 {
    int x = 7;
    public static void main(String[] args){
        System.out.println("LOLx");


        Practice01 obj1 = new Practice01();
        System.out.println(obj1.x);

        Main myName = new Main();
        System.out.println(myName.myName);

        Practice01 obj2 = new Practice01();
        obj2.printWord();


    }

    public void printWord(){
        int x = 5;
        System.out.println("hello, pleasure you meet you!");
    }
}
