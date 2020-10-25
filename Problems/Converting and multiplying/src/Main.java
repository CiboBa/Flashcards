import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        do {
            String s = scanner.nextLine();
            if (!s.equals("0")) {
                try {
                    int result = Math.multiplyExact(Integer.parseInt(s), 10);
                    System.out.println(result);
                } catch (Exception e) {
                    System.out.println("Invalid user input: " + s);
                }
            } else {
                break;
            }
        } while (scanner.hasNextLine());
    }
}