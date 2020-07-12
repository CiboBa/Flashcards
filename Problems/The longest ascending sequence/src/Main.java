import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int counter = 1;
        int maxCounter = 1;
        for (int j = 0; j < numbers.length - 1; j++) {
            if (numbers[j] < numbers[j + 1]) {
                counter++;
                if (counter > maxCounter) {
                    maxCounter = counter;
                }
            } else counter = 1;
        }
        System.out.println(maxCounter);

    }
}