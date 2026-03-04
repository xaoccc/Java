package com.exercises;
// Description:
// Print to the console the multiplication table for the numbers 1 to 10 in the format:
// "{first factor} * {second factor} = {result}".
// Solution:
public class Problem088 {
    public static void main(String[] args) {
        for(int i=1; i < 11; i++){
            for (int j = 1; j < 11; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i*j);
            }
        }
    }
}
