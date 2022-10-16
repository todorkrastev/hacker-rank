package com.hackerrank.bigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class P03_JavaBigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        BigInteger bg1 = new BigInteger(a);
        BigInteger bg2 = new BigInteger(b);

        System.out.println(bg1.add(bg2));
        System.out.println(bg1.multiply(bg2));
    }
}
