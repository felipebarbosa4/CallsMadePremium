package JoyceFarrelChapter4;

import java.util.Scanner;

public class ProgrammingExercicesChap4_4 {

    public static void main(String[] args) {

        int salespersonID = 1;
        int itensLastMonth = 0;
        int itensValue = 0;
        String ID_Prompt = "Enter and ID Number or 0 to Quit: ";
        Scanner input = new Scanner(System.in);

        System.out.print(ID_Prompt);
        salespersonID = input.nextInt();

        while (salespersonID != 0) {
            System.out.print("Enter itens Sold: ");
            itensLastMonth = input.nextInt();

            System.out.print("Enter Total Value: ");
            itensValue = input.nextInt();

            if ((itensLastMonth > 50) && (itensLastMonth < 100)) {
                System.out.println(salespersonID + " Achieved");
            }

            System.out.print(ID_Prompt);
            salespersonID = input.nextInt();


        }

        System.out.println("Thanks for using my Program!");
    }
}
