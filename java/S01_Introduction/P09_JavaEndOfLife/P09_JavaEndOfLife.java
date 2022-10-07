package java.introduction;

import java.util.Scanner;

public class P09_JavaEndOfLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        while (scanner.hasNext()) {
            System.out.println(counter + " " + scanner.nextLine());
            counter++;
        }
    }
}
