package com.projects.war;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Card game War
// Rules:
// You play against the computer. Choose a number, then it chooses a number, who starts first. 
// Each of you has 52 cards. On every turn you compare the cards. If anyone has a better card, he takes both cards, if they are equal, a war starts.
// A war each of you throws 3 cards. Whoever has bigger sum of cards, takes all thrown cards.
// Whoever takes all cards wins the game.

public class App {

    public static void main(String[] args) {
        play();
    }

    public static void play() {
        List<Card> deck = createDeck();
        List<Card> deck1 = new ArrayList<>();
        List<Card> deck2 = new ArrayList<>();
        int deckSize;
        int cardIndex;
        while (!deck.isEmpty()) {
            deckSize = deck.size();
            cardIndex = (int) (Math.random() * deckSize);
            deck1.add(deck.get(cardIndex));
            deck.remove(cardIndex);
            deckSize = deck.size();
            cardIndex = (int) (Math.random() * deckSize);
            deck2.add(deck.get(cardIndex));
            deck.remove(cardIndex);
        }

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Start game");
            sleep(3);

            System.out.print("Player 1 name: ");
            String player1 = input.nextLine();
            System.out.print("Player 2 name: ");
            String player2 = input.nextLine();
            int counterDeck1 = 0;
            int counterDeck2 = 0;

            while (!deck1.isEmpty() || !deck2.isEmpty()) {
                int indexCardPlayerOne = counterDeck1;
                int indexCardPlayerTwo = counterDeck2;

                // If one of the players have more cards and the counter of the other player reaches a moment where both have cards, 
                // but the counter hits the limit, we restart the counter:
                if (deck1.size() < counterDeck1) {
                    counterDeck1 = 0;
                }

                if (deck2.size() < counterDeck2) {
                    counterDeck2 = 0;
                }
               
                Card cardPlayerOne = deck1.get(indexCardPlayerOne);
                Card cardPlayerTwo = deck2.get(indexCardPlayerTwo);

                System.out.printf("%s played %s of %s\n", player1, cardPlayerOne.rank, cardPlayerOne.suit);
                System.out.printf("%s played %s of %s\n", player2, cardPlayerTwo.rank, cardPlayerTwo.suit);

                if (cardPlayerOne.strength < cardPlayerTwo.strength) { 
                    // Play both cards and remove from stack  
                    deck1.remove(cardPlayerOne);                 
                    deck2.remove(cardPlayerTwo);
                    // Add both cards to the bottom ot deck two
                    deck2.add(cardPlayerTwo);
                    deck2.add(cardPlayerOne);
                    System.out.printf("%s wins the hand!\n", player2);
                    
                } else if (cardPlayerOne.strength > cardPlayerTwo.strength) {
                    // Play both cards and remove from stack  
                    deck1.remove(cardPlayerOne);                 
                    deck2.remove(cardPlayerTwo);
                    // Add both cards to the bottom ot deck two
                    deck1.add(cardPlayerTwo);
                    deck1.add(cardPlayerOne);
                    System.out.printf("%s wins the hand!\n", player1);

                } else {
                    // TO DO...
                    System.out.println("WAR WAR WAR!!!!!!!!!");
                    sleep(10);
                }
                counterDeck1++;
                counterDeck2++;
                System.out.println(deck1.size());
                System.out.println(deck2.size());
            }

        }

    }

    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            System.out.println("not a valid time");
        }
    }

    public static List<Card> createDeck() {
        Deck deck = new Deck();
        deck.createDeck();
        List<Card> cards = deck.getCards();

        return cards;
    }
}
