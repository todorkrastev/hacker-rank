package java.strings;

import java.io.IOException;
import java.util.Scanner;

public class P04_JavaStringReverse {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        boolean isPalindrome = true;

        for (int index = 0; index < input.length() / 2; index++) {
            if (input.charAt(index) != input.charAt(input.length() - 1 - index)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ?
                "Yes" :
                "No");
    }
}
