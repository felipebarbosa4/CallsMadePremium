package JoyceFarrelChapter4;

import java.util.Scanner;

public class Test33 {
    public static void main(String[] args) {

        String myName;
        try (Scanner input = new Scanner(System.in)) {
            myName = input.nextLine();
        }
        System.out.println(" You typed " + myName);
        System.out.println(" END ");
    }
}
