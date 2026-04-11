package com.exercises;

import java.util.Scanner;

public class Problem106 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            int rooms = Integer.parseInt(input.nextLine());
            int freeChairs = 0;
            boolean ok = true;
            for (int i=0; i< rooms; i++) {
                String[] room = input.nextLine().trim().split(" ");
                int visitors = Integer.parseInt(room[1]);
                if (visitors > room[0].length()) {
                    System.out.printf("%d more chairs needed in room %d", visitors - room[0].length(), i+ 1);
                    ok = false;
                } else {
                    freeChairs += 1;
                }
            }
            if (ok) {
                System.out.printf("Game On, %d free chairs left",  freeChairs);
            }
            
        }
    }
}
