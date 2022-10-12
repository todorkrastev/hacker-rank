package java.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P10_ValidUsernameRegularExpression {
    private static final String PATTERN_VALIDATOR = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";

    private static final Pattern pattern = Pattern.compile(PATTERN_VALIDATOR);

    public static boolean isValid(String sentence) {

        Matcher matcher = pattern.matcher(sentence);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputs = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < inputs; i++) {
            System.out.println(
                    isValid(scanner.nextLine()) ?
                            "Valid" :
                            "Invalid"
            );
        }
    }
}
