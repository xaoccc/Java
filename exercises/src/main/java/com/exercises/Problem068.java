package com.exercises;
import java.util.Scanner;
// Description:
// A company boss notices that more and more employees are spending time on sites that distract them.
// To prevent this, he introduces surprise checks on the open tabs of his employees' browsers.
// Depending on the open site in the tab, the following fines are imposed:
// • "Facebook" -> 150 BGN
// • "Instagram" -> 100 BGN
// • "Reddit" -> 50 BGN
// Two lines are read from the console:
// • Number of open tabs in the browser n - integer in the interval [1...10]
// • Salary - number in the interval [500...1500]
// Then n - the number of times the website name is read - text
// Solution:
public class Problem068 {
    public static void main(String[] args) {  
        int FACEBOOK_FINE = 150;      
        int INSTAGRAM_FINE = 100;      
        int REDDIT_FINE = 50;      
        try(Scanner input = new Scanner(System.in)) {
            int tabs = input.nextInt();
            int salary = input.nextInt();
            String tab;
            for (int i = 0; i < tabs; i++) {
                tab = input.next();
                switch (tab) {
                    case "Facebook":
                        salary -= FACEBOOK_FINE;                        
                        break;
                    case "Instagram":
                        salary -= INSTAGRAM_FINE;
                        break;
                    case "Reddit":
                        salary -= REDDIT_FINE;
                        break;
                    default:
                        break;
                }
                if (salary <= 0) {
                    System.out.println("You have lost your salary.");
                    return;
                }
            }
            System.out.println(salary);            
        }
    }
}

