package com.exercises;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // resource is opened inside try()
        try (FileOutputStream output = new FileOutputStream("testfile.txt")) {
            output.write("This file was created with Java and a bit of magic.".getBytes());
            // no need to call close() here
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }

}
