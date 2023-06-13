public class Chapter4 {
    public static void main (String[] args){
        System.out.println("1. " + switchCase("Monday"));

        System.out.println("2. " + checkPassFail(33, 33, 53));

        System.out.println("3. " + calculateSalesTax(250000));

        System.out.println("4. " + checkDay(2));

        System.out.println("5. " + checkLeapYear(2023));

        System.out.println("6. " + checkWeb("animasclothing.com"));

    }

    static String switchCase(String day){
        switch (day) {
            case "Monday":
                return ("Now opening case MONDAY...");
            case "Wednesday":
                return ("Now opening case WEDNESDAY...");
            case "Thursday":
                return ("Now opening case THURSDAY...");
            default:
                return ("No case found, please try again!");
        }
    }

    static String checkPassFail (int s1, int s2, int s3){
        int total = s1 + s2 + s3;
        int percent = (total * 100)/300;

        if(s1 >= 33 && s2 >= 33 && s3 >= 33){
            if(percent >= 40){
                return ("Congratulations! You've Passed The Exam");
            } else {
                return ("Failed, Try Next Time.");
            }
        }
        return ("Failed, Try Next Time.");
    }

    static String calculateSalesTax(int amount){
        int tax = 0;
        if(amount<25e4){
            return ("As amount is less than 2.5L. So, There will be no tax. Thank you!");
        } else if (amount<5e5) {
            tax = amount * 5/100;
            return ("Tax: Rs." + tax + " (Charging 5%)");
        } else if (amount<10e5) {
            tax = amount * 20/100;
            return ("Tax: Rs." + tax + " (Charging 20%)");
        } else if (amount>=10e5) {
            tax = amount * 30/100;
            return ("Tax: Rs." + tax + " (Charging 30%)");
        }
        return (null);
    }

    static String checkDay(int day){
        switch (day) {
            case 1:
                return ("MONDAY");
            case 2:
                return ("TUESDAY");
            case 3:
                return ("WEDNESDAY");
            case 4:
                return ("THURSDAY");
            case 5:
                return ("FRIDAY");
            case 6:
                return ("SATURDAY");
            case 7:
                return ("SUNDAY");
            default:
                return ("No data found, check 1-7!");
        }
    }

    static String checkLeapYear(int year){
        return (year%4 == 0) ? "Yes, It's a leap year" : "No, It's not a leap year";
    }

    static String checkWeb(String web){
        if(web.endsWith(".com")){
            return (web + " is a Commercial Website");
        } else if (web.endsWith(".org")){
            return (web + " is an Organizational Website");
        } else if (web.endsWith(".pk")) {
            return (web + " is a Pakistani Website");
        } else {
            return ("Sorry, Don't Know");
        }
    }

}
