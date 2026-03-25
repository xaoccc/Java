package com.projects.war;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    static int DECK_SIZE = 13;
    static int SUIT_SIZE = 4;
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
    }

    public List<Card> getCards() {
        return cards;
    }

    public void createDeck() {
        for (int i = 0; i < DECK_SIZE; i++) {

            for (int j = 0; j < SUIT_SIZE; j++) {
                Card card = new Card();
                card.strength = i + 1;
                if (i < 9) {
                    card.rank = String.valueOf(i + 2);
                } else {
                    switch (i) {
                        case 9:
                            card.rank = "Jack";
                            break;
                        case 10:
                            card.rank = "Queen";
                            break;
                        case 11:
                            card.rank = "King";
                            break;
                        case 12:
                            card.rank = "Ace";
                            break;
                        default:
                            throw new AssertionError();
                    }
                }

                switch (j) {
                    case 0:
                        card.suit = "Spades";
                        break;
                    case 1:
                        card.suit = "Hearts";
                        break;
                    case 2:
                        card.suit = "Diamonds";
                        break;
                    case 3:
                        card.suit = "Clubs";
                        break;
                    default:
                        throw new AssertionError();

                }
                cards.add(card);

            }
            

        }

    }

}
