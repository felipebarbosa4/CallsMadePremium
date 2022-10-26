package JoyceFarrelChapter4;

public class ProgrammingExercicesChap4_1 {
    public static void main(String[] args) {

        int numberBig = 100;
        int numberMedium = 10;
        int numberSmall = 1;
        String wordBig = "Costitution";
        String wordMedium = "Dance";
        String wordSmall = "Toy";

        System.out.println(numberBig > numberSmall);
        System.out.println(numberBig < numberMedium);
        System.out.println(numberMedium == numberSmall);
        System.out.println("numberBig == wordBig [inconsistent]");
        System.out.println("numberBig == \"Big\" [inconsistent]");
        System.out.println("wordMedium > wordSmall [inconsistent]");
        System.out.println(wordSmall.equals("TOY"));
        System.out.println(numberBig <= 5 * numberMedium + 50);
        System.out.println(numberBig >= 2000);
        System.out.println(numberBig > numberMedium + numberSmall);
        System.out.println((numberBig > numberMedium) && (numberBig < numberSmall));
        System.out.println(numberBig == 100 || numberBig > numberSmall);
        System.out.println(numberBig < 10 || numberSmall > 10);
        System.out.println(numberBig == 300 && numberMedium == 10 || numberSmall == 1);
        System.out.println("wordSmall > wordBig [inconsistent]");
        System.out.println("wordSmall > wordMedium [inconsistent]");
    }
}
