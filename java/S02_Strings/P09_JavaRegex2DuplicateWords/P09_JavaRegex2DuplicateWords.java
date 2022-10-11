package java.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P09_JavaRegex2DuplicateWords {
    private static final String DUPLICATE_PATTERN = "\\b(\\w+)(?:\\W+\\1\\b)+";

    private static final Pattern pattern = Pattern.compile(DUPLICATE_PATTERN, Pattern.CASE_INSENSITIVE);

    public static String removeDuplicatedWords(String sentence) {

        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {
            sentence = sentence.replaceAll(matcher.group(0), matcher.group(1));
        }

        return sentence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sentences = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < sentences; i++) {
            System.out.println(
                    removeDuplicatedWords(scanner.nextLine())
            );
        }
    }
}
