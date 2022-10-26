package JoyceFarrelChapter4;
// option A
import java.util.Scanner;

public class DashCellPhone {
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
        Scanner input = new Scanner(System.in);


        // housekeeping()
        System.out.println("Phone Program");
        System.out.println("Type area Code: ");
        custAreaCode = input.nextInt();

        System.out.println("Type Phone Number: ");
        custPhoneNumber = input.nextInt();

        System.out.println("Type the quantity of Messages: ");
        numTxt = input.nextInt();

        // detail()
        beforeTaxCost = baseRate;
        if (numTxt > minTxt) {
            if (numTxt > maxRate) {
                beforeTaxCost = (beforeTaxCost + (maxTxt - minTxt) * minRate + (numTxt - maxTxt) * maxRate);
            }
            else {
                beforeTaxCost = beforeTaxCost + (numTxt - minTxt) * minRate;
            }
        }

        taxes = beforeTaxCost * taxRate;
        afterTaxCost = beforeTaxCost + taxes;

        System.out.printf("[%d] [%d] Texts: %d Before Tax: $%.2f After Tax: $%.2f",
                custAreaCode ,custPhoneNumber ,numTxt ,beforeTaxCost ,afterTaxCost);
    }
}
