package JoyceFarrelChapter4;

import java.util.Scanner;

public class EggPrice {
    public static void main(String[] args) {

        double cartela;
        double price;

        Scanner input = new Scanner(System.in);
        System.out.print("Type Quantity: ");
        cartela = input.nextDouble();

        System.out.print("\nType Price: ");
        price = input.nextDouble();

        System.out.println(price/cartela + " Per Egg");
    }
}
