package java.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P02_JavaStdinAndStdoutI {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int firstNum = Integer.parseInt(bufferedReader.readLine());
        int secondNum = Integer.parseInt(bufferedReader.readLine());
        int thirdNum = Integer.parseInt(bufferedReader.readLine());

        System.out.println(firstNum);
        System.out.println(secondNum);
        System.out.println(thirdNum);
    }
}
