package java.strings;

import java.io.IOException;
import java.util.Scanner;

public class P02_JavaSubstring {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] splitter = scanner.nextLine().split("\\s+");
        int start = Integer.parseInt(splitter[0]);
        int end = Integer.parseInt(splitter[1]);

        System.out.println(str.substring(start, end));
    }
}
