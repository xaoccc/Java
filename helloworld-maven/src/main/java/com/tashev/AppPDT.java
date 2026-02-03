package com.tashev;
// Primitive Data Types
public class AppPDT {
    public static void main(String[] args) {
        byte age = 127;
        String name = "Ivan";
        char letter = 'A';
        short cost = 32767;
        int amount = 2_146_999_999;
        long veryLargeNumber = 777_723_456_789L;
        float asd = 34.15F;
        double dbl = 34.15;
        boolean isThisLove = false;
        System.out.printf("My age is %d. My name is %s. My car is Mercedes %c class and costs %d euro.\n", age, name, letter, cost);
        System.out.printf("I have %d euro in the bank and owe money to %d people.\n", amount, veryLargeNumber);
        System.out.printf("I have %f euro in my pocket.\n", dbl);
        System.out.printf("I am %s in love.", (isThisLove ? "" : "not"));
    }
}
