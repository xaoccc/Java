package com.exercises;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Write a program that keeps the information about products and their prices. Each product has a name, a price, and a quantity:
// If the product doesn't exist yet, add it with its starting quantity.
// If you receive a product, which already exists, increases its quantity by the input quantity and if its price is different, replace the price as well. You will receive products' names, prices, and quantities on new lines. Until you receive the command "buy", keep adding items. Finally, print all items with their names and the total price of each product.
// Input
// Until you receive "buy", the products will be coming in the format: "{name} {price} {quantity}".
// The product data is always delimited by a single space.
// Output
// Print information about each product in the following format: "{product_name} -> {total_price}"
// Format the total price to the 2nd digit after the decimal separator.

public class Problem117 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String[] command = input.nextLine().split(" ");
            HashMap<String, List<Double>> products = new HashMap<>();
            while (!command[0].equals("buy")) {

                products.putIfAbsent(command[0], new ArrayList<>(List.of(
                        Double.valueOf(command[1]),
                        0.0
                )));

                List<Double> productData = products.get(command[0]);
                productData.set(0, Double.valueOf(command[1]));
                productData.set(1, productData.get(1) + Double.valueOf(command[2]));
                command = input.nextLine().split(" ");
            }

            for(Map.Entry<String, List<Double>> entry : products.entrySet()) {
                System.out.printf("%s -> %f\n", entry.getKey(), entry.getValue().get(0) * entry.getValue().get(1));
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
