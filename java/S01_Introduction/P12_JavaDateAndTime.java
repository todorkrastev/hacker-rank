package java.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;

class Result {
    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.setTime(Date.valueOf(LocalDate.of(year, month, day)));
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        DayOfWeek currDay = LocalDate.parse(LocalDate.of(year, month, day).toString()).getDayOfWeek();

        return currDay.name();
    }
}

public class P12_JavaDateAndTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        System.out.println(res);
    }
}
