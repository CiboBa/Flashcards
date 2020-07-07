package flashcards;

import java.util.Scanner;

public class Flashcard {

    private String term;
    private String definition;
    private String cardId = "";
    private static int id = 1;

    public Flashcard() {
        Scanner scanner = new Scanner(System.in);
        setCardId();
        System.out.println("The card #" + cardId);
        term = scanner.nextLine();
        System.out.println("The definition of the card #" + cardId);
        definition = scanner.nextLine();
    }

    private void setCardId() {
        this.cardId = "" + id;
        id++;
    }

    public void answerQuestions() {
        System.out.println("Print the definition of \"" + term + "\"");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equals(definition)) {
            System.out.println("Correct answer.");
        } else System.out.println("Wrong answer. The correct one is \"" + definition + "\".");
    }

    public String toString() {
        return "Card id: " + cardId +
                "\nTerm: " + term +
                "\nDef.: " + definition;
    }
}
