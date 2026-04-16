package com.exercises;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
// Write a program that keeps the information about companies and their employees.
// You will be receiving company names and an employees' id until you receive the command "End" command. Add each employee to the given company. Keep in mind that a company cannot have two employees with the same id.
// Print the company name and each employee's id in the following format:
// "{company_name}
// -- {id1}
// -- {id2}
// …
// -- {idN}"

public class Problem128 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            String[] command = input.nextLine().split(" -> ");
            HashMap<String, HashSet<String>> companyData = new HashMap<>();
            while(!command[0].equals("End")) {
                HashSet<String> ids = new HashSet<String>();
                if (companyData.containsKey(command[0])) {
                    ids = companyData.get(command[0]);
                }
                ids.add(command[1]);
                companyData.put(command[0], ids);
                command = input.nextLine().split(" -> ");
            }
            for(Map.Entry<String, HashSet<String>> entry : companyData.entrySet()) {
                System.out.printf("%s\n", entry.getKey());
                for (String id : entry.getValue()) {
                    System.out.printf("-- %s\n", id);
                }
            }
        }
    }
}
