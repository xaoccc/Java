package com.exercises;

import java.util.Scanner;

public class Problem100 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if(num % 5 == 0) {
                System.out.println("Buzz");
            } else if(num % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(num);
            }
        }
    }
}
