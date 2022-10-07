package java.strings;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class P07_PatternSyntaxChecker {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int numOfTestCases = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numOfTestCases; i++) {
            System.out.println(
                    isRegex(scanner.nextLine()) ?
                            "Valid" :
                            "Invalid"
            );
        }
    }

    public static boolean isRegex(String regex) {
        try {
            Pattern.compile(regex);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
