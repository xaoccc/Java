package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// Description:
// Write a program that reads two integers (N1 and N2) and an operator to perform a given mathematical operation on them. 
// The possible operations are: Addition(+), Subtraction(-), Multiplication(*), Division(/) and Modular Division(%). 
// When adding, subtracting and multiplying, the result and whether it is even or odd should be printed on the console. 
// In the case of ordinary division – the result. In the case of modular division – the remainder. 
// It should be borne in mind that the divisor can be equal to 0 (zero), and division by zero is not possible. 
// In this case, a special message should be printed.
// Solution:
public class Problem050 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            String operator = input.next();

            switch (operator) {
                case "+":
                    System.out.printf("%d + %d = %d - %s", num1, num2, num1 + num2, ((num1 + num2) % 2 == 0) ? "even" : "odd");
                    break;
                case "-":
                    System.out.printf("%d - %d = %d - %s", num1, num2, num1 - num2, ((num1 - num2) % 2 == 0) ? "even" : "odd");
                    break;
                case "*":
                    System.out.printf("%d * %d = %d - %s", num1, num2, num1 * num2, ((num1 * num2) % 2 == 0) ? "even" : "odd");
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.printf("Cannot divide %d by zero", num1);
                        break;
                    }
                    System.out.printf("%d / %d = %.2f", num1, num2, (double) num1 / num2);
                    break;
                case "%":
                    if (num2 == 0) {
                        System.out.printf("Cannot divide %d by zero", num1);
                        break;
                    }
                    System.out.printf("%d %% %d = %d", num1, num2,  num1 % num2);
                    break;
                default:
                    throw new AssertionError("Invalid operator!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
