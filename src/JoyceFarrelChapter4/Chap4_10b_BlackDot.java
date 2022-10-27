package JoyceFarrelChapter4;

import java.util.Objects;
import java.util.Scanner;

public class Chap4_10b_BlackDot {
    public static void main(String[] args) {
        String emplName;
        String emplTown;
        String quit = "quit";
        String[] emplList = new String[0];

        Scanner input = new Scanner(System.in);
        System.out.println("Black dot Printing");
        System.out.println("Type your name or \"quit\" to exit");
        emplName = input.next();

        while (!Objects.equals(emplName, quit)) {
            System.out.println("Type your Town");
            emplTown = input.next();
            if ((Objects.equals(emplTown, "Wonder Lake")) || (Objects.equals(emplTown, "WoodStock"))) {
                System.out.println(emplName + " lives in " + emplTown);
            }

            System.out.println("Type your name or \"quit\" to exit");
        }

    }
}
