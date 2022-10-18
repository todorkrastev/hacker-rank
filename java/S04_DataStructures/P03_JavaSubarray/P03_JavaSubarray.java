package com.hackerrank.dataStructures;

import java.util.Scanner;

public class P03_JavaSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

        int counter = 0;

        for (int k = 0; k < num; k++) {
            for (int l = k; l < num; l++) {

                int sum = 0;

                for (int m = k; m <= l; m++) {
                    sum = sum + arr[m];
                }

                if (sum < 0) {
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}
