import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] elements = new int[size];

        for (int i = 0; i < elements.length; i++) {
            elements[i] = scanner.nextInt();
        }
        int min = elements[0];
        for (int element : elements) {
            if (element < min) {
                min = element;
            }
        }
        System.out.println(min);
    }
}