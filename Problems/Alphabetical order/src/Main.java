import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        boolean isOrdered = true;

        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].compareTo(words[i + 1]) > 0) {
                isOrdered = false;
                break;
            }
        }
        System.out.println(isOrdered);
    }
}
