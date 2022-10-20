package com.hackerrank.dataStructures;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P08_JavaStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNext()) {
            String input = scanner.next();

            System.out.println(isParenthesis(input) ?
                    "true" :
                    "false");
        }
    }

    private static boolean isParenthesis(String input) {
        ArrayDeque<Character> deque = new ArrayDeque<>();

        for (char ch : input.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                deque.addFirst(ch);
            } else {
                if (!deque.isEmpty()
                        && ((deque.peekFirst() == '{' && ch == '}')
                        || (deque.peekFirst() == '[' && ch == ']')
                        || (deque.peekFirst() == '(' && ch == ')'))) {
                    deque.removeFirst();
                } else {
                    return false;
                }
            }
        }

        return deque.isEmpty();
    }
}
