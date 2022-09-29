package java.introduction;

import java.util.Scanner;

public class P11_JavaIntToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int num = scanner.nextInt();
            String numToString = String.valueOf(num);
            System.out.println("Good job");
        } catch (Exception e) {
            System.out.println("Wrong answer");
        }
    }
}