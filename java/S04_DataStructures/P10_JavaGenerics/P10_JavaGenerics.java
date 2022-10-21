package com.hackerrank.dataStructures;

public class P10_JavaGenerics {
    public static void main(String[] args) {

        Integer[] intA = new Integer[]{1, 2, 3};
        String[] strB = new String[]{"Hello", "World"};

        printArray(intA);
        printArray(strB);
    }

    private static <T> void printArray(T[] elements) {
        for (Object currEl : elements) {
            System.out.println(currEl);
        }
    }
}
