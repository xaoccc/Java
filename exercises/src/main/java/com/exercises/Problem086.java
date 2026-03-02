package com.exercises;
import java.util.Scanner;
// On his eighteenth birthday, José decided to move out and live in an apartment. 
// He packed his belongings in boxes and found a suitable ad for an apartment for rent. He started moving his belongings 
// in parts because he couldn’t move them all at once. He had limited free space in his new home where he could arrange his 
// belongings so that the place would be suitable for living.
// Write a program that calculates the free volume of José’s home that remains after he moves his belongings.
// Note: A box has exact dimensions: 1m. x 1m. x 1m.
// The user enters the following data on separate lines:
// 1. Width of the free space - integer in the interval [1...1000]
// 2. Length of the free space - integer in the interval [1...1000]
// 3. Height of the free space - integer in the interval [1...1000]
// 4. On the following lines (until receiving the "Done" command) - number of boxes to be transported to the apartment - integer in the interval [1...10000]
// The program should finish reading data upon the "Done" command or if the free space runs out.

public class Problem086 {
    public static void main(String[] args) {         
        try (Scanner input = new Scanner(System.in)) {
            int width = input.nextInt();
            int lenght = input.nextInt();
            int height = input.nextInt();
            int size = width * lenght * height;
            String command = input.next();
            while (!command.equals("Done")) {
                size -= Integer.parseInt(command);
                if (size < 0) {
                    System.out.printf("No more free space! You need %d Cubic meters more.", -size);
                    return;
                }
                command = input.next();
            }
            System.out.printf("%d Cubic meters left.", size);
       
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }
}
