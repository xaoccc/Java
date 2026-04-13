package com.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
// You are given a secret message you should decipher. To do that, you need to know that in each word:
// the second and the last letter are switched (e.g., Holle means Hello)
// the first letter is replaced by its character code (e.g., 72 means H)

public class Problem109 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            String[] message = input.nextLine().split(" ");
            String result = "";
            for (String word : message) {
                int lettersStartIndex;
                for (int i = 0; i < word.length(); i++) {
                    if (!Character.isDigit(word.charAt(i))) {
                        lettersStartIndex = i;
                       
                        String newWord = word.substring(lettersStartIndex, word.length());
                        if (newWord.length() > 1) {
                            newWord = String.valueOf(newWord.charAt(newWord.length() - 1)) + newWord.substring(1, newWord.length() - 1) + String.valueOf(newWord.charAt(0));
                        }

                        newWord = (char) Integer.parseInt(word.substring(0, lettersStartIndex)) + newWord;
                        result += newWord + " ";
                        break;
                    }
                }                
            }
            System.out.println(result.trim());
            
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
