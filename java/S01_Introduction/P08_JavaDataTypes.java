package java.introduction;

import java.util.Scanner;

public class P08_JavaDataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index < num; index++) {
            try {
                long input = scanner.nextLong();
                System.out.printf("%s can be fitted in:%n", input);

                if (-128 <= input && input <= 127) {
                    System.out.println("* byte");
                }
                if (-32768 <= input && input <= 32767) {
                    System.out.println("* short");
                }
                if (-2147483648 <= input && input <= 2147483647) {
                    System.out.println("* int");
                }
                System.out.println("* long");
            } catch (Exception e) {
                String outOfBounds = scanner.nextLine();
                System.out.printf("%s can't be fitted anywhere.%n", outOfBounds);
            }
        }
    }
}
