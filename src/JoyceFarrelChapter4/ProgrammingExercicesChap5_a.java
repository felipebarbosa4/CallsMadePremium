package JoyceFarrelChapter4;

import java.util.Scanner;

public class ProgrammingExercicesChap5_a {

    public static void main(String[] args) {

        int idNumber;
        int days = 0;
        String description;
        String success = "Success!";
        double itemBid = 0;
        double minBid = 250.00;
        Scanner enter = new Scanner(System.in);

        System.out.print("ID Number: ");
        idNumber = enter.nextInt();
        enter.nextLine();

        System.out.print("Item Description: ");
        description = enter.nextLine();

        System.out.print("Length of auction in days: ");
        days = enter.nextInt();
        enter.nextLine();

        System.out.print("Item BID: $");
        itemBid = enter.nextDouble();
        enter.nextLine();

        System.out.printf("\nID: %d\t Description: %s\t Length: %d Days\t BID: $%.2f%n%n" ,idNumber ,description ,days ,itemBid);

        if (itemBid > minBid) {
            System.out.println(success);
        }

        System.out.println("Bye");

    }
}
