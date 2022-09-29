package java.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P07_JavaLoopsII {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numOfQueries = Integer.parseInt(bufferedReader.readLine());
        List<String> result = new ArrayList<>();

        for (int m = 0; m < numOfQueries; m++) {
            String[] splitter = bufferedReader.readLine().split("\\s+");
            int a = Integer.parseInt(splitter[0]);
            int b = Integer.parseInt(splitter[1]);
            int n = Integer.parseInt(splitter[2]);


            for (int k = 1; k <= n; k++) {
                result.add(String.valueOf(a + getResult(k, b)));
            }

            System.out.println(printElementsSeparatedBySpace(result));
            result.clear();
        }
    }

    private static int getResult(int k, int b) {
        int currResult = 0;
        int multiplier = 1;
        for (int l = 0; l < k; l++) {
            currResult += multiplier * b;
            multiplier *= 2;
        }

        return currResult;
    }

    private static String printElementsSeparatedBySpace(List<String> result) {
        return String.join(" ", result);
    }
}
