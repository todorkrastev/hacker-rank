package java.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P04_JavaStdinAndStdoutII {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int intNum = Integer.parseInt(bufferedReader.readLine());
        double doubleNum = Double.parseDouble(bufferedReader.readLine());
        String doubleToStr = Double.toString(doubleNum).replaceAll("\\.?0*$", "");
        doubleNum = Double.parseDouble(doubleToStr);
        String str = bufferedReader.readLine();

        System.out.printf("String: %s%n", str);
        System.out.printf("Double: %s%n", doubleNum);
        System.out.printf("Int: %d%n", intNum);
    }
}
