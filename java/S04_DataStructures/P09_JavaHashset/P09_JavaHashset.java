package com.hackerrank.dataStructures;

import java.util.*;

public class P09_JavaHashset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> pairs = new HashSet<>();

        int numOfPairs = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numOfPairs; i++) {
            pairs.add(scanner.nextLine());

            System.out.println(pairs.size());
        }
    }
}
