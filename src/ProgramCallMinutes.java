import java.util.Scanner;

public class ProgramCallMinutes {

    public static void main(String[] args) {

        Housekeeping customer = new Housekeeping();
        Scanner input = new Scanner(System.in);
        System.out.println("\nPhone payment calculator"); // apresentation of the program

        System.out.print("Input customerId: ");
        int customerId = input.nextInt();
        customer.setCustomerId(customerId);

        System.out.print("Input callsMade: ");
        int callsMade = input.nextInt();
        customer.setCallsMade(callsMade);

        System.out.print("Input Call Minutes: ");
        int callMinutes = input.nextInt();
        customer.setCallMinutes(callMinutes);

        customer.setCustomerBill(customer.getBasicService()); // Bill is 30.00

        if (callsMade > customer.getCalls()) { // if callsMade is greater than 100
            if (callMinutes > customer.getMinutes()) { // if callMinutes is greater than 500
                customer.setCustomerBill(customer.getPremium()); // Bill is 20.00
            }
        }
        System.out.printf("Customer ID : %d Calls Made: %d Used :%d minutes. %nTotal Bill is $%.2f%n"
                ,customer.getCustomerId(), customer.getCallsMade()
                ,customer.getCallMinutes(), customer.getCustomerBill());


        System.out.println("\nProgram ended");


    }
}
