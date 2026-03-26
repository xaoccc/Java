package com.projects.war;
import java.util.ArrayList;
import java.util.Collections;
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


            while (!deck1.isEmpty() && !deck2.isEmpty()) {

                Card cardPlayerOne = deck1.remove(0);
                Card cardPlayerTwo = deck2.remove(0);

                System.out.printf("%s played %s of %s\n", player1, cardPlayerOne.rank, cardPlayerOne.suit);
                System.out.printf("%s played %s of %s\n", player2, cardPlayerTwo.rank, cardPlayerTwo.suit);

                if (cardPlayerOne.strength < cardPlayerTwo.strength) {

                    // Add both cards to the bottom ot deck two
                    deck2.add(cardPlayerTwo);
                    deck2.add(cardPlayerOne);
                    System.out.printf("%s wins the hand!\n", player2);

                } else if (cardPlayerOne.strength > cardPlayerTwo.strength) {
                    // Add both cards to the bottom ot deck two
                    deck1.add(cardPlayerTwo);
                    deck1.add(cardPlayerOne);
                    System.out.printf("%s wins the hand!\n", player1);

                } else {
                    List<Card> warPile = new ArrayList<>();

                    // Add the initial tied cards too!
                    warPile.add(cardPlayerOne);
                    warPile.add(cardPlayerTwo);

                    while (true) {

                        if (deck1.size() < 3 || deck2.size() < 3) {
                            System.out.printf("%s wins the game!", deck1.size() < 3 ? player2 : player1);
                            return;
                        }

                        int strengthPlayerOne = 0;
                        int strengthPlayerTwo = 0;

                        for (int i = 0; i < 3; i++) {
                            Card c1 = deck1.remove(0);
                            Card c2 = deck2.remove(0);

                            strengthPlayerOne += c1.strength;
                            strengthPlayerTwo += c2.strength;

                            warPile.add(c1);
                            warPile.add(c2);
                        }

                        if (strengthPlayerOne > strengthPlayerTwo) {
                            System.out.printf("%s wins the war!\n", player1);
                            Collections.shuffle(warPile);
                            deck1.addAll(warPile);
                            break;
                        } else if (strengthPlayerOne < strengthPlayerTwo) {
                            System.out.printf("%s wins the war!\n", player2);
                            Collections.shuffle(warPile);
                            deck2.addAll(warPile);
                            break;
                        } else {
                            System.out.println("WAR AGAIN!");
                        }
                    }
                }

                System.out.println(deck1.size());
                System.out.println(deck2.size());
                sleep(1);
            }
            System.out.printf("%s wins the game with %d cards left!", deck1.isEmpty() ? player2 : player1, deck1.isEmpty() ? deck2.size() : deck1.size());

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
