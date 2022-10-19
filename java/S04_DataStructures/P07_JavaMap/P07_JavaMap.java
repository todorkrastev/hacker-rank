package com.hackerrank.dataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P07_JavaMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phoneBook = new HashMap<>();

        int numOfEntries = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numOfEntries; i++) {
            String name = scanner.nextLine();
            String phoneNum = scanner.nextLine();

            phoneBook.putIfAbsent(name, phoneNum);
        }

        while (scanner.hasNext()) {
            String key = scanner.nextLine();

            if (phoneBook.containsKey(key)) {
                System.out.println(key + "=" + phoneBook.get(key));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
