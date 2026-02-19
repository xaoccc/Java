package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// A company gives the following commissions to its salespeople based on the city they work in and the sales volume s. 
// Write a console program that reads the city name (text) and sales volume (real number) entered by the user, and calculates and 
// outputs the sales commission amount according to the table above. 
// The result should be formatted to 2 decimal places. If the city or sales volume (negative number) is invalid, print "error".
// Solution:
public class Problem044 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            String city = input.next();
            double salesNum = input.nextDouble();
            if (salesNum < 0) {
                System.out.println("error");
                return;
            }
            switch (city) {
                case "Sofia":
                    if (salesNum <= 500) {
                        System.out.printf("%.2f", salesNum * 0.05);
                    }
                    else if (salesNum <= 1000) {
                        System.out.printf("%.2f", salesNum * 0.07);
                    }
                    else if (salesNum <= 10000) {
                        System.out.printf("%.2f", salesNum * 0.08);
                    }
                    else {
                        System.out.printf("%.2f", salesNum * 0.12);
                    }                
                    break;
                case "Varna":
                    if (salesNum <= 500) {
                        System.out.printf("%.2f", salesNum * 0.045);
                    }
                    else if (salesNum <= 1000) {
                        System.out.printf("%.2f", salesNum * 0.075);
                    }
                    else if (salesNum <= 10000) {
                        System.out.printf("%.2f", salesNum * 0.10);
                    }
                    else {
                        System.out.printf("%.2f", salesNum * 0.13);
                    }                    
                    break;
                case "Plovdiv":
                    if ( salesNum <= 500) {
                        System.out.printf("%.2f", salesNum * 0.055);
                    }
                    else if (salesNum <= 1000) {
                        System.out.printf("%.2f", salesNum * 0.08);
                    }
                    else if (salesNum <= 10000) {
                        System.out.printf("%.2f", salesNum * 0.12);
                    }
                    else {
                        System.out.printf("%.2f", salesNum * 0.145);
                    }                    
                    break;
                default:
                    System.out.println("error");
            }
            
        } catch(InputMismatchException e) {
            System.out.println("error");
        }
    }
}
