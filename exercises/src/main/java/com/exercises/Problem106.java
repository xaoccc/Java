package com.exercises;
import java.util.Scanner;
// You are a facility manager at a large business center. One of your responsibilities is to check if each conference room in the center has enough chairs for the visitors. 
// On the first line, you will be given an integer n representing the number of rooms in the business center. On the following n lines for each room, you will receive 
// information about the chairs in the room and the number of visitors. Each chair will be presented with the char "X". Next, there will be a single space and the number of 
// visitors at the end. For example: "XXXXX 4" (5 chairs and 4 visitors). Keep track of the free chairs: • If there are not enough chairs in a specific room, 
// print the following message: "{needed_chairs_in_room} more chairs needed in room {number_of_room}". 
// The rooms start from 1. • Otherwise, print: "Game On, {total_free_chairs} free chairs left".

public class Problem106 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Enter rooms number: ");
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
                    freeChairs += room[0].length() - visitors;
                }
            }
            if (ok) {
                System.out.printf("Game On, %d free chairs left",  freeChairs);
            }            
        }
    }
}
