package com.exercises;
import java.util.Scanner;
// Your task is to write a program that calculates the percentage of tickets sold for each type of ticket: student, standard, and kid, for all screenings. 
// You also need to calculate what percentage of the theater is full for each screening.
// Input
// The input is a sequence of integers and text:
// • On the first line until the command "Finish" is received - movie name - text
// • On the second line - the number of free seats in the theater for each screening - integer [1 ... 100]
// • For each movie, one line is read until the number of free seats in the theater is exhausted or until the command "End" is received:
// o The type of ticket purchased - text ("student", "standard", "kid")
// Output
// The following lines should be printed to the console:
// • After each movie, print what percentage of the theater is full
// "{movie name} - {percentage of theater occupancy}% full."
// • When receiving the "Finish" command, print four lines:
// o "Total tickets: {total number of tickets purchased for all movies}"
// o "{percentage of student tickets}% student tickets."
// o "{percentage of standard tickets}% standard tickets."
// o "{percentage of children's tickets}% kids tickets."
// Solution:
public class Problem099 {
    public static void main(String[] args) {
        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;
        
        
        try (Scanner input = new Scanner(System.in)) {
            String command = input.nextLine();
            while (!command.equals("Finish")) {
                int seatsNum = Integer.parseInt(input.nextLine());
                int ticketsBought = 0;
                for (int i=0; i<seatsNum; i++) {
                    String type = input.nextLine();
                    if (type.equals("End")) {                        
                        break;
                    }
                    ticketsBought++;
                    switch (type) {
                        case "student":   
                            studentTickets++;                         
                            break;
                        case "standard":  
                            standardTickets++;                          
                            break;
                        case "kid": 
                            kidTickets++;                           
                            break;
                        default:
                            break;
                    }                    
                }
                System.out.printf("%s - %.2f%% full.\n", command, ((double) ticketsBought / seatsNum) * 100);
                command = input.nextLine();
            }
            int totalTickets = studentTickets + standardTickets + kidTickets;
            System.out.printf("Total tickets: %d\n", totalTickets);
            System.out.printf("%.2f%% student tickets.\n", (double) studentTickets / totalTickets * 100);
            System.out.printf("%.2f%% standard tickets.\n", (double) standardTickets / totalTickets * 100);
            System.out.printf("%.2f%% kids tickets.\n", (double) kidTickets / totalTickets * 100);
        }
    }
}
