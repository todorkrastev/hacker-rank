package java.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P11_TagContentExtractor {
    private static final String PATTERN_VALIDATOR = "<(.+)>([^<>]+)</\\1>";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputs = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < inputs; i++) {
            String input = scanner.nextLine();
            int counter = 0;

            Pattern pattern = Pattern.compile(PATTERN_VALIDATOR);
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                System.out.println(matcher.group(2));
                counter++;
            }

            if (counter == 0) {
                System.out.println("None");
            }
        }
    }
}
