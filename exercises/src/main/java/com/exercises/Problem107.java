package com.exercises;
import java.util.ArrayList;
import java.util.Scanner;

// You are a mad scientist, and you have decided to play with electron distribution among atom shells. The basic idea of electron distribution is that electrons should fill a shell until it holds the maximum number of electrons. You will receive a single integer - the number of electrons. Your task is to fill shells until there are no more electrons left. The rules for electron distribution are as follows:
// The maximum number of electrons in a shell can be 2 * n ^ 2, where n is the position of a shell (starting from 1). For example, the maximum number of electrons in the 3rd shield can be 2*32 = 18.
// You should start filling the shells from the first one at the first position.
// If the electrons are enough to fill the first shell, the left unoccupied electrons should fill the following shell and so on. In the end, print a list with the filled shells.

public class Problem107 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            int electronsNum = input.nextInt();
            int n = 1;
            ArrayList<Integer> shellList = new ArrayList<>();
            while (electronsNum > 0) {
                int shellNum = 2 * (int) Math.pow(n, 2);

                if (shellNum <= electronsNum) {
                    shellList.add(shellNum);
                    electronsNum -= shellNum;
                } else {
                    shellList.add(shellNum - electronsNum);
                    electronsNum = 0;
                }
                n += 1;               

            }
            System.out.println(shellList);
            
        }
    }
}

