package flashcards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the number of cards:");
        int numOfCards = scanner.nextInt();
        Flashcard[] flashcards = new Flashcard[numOfCards];

        for (int i = 0; i < numOfCards; i++) {
            flashcards[i] = new Flashcard();
        }

        for (Flashcard flashcard : flashcards) {
            flashcard.answerQuestions();
        }
    }
}
