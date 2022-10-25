package JoyceFarrelChapter4;

// Program for test how many decisions the program makes.


public class CallsMadeOr {

    public static void main(String[] args) {

        System.out.println("This program takes information from 10 customers and calculates the total decisions of OR operator");


        int calls1 = 11;
        int texts1 = 51;

        int calls2 = 12;
        int texts2 = 52;

        int calls3 = 9;
        int texts3 = 51;

        int calls4 = 12;
        int texts4 = 15;

        int calls5 = 12;
        int texts5 = 12;

        int calls6 = 51;
        int texts6 = 51;

        int calls7 = 3;
        int texts7 = 3;

        int calls8 = 4;
        int texts8 = 67;

        int calls9 = 5;
        int texts9 = 90;

        int calls10 = 3;
        int texts10 = 100;

        int calls = 10;
        int texts = 50;
        int countDecisions = 0;
        int countDecisions2 = 0;
        int countDecisionsFalse = 0;
        int countDecisionsFalse2 = 0;

        System.out.println("\nAND operators");

        if ((calls1 > calls) || (texts1 > texts)) {
            ++countDecisions; }
        else {
            ++countDecisionsFalse;
        }

        if ((calls1 > calls) || (texts1 > texts)) {
            ++countDecisions;
        }
        else {
            ++countDecisionsFalse;
        }

        if ((calls2 > calls) || (texts2 > texts)) {
            ++countDecisions;
        }
        else {
            ++countDecisionsFalse;
        }

        if ((calls3 > calls) || (texts3 > texts)) {
            ++countDecisions;
        }
        else {
            ++countDecisionsFalse;
        }

        if ((calls4 > calls) || (texts4 > texts)) {
            ++countDecisions;
        }
        else {
            ++countDecisionsFalse;
        }

        if ((calls5 > calls) || (texts5 > texts)) {
            ++countDecisions;
        }
        else {
            ++countDecisionsFalse;
        }


        if ((calls6 > calls) || (texts6 > texts)) {
            ++countDecisions;
        }
        else {
            ++countDecisionsFalse;
        }

        if ((calls7 > calls) || (texts7 > texts)) {
            ++countDecisions;
        }
        else {
            ++countDecisionsFalse;
        }

        if ((calls8 > calls) || (texts8 > texts)) {
            ++countDecisions;
        }
        else {
            ++countDecisionsFalse;
        }

        if ((calls9 > calls) || (texts9 > texts)) {
            ++countDecisions;
        }
        else {
            ++countDecisionsFalse;
        }

        if ((calls10 > calls) || (texts10 > texts)) {
            ++countDecisions;
        }
        else {
            ++countDecisionsFalse;
        }

        System.out.println("Decisions = " + countDecisions);
        System.out.println("Decisions False = " + countDecisionsFalse);
        System.out.println("TOTAL = " + (countDecisionsFalse+ countDecisions));


        if ((texts1 > texts) || (calls1 > calls)) {
            ++countDecisions2;
        }
        else {
            ++countDecisionsFalse2;
        }

        if ((texts2 > texts) || (calls2 > calls)) {
            ++countDecisions2;
        }
        else {
            ++countDecisionsFalse2;
        }

        if ((texts3 > texts) || (calls3 > calls)) {
            ++countDecisions2;
        }
        else {
            ++countDecisionsFalse2;
        }

        if ((texts4 > texts) || (calls4 > calls)) {
            ++countDecisions2;
        }
        else {
            ++countDecisionsFalse2;
        }

        if ((texts5 > texts) || (calls5 > calls)) {
            ++countDecisions2;
        }
        else {
            ++countDecisionsFalse2;
        }

        if ((texts6 > texts) || (calls6 > calls)) {
            ++countDecisions2;
        }
        else {
            ++countDecisionsFalse2;
        }

        if ((texts7 > texts) || (calls7 > calls)) {
            ++countDecisions2;
        }
        else {
            ++countDecisionsFalse2;
        }

        if ((texts8 > texts) || (calls8 > calls)) {
            ++countDecisions2;
        }
        else {
            ++countDecisionsFalse2;
        }

        if ((texts9 > texts) || (calls9 > calls)) {
            ++countDecisions2;
        }
        else {
            ++countDecisionsFalse2;
        }

        if ((texts10 > texts) || (calls10 > calls)) {
            ++countDecisions2;
        }
        else {
            ++countDecisionsFalse2;
        }


        System.out.println("Decisions 2 = " + countDecisions2);
        System.out.println("Decisions False = " + countDecisionsFalse2);
        System.out.println("TOTAL = " + (countDecisionsFalse2+ countDecisions2));

        int sum1 = countDecisions + countDecisionsFalse;
        int sum2 = countDecisions2 + countDecisionsFalse2;

        if (sum1 > sum2) {
            System.out.println("\nUsing Minutes first is better");
        }
        else {
            System.out.println("\nUsing Calls first is better");
        }
    }
}
