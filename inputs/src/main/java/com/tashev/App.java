package com.tashev;
import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.printf("Your name is %s. You are %d years old.", name, (int) (Math.random() * 100));

    }
}
