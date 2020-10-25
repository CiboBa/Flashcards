import java.util.Locale;
import java.util.Scanner;

public class Main {

    /* Fix this method */
    public static String toUpperCase(String str) {
        return str.toUpperCase(Locale.ENGLISH);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = "none".equalsIgnoreCase(line) ? null : line;
        try {
            System.out.println(toUpperCase(line));
        } catch (Exception e) {
            System.out.println("");
        }
    }
}