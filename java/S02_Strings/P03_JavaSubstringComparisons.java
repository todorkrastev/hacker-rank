package java.strings;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P03_JavaSubstringComparisons {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int lenOfSubstrings = Integer.parseInt(scanner.nextLine());

        List<String> substrings = new ArrayList<>();
        for (int index = 0; index < str.length(); index++) {
            if (index + lenOfSubstrings <= str.length()) {
                substrings.add(str.substring(index, index + lenOfSubstrings));
            } else {
                break;
            }
        }

        Collections.sort(substrings);

        if (!substrings.isEmpty()) {
            System.out.println(substrings.get(0));
            System.out.println(substrings.get(substrings.size() - 1));
        }
    }
}
