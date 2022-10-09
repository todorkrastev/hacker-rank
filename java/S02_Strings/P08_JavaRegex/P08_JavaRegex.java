package java.strings;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P08_JavaRegex {
    private static final String IP_PATTERN =
            "^(([0-9]|0[0-9]|00[0-9]|[1-9][0-9]|0[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$";

    private static final Pattern pattern = Pattern.compile(IP_PATTERN);

    public static boolean isValid(final String ip) {
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            System.out.println(isValid(scanner.nextLine()));
        }
    }
}
