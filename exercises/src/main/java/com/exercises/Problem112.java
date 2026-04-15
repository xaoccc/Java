package com.exercises;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Problem112 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            String text = input.nextLine().replaceAll("\\s", "");
            HashMap<String, Integer> charsNum = new HashMap<>();
            for (int i=0; i<text.length(); i++) {
                String ch = String.valueOf(text.charAt(i));
                charsNum.put(ch, charsNum.getOrDefault(ch, 0) + 1);
            }

            for (Map.Entry<String, Integer> entry : charsNum.entrySet()) {
                System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
