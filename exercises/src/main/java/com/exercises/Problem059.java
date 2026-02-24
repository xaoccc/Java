package com.exercises;
import java.util.Scanner;
// Description:
// Write a program that reads text (string) entered by the user, calculates and prints the sum of the vowel values ​​according to the table below:
// letter a e i o u
// value 1 2 3 4 5
// Solution:
public class Problem059 {
    public static void main(String[] args) {
        char letter;
        int sum = 0;
        try (Scanner input = new Scanner(System.in)) {
            String text = input.nextLine().strip();
            for (int i = 0; i < text.length(); i++) {
                letter = text.charAt(i);
                switch (letter) {
                    case 'a':
                        sum += 1;
                        break;
                    case 'e':
                        sum += 2;
                        break;
                    case 'i':
                        sum += 3;
                        break;
                    case 'o':                
                        sum += 4;
                        break;
                    case 'u':
                        sum += 5;
                        break;
                    default:
                        break;
                }
            }
            System.out.println(sum);
        }
    }
}
