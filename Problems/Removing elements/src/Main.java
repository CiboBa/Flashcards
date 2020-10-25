import java.util.*;

class SetUtils {

    public static Set<Integer> getSetFromString(String str) {
        // write your code here
        Set<String> wordsOfText = new HashSet<>();
        Set<Integer> integerSet = new HashSet<>();
        wordsOfText.addAll(List.of(str.split(" ")));
        for (String s : wordsOfText) {
            integerSet.add(Integer.valueOf(s));
        }
        return integerSet;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        // write your code here
        set.removeIf(n -> n > 10);
    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        Set<Integer> set = SetUtils.getSetFromString(numbers);
        SetUtils.removeAllNumbersGreaterThan10(set);
        set.forEach(e -> System.out.print(e + " "));
    }
}