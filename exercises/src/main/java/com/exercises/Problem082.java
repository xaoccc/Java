package com.exercises;
import java.util.Scanner;
// Description:
// Jessie has decided to save money for a trip and wants you to help her figure out if she will be able to raise the necessary amount. 
// She saves or spends some of her money every day. If she wants to spend more than her available money, she will spend it all and will have 0 leva left.
// Solution:
public class Problem082 {
    public static void main(String[] args) {
        int spends = 0;
        int days = 0;
        try (Scanner input = new Scanner(System.in)) {
            double moneyNeeded = Double.parseDouble(input.nextLine());
            double moneyAvailable = Double.parseDouble(input.nextLine());
            while (spends < 5) { 
                String command = input.nextLine();
                double amount = Double.parseDouble(input.nextLine());
                days++;
                if (command.equals("save")) {
                    spends = 0;
                    moneyAvailable += amount;
                } else if (command.equals("spend")) {
                    spends++;
                    moneyAvailable -= amount;
                    if (moneyAvailable < 0) {
                        moneyAvailable = 0;
                    }                        
                } else {
                    continue;
                }

                if (moneyAvailable >= moneyNeeded) {
                    System.out.printf("You saved the money for %d days.", days);
                    return;
                }
            }
        }
        System.out.printf("You can't save the money.\n%d", days);
    }
}
