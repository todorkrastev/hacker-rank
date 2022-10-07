package java.strings;

import java.io.IOException;
import java.util.Scanner;

public class P06_JavaStringTokens {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().trim();

        if (input.compareTo("") == 0) {
            System.out.println("0");
        } else {
            String[] tokens = input.split("[^A-Za-z]+");
            System.out.println(tokens.length);
            for (String currToken : tokens) {
                System.out.println(currToken);
            }
        }
    }
}
