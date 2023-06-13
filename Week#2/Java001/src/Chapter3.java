public class Chapter3 {
    public static void main(String[] args){
        String txt = toLowerCase("This is a String, THAT I WANT  to pRing in THe LoWer CasE.");
        System.out.println("1. " + txt);

        String txt2 = toUnderscore("This is a String, THAT I WANT  to pRing in THe LoWer CasE.");
        System.out.println("2. " + txt2);

        System.out.println(replaceWithName("Ahmad"));
    }

    static String toLowerCase(String txt){
        return txt.toLowerCase();
    }

    static String toUnderscore(String txt){
        return txt.replace(" ", "_");
    }

    static String replaceWithName(String name){
        String letter = "3. Dear <|name|>, Thanks a lot. ";
        return letter.replace("<|name|>", name);
    }

}
