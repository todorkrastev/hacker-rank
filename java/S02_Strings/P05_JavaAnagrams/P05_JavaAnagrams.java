package java.strings;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class P05_JavaAnagrams {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String string1 = scanner.nextLine().toLowerCase();
        String string2 = scanner.nextLine().toLowerCase();

        System.out.println(isAnagramSort(string1, string2) ?
                "Anagrams" :
                "Not Anagrams");

    }

    private static boolean isAnagramSort(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        char[] a1 = string1.toCharArray();
        char[] a2 = string2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }
}
