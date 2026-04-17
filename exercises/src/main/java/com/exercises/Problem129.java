package com.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Problem129 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String command = input.nextLine();
            Map<String, List<String>> forceData = new HashMap<>();
            Set<String> users = new HashSet<>();
            String side;
            String user;
            while (!command.equals("Lumpawaroo")) {
                if (command.split(" \\| ").length == 2) {
                    String[] commandList = command.split(" | ");
                    user = commandList[2];
                    side = commandList[0];
                    if (!users.contains(user)) {
                        if (forceData.get(side) == null) {
                            List<String> newUser = new ArrayList<>();
                            newUser.add(user);
                            forceData.put(side, newUser);
                        } else {
                            forceData.get(side).add(user);
                        }
                    }
                    users.add(user);

                } else if (command.split(" -> ").length == 2) {
                    String[] commandList = command.split(" -> ");
                    user = commandList[0];
                    side = commandList[1];
                    // We make sure this user is not in several sides
                    if (users.contains(user)) {
                        for (Map.Entry<String, List<String>> entry : forceData.entrySet()) {
                            if (entry.getValue().contains(user)) {
                                entry.getValue().remove(user);
                                if (entry.getValue().isEmpty()) {
                                    forceData.remove(entry.getKey());
                                }
                            }
                        }
                    }

                    // Then we add the user to the new side
                    if (forceData.get(side) == null) {
                        List<String> newUser = new ArrayList<>();
                        newUser.add(user);
                        forceData.put(side, newUser);
                    } else {
                        forceData.get(side).add(user);
                    }
                    System.out.printf("%s joins the %s side!\n", user, side);

                } else {
                    System.out.println("Invalid command!\n");
                }
                command = input.nextLine();
            }

            for (Map.Entry<String, List<String>> entry : forceData.entrySet()) {
                System.out.printf("Side: %s, Members: %d\n", entry.getKey(), entry.getValue().size());
                for (String u : entry.getValue()) {
                    System.out.printf("! %s\n", u);
                }
            }
        }
    }
}
