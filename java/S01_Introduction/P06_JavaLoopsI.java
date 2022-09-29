package java.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P06_JavaLoopsI {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bufferedReader.readLine().trim());

        for (int index = 1; index <= 10; index++) {
            System.out.printf("%d x %d = %d%n", num, index, num * index);
        }
    }
}
