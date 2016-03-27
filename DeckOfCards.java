package com.patrick;

/**
 * Created by Patrick on 3/23/2016.
 */
public class DeckOfCards {
    private Card cards [] = {new Card(Card.ACE, Card.CLUBS),
    new Card(Card.ACE, Card.DIAMONDS),
    new Card(Card.ACE, Card.HEARTS),
    new Card(Card.ACE, Card.SPADES)
      // fill in the rest of face cards
    };

    private int index = 0;
    public DeckOfCards(){//Constructor
    }
    //int numbers[] = {1,2,3,4};
    public Card dealTopCard(){
        return cards[index++];
    }
    public void shuffle(){
        for ( int i = cards.length-1; i > 0; i-- ){
            int rand = (int)(Math.random())*(i+1);
            Card temp = cards[i];
            cards[i] = cards[rand];
            cards[rand] = temp;
        }
        //cardsUsed = 0;
    }
}