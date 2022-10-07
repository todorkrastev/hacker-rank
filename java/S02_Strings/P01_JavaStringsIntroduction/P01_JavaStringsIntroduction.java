package java.strings;

import java.io.IOException;
import java.util.Scanner;

public class P01_JavaStringsIntroduction {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String firstStr = scanner.nextLine();
        String secondStr = scanner.nextLine();

        System.out.println(firstStr.length() + secondStr.length());

        if (firstStr.compareTo(secondStr) <= 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        System.out.println(capitalize(firstStr) + " " + capitalize(secondStr));
    }

    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
