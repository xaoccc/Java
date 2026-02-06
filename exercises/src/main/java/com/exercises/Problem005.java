package com.exercises;
import java.util.Scanner;
// Description:
// Greet by name.
// Solution:
public class Problem005 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.printf("Hello, %s!", name);
        input.close();
    }
}
