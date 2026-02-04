package com.tashev;

import java.text.NumberFormat;

public class AppFormat {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println(currency.format(15.56));
        // this
        NumberFormat percentage = NumberFormat.getPercentInstance();
        System.out.println(percentage.format(0.44));
        // and this do the same
        System.out.println(NumberFormat.getPercentInstance().format(0.44));

    }
}
