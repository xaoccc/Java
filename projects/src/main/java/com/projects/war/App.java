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

            while (!deck1.isEmpty() || !deck2.isEmpty()) {
                int cardPlayerOne = (int) (Math.random() * deck1.size());
                int cardPlayerTwo = (int) (Math.random() * deck2.size());
                System.out.println(cardPlayerOne);

                System.out.printf("%s played %s of %s\n", player1, deck1.get(cardPlayerOne).rank, deck1.get(cardPlayerOne).suit);
                System.out.printf("%s played %s of %s\n", player2, deck2.get(cardPlayerTwo).rank, deck2.get(cardPlayerTwo).suit);

                deck1.remove(cardPlayerOne);
                deck2.remove(cardPlayerTwo);

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
