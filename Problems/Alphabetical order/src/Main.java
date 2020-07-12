import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");

        for (int i = 1; i < words.length; i++) {
            int alphabeticalOrder = words[i].compareToIgnoreCase(words[i - 1]);

            if (alphabeticalOrder < 0) {
                System.out.println("false");
                break;
            } else if (i == words.length - 1) {
                System.out.println("true");
                break;
            }
        }

    }
}
