package com.exercises;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
// Write a program, which keeps a dictionary with synonyms. The key of the dictionary will be the word. 
// The value will be a list of all the synonyms of that word. You will be given a number n – the count of the words. 
// After each term, you will be given a synonym, so the count of lines you should read from the console is 2 * n. 
// You will be receiving a word and a synonym each on a separate line like this:
// {word}
// {synonym} 
// If you get the same word twice, just add the new synonym to the list.


public class Problem126 {
    public static void main(String[] args) {        
        try (Scanner input = new Scanner(System.in)) {
            int pairs = Integer.parseInt(input.nextLine());
            HashMap<String, HashSet<String>> words= new HashMap<>();
            for (int i=0; i<pairs*2; i+=2) {
                String word = input.nextLine();
                String synonym = input.nextLine();
                HashSet<String> synonimus = words.getOrDefault(word, new HashSet<>());
                synonimus.add(synonym);
                words.put(word, synonimus);
            }
            System.out.println(words);


        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
