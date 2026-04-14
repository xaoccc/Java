package com.exercises;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
// After you have completed your first task, your boss decides to give you another one right away. 
// Now not only you have to keep track of the stock, but also you should answer customers if you have some products in stock or not.
// You will be given key-value pairs of products and quantities (on a single line separated by space). 
// On the following line, you will be given products to search for. Check for each product. You have 2 possibilities:

// If you have the product, print "We have {quantity} of {product} left".
// Otherwise, print "Sorry, we don't have {product}".

public class Problem121 {
    public static void main(String[] args) {
        HashMap<String, Integer> bakery = new HashMap<>();
        try (Scanner input = new Scanner(System.in)) {
            String[] bakeryList= input.nextLine().split(" ");
            String[] itemsToFind= input.nextLine().split(" ");
            for(int i=0; i<bakeryList.length; i+=2) {
                bakery.put(bakeryList[i], Integer.valueOf(bakeryList[i + 1]));
            }

            for (String item : itemsToFind) {
                if (bakery.containsKey(item)) {
                    System.out.printf("We have %d of %s left\n", bakery.get(item), item);
                } else {
                    System.out.printf("Sorry, we don't have %s\n",  item);
                }
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
