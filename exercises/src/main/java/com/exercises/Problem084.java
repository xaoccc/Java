package com.exercises;
import java.util.Scanner;
// Description:
// Write a program that accepts an amount - the change that needs to be returned - and calculates the smallest number of coins that can be used to make this change.
// Solution:
public class Problem084 {
    public static int coins = 0;
    // We store the coins values as a constant:
    public static double[] AMOUNTS = {2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
    public static void main(String[] args) {         
        try (Scanner input = new Scanner(System.in)) {
            double money = input.nextDouble();            
            while (money > 0) {                
                for (int i = 0; i < AMOUNTS.length; i++) {
                    money = calc(AMOUNTS[i], money);              
                }              
            }
            System.out.println(coins);                 
        }
    }
    public static double calc(double amount, double money) {
        coins += money / amount;
        return  Math.round((money%amount)* 100) / 100.0; 
    }

}
