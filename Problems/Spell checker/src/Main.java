import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int numberOfKnownWords = scanner.nextInt();
        scanner.nextLine();
        HashSet<String> knownWords = new HashSet<>();

        for (int i = 0; i < numberOfKnownWords; i++) {
            knownWords.add(scanner.nextLine().toUpperCase());
        }

        int numberOfLines = scanner.nextInt();
        scanner.nextLine();
        HashSet<String> wordsOfText = new HashSet<>();
        for (int i = 0; i < numberOfLines; i++) {
            wordsOfText.addAll(List.of(scanner.nextLine().split(" ")));
        }

        for (String element: wordsOfText
        ) {
            if (!knownWords.contains(element.toUpperCase())) {
                System.out.println(element);
            }
        }
    }
}