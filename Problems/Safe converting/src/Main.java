import java.util.Scanner;

public class Main {

    public static int convert(Long val) {
        // write your code here
        int i;
        if (val == null) {
            i = 0;
        } else if (val > Integer.MAX_VALUE) {
            i = Integer.MAX_VALUE;
        } else if (val < Integer.MIN_VALUE) {
            i = Integer.MIN_VALUE;
        } else {
            i = val.intValue();
        }
        return i;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
        System.out.println(convert(longVal));
    }
}