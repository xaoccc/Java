package com.exercises;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
// You seem to be doing great at your first job, so your boss decides to give you as your next task something more challenging. 
// You have to accept all the new products coming in the bakery and finally gather some statistics.
// You will be receiving key-value pairs on separate lines separated by ": " until you receive the command "statistics". 
// Sometimes you may receive a product more than once. In that case, you have to add the new quantity to the existing one. 
// When you receive the "statistics" command, print the following:
// "Products in stock:

// {product1}: {quantity1}
// {product2}: {quantity2}
// …
// {productN}: {quantityN}
// Total Products: {count_all_products}
// Total Quantity: {sum_all_quantities}"

public class Problem122 {

    public static void main(String[] args) {
        HashMap<String, Integer> stock = new HashMap<>();
        try (Scanner input = new Scanner(System.in)) {
            String[] command = input.nextLine().split(" ");
            int totalQuantity = 0;

            while (!command[0].equals("statistics")) {
                String item = command[0];
                int quantity = Integer.parseInt(command[1]);
                totalQuantity += quantity;                
                stock.put(item, stock.getOrDefault(item, 0) + quantity);
                command = input.nextLine().split(" ");
            }

            System.out.println("Products in stock:");
            for (Map.Entry<String, Integer> entry : stock.entrySet()) {
                System.out.printf("- %s %d\n", entry.getKey(), entry.getValue());
            }

            System.out.printf("Total products: %d\n", stock.size());
            System.out.printf("Total quantity: %d", totalQuantity);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
