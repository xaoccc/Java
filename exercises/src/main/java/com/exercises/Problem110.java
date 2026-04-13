package com.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Problem110 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            List<String> message = new ArrayList<>(Arrays.asList(input.nextLine().trim().split(" ")));
            String command = input.nextLine().trim();
            while (!command.equals("3:1")) {
                String[] newCommand = command.split(" ");
                if (newCommand[0].equals("merge")) {
                    int startIndex = Integer.parseInt(newCommand[1]);
                    int endIndex = Integer.parseInt(newCommand[2]);
                    if (endIndex >= message.size()) {
                        endIndex = message.size() - 1;
                    }
                    if (startIndex >= message.size()) {
                        command = input.nextLine().trim();
                        continue;
                    }
                    if (startIndex < 0) {
                        startIndex = 0;
                    }
                    if (message.size() > 1) {
                        StringBuilder merged = new StringBuilder();
                        for (int i = startIndex; i <= endIndex; i++) {
                            merged.append(message.get(i));
                        }

                        message.set(startIndex, merged.toString());

                        for (int i = endIndex; i > startIndex; i--) {
                            message.remove(i);
                        }

                    } else {
                        System.out.println("Too few elements to merge!");
                    }
                } else if (newCommand[0].equals("divide")) {
                    int elementIndex = Integer.parseInt(newCommand[1]);
                    int pieces = Integer.parseInt(newCommand[2]);
                    if (elementIndex < message.size()) {
                        int pieceSize = message.get(elementIndex).length() / pieces;
                        ArrayList<String> divided = new ArrayList<>();
                        ArrayList<String> list1 = new ArrayList<>(message.subList(0, elementIndex));                       


                        for (int i = 0; i < message.get(elementIndex).length(); i += pieceSize) {
                            if (i == pieces) {
                                divided.add(message.get(elementIndex).substring(i, message.get(elementIndex).length()));
                                break;
                            }

                            divided.add(message.get(elementIndex).substring(i, i + pieceSize));

                        }
                        message.remove(elementIndex);
                        list1.addAll(divided);
                        if (elementIndex + 1 < message.size()) {
                            ArrayList<String> list2 = new ArrayList<>(message.subList(elementIndex + 1, message.size()));
                            list1.addAll(list2);
                        }
                        message = list1;

                    }

                } else {
                    System.out.println("Invalid command!");
                }

                command = input.nextLine().trim();
            }
            System.out.println(String.join(" ", message));

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }

}
