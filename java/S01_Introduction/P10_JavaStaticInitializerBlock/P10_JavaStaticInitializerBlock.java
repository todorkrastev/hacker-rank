package java.introduction;

import java.util.Scanner;

public class P10_JavaStaticInitializerBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int breadth = scanner.nextInt();
        int height = scanner.nextInt();

        if (breadth <= 0 || height <= 0) {
            String output = "java.lang.Exception: Breadth and height must be positive";
            System.out.println(output);
        } else {
            System.out.println(breadth * height);
        }
    }
}
