package java.introduction;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class P13_JavaCurrencyFormatter {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double payment = scanner.nextDouble();

        String us = currencyWithChosenLocalisation(payment, new Locale("en", "US"));
        String india = currencyWithChosenLocalisation(payment, new Locale("en", "IN"));
        String china = currencyWithChosenLocalisation(payment, new Locale("zh", "CN"));
        String france = currencyWithChosenLocalisation(payment, new Locale("fr", "FR"));


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

    public static String currencyWithChosenLocalisation(double value, Locale locale) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);

        return nf.format(value);
    }
}
