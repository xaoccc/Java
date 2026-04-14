package com.exercises;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
// You will be receiving names of students, their ID, and a course of programming they have taken in the format "{name}:{ID}:{course}". 
// On the last line, you will receive a name of a course in snake case lowercase letters. You should print only the information of 
// the students who have taken the corresponding course in the format: "{name} - {ID}" on separate lines.
// Note: each student's ID will always be unique

public class Problem123 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> studentsData = new HashMap<>();
        try (Scanner input = new Scanner(System.in)) {
            String[] command = input.nextLine().split(":");           
            
            while(!(command.length == 1)) {
                ArrayList<String> list = new ArrayList<>();
                list.add(command[1]);
                list.add(command[2]);
                studentsData.put(command[0], list);
                command = input.nextLine().split(":");
            }

            for(Map.Entry<String, ArrayList<String>> entry : studentsData.entrySet()) {
                if (entry.getValue().get(1).equals(command[0])) {
                    System.out.printf("%s - %s\n", entry.getKey(), entry.getValue().get(0));
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
