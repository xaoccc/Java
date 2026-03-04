package com.exercises;
import java.util.Scanner;
// Description:
// Print to the console the multiplication table for the numbers 1 to 10 in the format:
// "{first factor} * {second factor} = {result}".
// Solution:
public class Problem092 {
    public static void main(String[] args) {

        try(Scanner input = new Scanner(System.in)) {
            String command = input.nextLine();
            while (!command.equals("End")) {
                double neededMoney = Double.parseDouble(input.nextLine());
                double savedMoney = 0;
                if (neededMoney < 0) {
                    command = input.nextLine();
                    continue;
                }
                while (savedMoney < neededMoney) {
                    savedMoney += Double.parseDouble(input.nextLine());
                }
                System.out.printf("Going to %s!\n", command);
                command = input.nextLine();
            }
        } catch(Exception e) {
            System.out.println("Invalid input!");
        }
    }
}
