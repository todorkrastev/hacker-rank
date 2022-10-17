package com.hackerrank.dataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class P01_Java1DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }

        Arrays
                .stream(arr)
                .forEach(System.out::println);
    }
}
