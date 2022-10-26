package JoyceFarrelChapter4;
// option B
import java.util.Scanner;

public class Chap4_6c {
    public static void main(String[] args) {
        int custAreaCode;
        int custPhoneNumber;
        int numTxt;
        double taxes;
        double beforeTaxCost;
        double afterTaxCost;
        int baseRate = 5;
        int minTxt = 100;
        int maxTxt = 300;
        double minRate = 0.03;
        double maxRate = 0.02;
        double taxRate = 0.14;
        int quit = -1;
        Scanner input = new Scanner(System.in);


        // housekeeping()
        System.out.println("Phone Program");
        System.out.println("Type area Code or type -1 to Quit: ");
        custAreaCode = input.nextInt();


        // detailLoop()

        while (custAreaCode != quit) {
            System.out.println("Type Phone Number: ");
            custPhoneNumber = input.nextInt();

            System.out.println("Type the quantity of Messages: ");
            numTxt = input.nextInt();

            beforeTaxCost = baseRate;
            if (numTxt > minTxt) {
                if (numTxt > maxRate) {
                    beforeTaxCost = (beforeTaxCost + (maxTxt - minTxt) * minRate + (numTxt - maxTxt) * maxRate);
                } else {
                    beforeTaxCost = beforeTaxCost + (numTxt - minTxt) * minRate;
                }

                taxes = beforeTaxCost * taxRate;
                afterTaxCost = beforeTaxCost + taxes;

                System.out.printf("[%d] [%d] Texts: %d Before Tax: $%.2f After Tax: $%.2f%n%n",
                        custAreaCode, custPhoneNumber, numTxt, beforeTaxCost, afterTaxCost);
            }


            System.out.println("Type area Code or type -1 to Quit: ");
            custAreaCode = input.nextInt();

        }
        System.out.println("End!");
    }
}
