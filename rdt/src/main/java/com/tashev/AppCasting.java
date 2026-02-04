package com.tashev;

public class AppCasting {
    public static void main(String[] args) {
        String strnum = "123";
        int intnum = 456;
        double decimNum = 8.23;
        // Int to string (auto)
        System.out.println(strnum + intnum);
        // Here we cast the string to integer
        System.out.println(Integer.parseInt(strnum) + intnum);
        // Integer to decimal (auto)
        System.out.println(intnum + decimNum);
        // Decimal to integer
        System.out.println(intnum + (int) decimNum);
        // Decimal (round up) to integer, returns double
        System.out.println(intnum + Math.ceil(decimNum));
        // Decimal (round up) to integer, returns integer 
        System.out.println(intnum + (short) Math.ceil(decimNum));
    
    }
}
