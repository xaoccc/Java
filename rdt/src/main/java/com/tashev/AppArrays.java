package com.tashev;

import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args) {
        // We can create an empty array
        byte nums[] = new byte[5];
        nums[0] = 43;
        nums[1] = 59;
        String text[] = new String[10];
        text[0] = "Pesho";

        // Or we can create a full array
        short moreNums[] = {12, 3, 65, 234, 12, 1, 16};

        // Create an empty matrix
        short matrix[][] = new short[3][5];
        matrix[2][3] = 12;

        // Create a full matrix
        short anotherMatrix[][] = {{12, 13, 15, 24}, {322, 456, 98, 71}};
        
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(text));
        System.out.println(Arrays.toString(moreNums));
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(anotherMatrix));
    }
}
