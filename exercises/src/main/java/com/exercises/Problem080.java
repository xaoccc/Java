package com.exercises;
import java.util.Scanner;
// Description:
// Help Annie by writing a program in which she enters the book she is looking for (text). 
// Until Annie finds her favorite book or checks out all the books in the library, the program should read 
// the name of each subsequent book (text) she checks out on a new line. The library is out of books when you get the text "No More Books".
// • If the book you are looking for is not found, print two lines:
// o "The book you search is not here!"
// o "You checked {number} books."
// • If she finds her book, print one line:
// o "You checked {number} books and found it."
// Solution:
public class Problem080 {

    public static void main(String[] args) {
        int booksCkecked = 0;        
        try (Scanner input = new Scanner(System.in)) {
            String favouriteBook = input.nextLine().trim();
            while (true) { 
                String book = input.nextLine().trim();
                if (favouriteBook.equals(book)) {
                    System.out.printf("You checked %d books and found it.", booksCkecked);
                    return;
                }
                if (book.equals("No More Books")) {
                    System.out.printf("The book you search is not here!\nYou checked %d books.", booksCkecked);
                    return;
                }
                booksCkecked++;
            }
        }
    }
}
