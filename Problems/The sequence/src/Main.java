import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        int j;
        int counter = 1;
        int[] numbers = new int[n];
        for (j = 0; j < n; j++) {
            numbers[j] = i;
            i++;
            for (int k = 0; k <= j; k++) {
                if (counter > n) break;
                System.out.print(numbers[j] + " ");
                counter++;
            }
        }
    }
}