package JoyceFarrelChapter4;

import java.util.Scanner;

public class CharTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Type a word");
        String test = input.next();

        int countTest = test.length();
        System.out.println(test + " has :" + countTest);
    }
}
