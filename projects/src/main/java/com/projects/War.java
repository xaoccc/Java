package com.projects;

import java.util.Hashtable;

// Card game War
// Rules:
// You play against the computer. Choose a number, then it chooses a number, who starts first. 
// Each of you has 52 cards. On every turn you compare the cards. If anyone has a better card, he takes both cards, if they are equal, a war starts.
// A war each of you throws 3 cards. Whoever has bigger sum of cards, takes all thrown cards.
// Whoever takes all cards wins the game.
public class War {

    public static void main(String[] args) {
        Hashtable<String, Byte> deck = new Hashtable<>();
        for (byte i = 1; i < 5; i++) {
            if (i == 1) {
                for (byte j = 1; j < 14; j++) {
                    deck.put("Hearts-" + j, j);
                }
            }
            if (i == 2) {
                for (byte j = 1; j < 14; j++) {
                    deck.put("Diamonds-" + j, j);
                }
            }
            if (i == 3) {
                for (byte j = 1; j < 14; j++) {
                    deck.put("Clubs-" + j, j);
                }
            }
            if (i == 4) {
                for (byte j = 1; j < 14; j++) {
                    deck.put("Spades-" + j, j);
                }
            }

        }

        System.out.println(deck);

    }
}
