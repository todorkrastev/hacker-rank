package com.hackerrank.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_JavaArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<List<Integer>> list = new ArrayList<>();

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            list.add(Arrays.stream(scanner.nextLine().trim().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList()));
        }

        int denoting = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < denoting; i++) {
            String[] query = scanner.nextLine().trim().split("\\s+");
            int x = Integer.parseInt(query[0]);

            int y = Integer.parseInt(query[1]);

            try {
                System.out.println(list.get(x - 1).get(y));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
