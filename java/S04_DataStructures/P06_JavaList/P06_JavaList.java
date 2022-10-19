package com.hackerrank.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06_JavaList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfElements = Integer.parseInt(scanner.nextLine());

        List<Integer> list = Arrays
                .stream(scanner.nextLine().trim().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int numOfQueries = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numOfQueries; i++) {
            String command = scanner.nextLine();

            int index;
            if ("Insert".equals(command)) {
                String[] split = scanner.nextLine().trim().split("\\s+");
                index = Integer.parseInt(split[0]);
                int num = Integer.parseInt(split[1]);
                list.add(index, num);
            } else if ("Delete".equals(command)) {
                index = Integer.parseInt(scanner.nextLine());

                list.remove(index);
            }
        }

        System.out.println(printResult(list));
    }

    private static String printResult(List<Integer> list) {
        return list.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" "));
    }

}
