package java.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P05_JavaOutputFormatting {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String firstLine = bufferedReader.readLine();
        String firstLanguage = firstLine.split("\\s+")[0];
        int firstNum = Integer.parseInt(firstLine.split("\\s+")[1]);


        String secondLine = bufferedReader.readLine();
        String secondLanguage = secondLine.split("\\s+")[0];
        int secondNum = Integer.parseInt(secondLine.split("\\s+")[1]);

        String thirdLine = bufferedReader.readLine();
        String thirdLanguage = thirdLine.split("\\s+")[0];
        int thirdNum = Integer.parseInt(thirdLine.split("\\s+")[1]);

        printSeparatorLine();

        printCurrLanguage(firstLanguage);
        System.out.println(paddingZeros(firstNum));

        printCurrLanguage(secondLanguage);
        System.out.println(paddingZeros(secondNum));

        printCurrLanguage(thirdLanguage);
        System.out.println(paddingZeros(thirdNum));

        printSeparatorLine();
    }

    private static void printSeparatorLine() {
        System.out.println("================================");
    }

    private static void printCurrLanguage(String language) {
        System.out.printf("%s%s", language, (" ").repeat(15 - language.length()));
    }

    private static String paddingZeros(int num) {

        return String.valueOf(num).length() == 3 ?
                String.format("%d", num) :
                String.format("%03d", num);
    }
}
