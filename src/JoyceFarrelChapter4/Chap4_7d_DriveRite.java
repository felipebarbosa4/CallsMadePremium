package JoyceFarrelChapter4;
// added < 60 years condition to output
import java.util.Scanner;

public class Chap4_7d_DriveRite {
    public static void main(String[] args) {

        int policyNum = 0;
        String custLastName;
        String custFirstName;
        int age;
        int premiumMonth;
        int premiumDay;
        int premiumYear;
        int accident3y;
        int quit = -1;

        Scanner input = new Scanner(System.in);




        // housekeeping()

        System.out.print("Type the Policy Number Between 1000 and 9999 or -1 to Quit: ");
        policyNum = input.nextInt();

        while (policyNum != quit) {
            if ((policyNum >= 1000) && (policyNum <= 9999)) {
                //If policy OK
                System.out.print("Type the date using Integer Numbers: ");
                System.out.print("\nYear: ");
                premiumYear = input.nextInt();

                System.out.print("Month: ");
                premiumMonth = input.nextInt();

                System.out.print("Day: ");
                premiumDay = input.nextInt();

                if (((premiumMonth >= 1) && (premiumMonth <= 12)) && ((premiumDay >= 1) && (premiumDay <= 31)) &&
                        ((premiumYear != 0) && (premiumYear <= 2100))) {

                    System.out.print("Type the First Name: ");
                    custFirstName = input.next();

                    System.out.print("Type the Last Name: ");
                    custLastName = input.next();

                    System.out.print("Type the AGE: ");
                    age = input.nextInt();

                    if (age < 60) {

                        System.out.printf(">> %s %s , %d Years Old%n", custFirstName, custLastName, age);
                        System.out.printf(">> %d/%d/%d%n", premiumYear, premiumMonth, premiumDay);
                    }


                } else {
                    premiumYear = 0;
                    premiumMonth = 0;
                    premiumDay = 0;

                    System.out.printf(">> %d/%d/%d%n", premiumYear, premiumMonth, premiumDay);
                } // IFelseEnd
            } else {
                policyNum = 0;
            } // IFelseEnd
            System.out.printf(">> Policy Number is : %d%n*%n*%n", policyNum); //Check if the IF Worked
            System.out.print("Type the Policy Number Between 1000 and 9999 or -1 to Quit: ");
            policyNum = input.nextInt();
        }


    } // mainEnd
} // classEnd
