package com.exercises;
import java.util.Scanner;
// Description:
// Write a program that prints the room numbers in a building (in descending order) to the console, provided that the following conditions are met:
// • Every even-numbered floor has only offices
// • Every odd-numbered floor has only apartments
// • Every apartment is denoted as follows: A{floor number}{apartment number}, apartment numbers start at 0.
// • Every office is denoted as follows: O{floor number}{office number}, office numbers also start at 0.
// • There are always apartments on the top floor and they are larger than the others, which is why their numbers are preceded by 'L' instead of 'A'. If there is only one floor, then there are only large apartments!
// Two integers are read from the console - the number of floors and the number of rooms per floor.
// Solution:
public class Problem093 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int floors = input.nextInt();
            int rooms = input.nextInt();
            for (int i=floors; i>0; i--) {
                for (int j=0; j<rooms; j++) {
                    if (i==floors) {
                        System.out.printf("L%d%d", i, j);
                    }
                    else if (i%2==0) {
                        System.out.printf("O%d%d", i, j);
                    } else {
                        System.out.printf("A%d%d", i, j);
                    }
                    if (j < rooms-1) {
                        System.out.print(" ");
                    }                    
                }
                System.out.print("\n");
            }
        }

    }
}

