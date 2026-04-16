package com.exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem118 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // LinkedHashMap keeps the order of insertion, so we use this instead of HashMap
            Map<String, String> db = new LinkedHashMap<>();
            int commandsNum = Integer.parseInt(input.nextLine());
            for (int i = 0; i < commandsNum; i++) {
                String[] command = input.nextLine().split(" ");
                if (command[0].equals("register")) {
                    if (db.containsKey(command[1])) {
                        System.out.printf("ERROR: already registered with plate number %s\n", db.get(command[1]));
                    } else {
                        db.put(command[1], command[2]);
                        System.out.printf("%s registered %s successfully\n", command[1], command[2]);
                    }
                } else if (command[0].equals("unregister")) {
                    if (db.containsKey(command[1])) {
                        db.remove(command[1]);
                        System.out.printf("%s unregistered successfully\n", command[1]);
                    } else {
                        System.out.printf("ERROR: user %s not found\n", command[1]);
                    }
                }
            }            

            for(Map.Entry<String, String> entry : db.entrySet()) {
                System.out.printf("%s -> %s\n", entry.getKey(), entry.getValue());
            }

        }
    }
}
