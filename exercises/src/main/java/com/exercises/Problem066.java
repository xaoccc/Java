package com.exercises;
import java.util.Scanner;
// Description:
// Given n integers in the interval [1…1000]. Of these, some percentage p1 is below 200, another percentage p2 is from 200 to 399, 
// another percentage p3 is from 400 to 599, another percentage p4 is from 600 to 799 and the remaining p5 percentages are from 800 and above. 
// Write a program that calculates and prints the percentages p1, p2, p3, p4 and p5.
// Solution:
public class Problem066 {
    public static int inputs;
    public static void main(String[] args) {        
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        try(Scanner input = new Scanner(System.in)) {
            inputs = input.nextInt();
            int num;
            for (int i = 0; i < inputs; i++) {
                num = input.nextInt();
                if (num < 1) {
                    inputs -= 1;
                }
                else if (num < 200) {
                    p1 += 1;
                } else if (num < 400) {
                    p2 += 1;
                } else if (num < 600) {
                    p3 += 1;
                } else if (num < 800) {
                    p4 += 1;
                } else if (num <= 1000) {
                    p5 += 1;
                } else {
                    inputs -= 1;
                }
            }           

            System.out.printf("%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n", calc(p1), calc(p2), calc(p3), calc(p4), calc(p5));
        }
    }
    public static double calc(int p) {
        return ((double) p / (double)inputs) * 100;
    }
}
