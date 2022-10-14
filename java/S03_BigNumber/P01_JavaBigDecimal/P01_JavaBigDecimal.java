package com.hackerrank.bigNumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class P01_JavaBigDecimal {
    public static void main(final String[] argh) {

        Scanner scanner = new Scanner(System.in);
        int numOfStrings = scanner.nextInt();
        String[] arrStrings = new String[numOfStrings];

        for (int i = 0; i < numOfStrings; i++) {
            arrStrings[i] = scanner.next();
        }

        Arrays
                .sort(arrStrings,
                        Collections
                                .reverseOrder(Comparator.comparing(BigDecimal::new)));

        for (int i = 0; i < numOfStrings; i++) {
            System.out.println(arrStrings[i]);
        }
    }
}
