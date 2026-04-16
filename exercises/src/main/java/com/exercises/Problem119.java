package com.exercises;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
// Write a program that keeps the information about courses. Each course has a name and registered students.
// You will be receiving a course name and a student name until you receive the command "end".
// You should register each user into the corresponding course. If the given course does not exist, add it.
// When you receive the command "end", print the courses with their names and total registered users. For each course, print the registered users.

// Input
// Until the "end" command is received, you will be receiving input lines in the format: "{course_name} : {student_name}"
// The product data is always delimited by " : "
// Output
// Print the information about each course in the following format: "{course_name}: {registered_students}"
// Print the information about each student in the following format: "-- {student_name}"
public class Problem119 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String[] command = input.nextLine().split(" : ");
            Map<String, List<String>> courseData = new TreeMap<>();
            while (!command[0].equals("end")) {
                List<String> productData;
                if (courseData.get(command[0]) != null) {
                    productData = courseData.get(command[0]);
                } else {
                    productData = new ArrayList<>();
                }
                productData.add(command[1]);
                courseData.put(command[0], productData);
                command = input.nextLine().split(" : ");
            }

            for (Map.Entry<String, List<String>> entry : courseData.entrySet()) {
                System.out.printf("%s: %d\n", entry.getKey(), entry.getValue().size());
                for (String student : entry.getValue()) {
                    System.out.printf("-- %s\n", student);
                }
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}

