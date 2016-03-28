package com.patrick;
/**
 * Created by Patrick on 3/23/2016.
 */
public class DeckOfCards {
    private Card cards [] =
    {new Card(Card.ACE, Card.CLUBS),
    new Card(Card.ACE, Card.DIAMONDS),
    new Card(Card.ACE, Card.HEARTS),
    new Card(Card.ACE, Card.SPADES),

    new Card(Card.KING, Card.DIAMONDS),
    new Card(Card.KING, Card.HEARTS),
    new Card(Card.KING, Card.SPADES),
    new Card(Card.KING, Card.CLUBS),

    new Card(Card.QUEEN, Card.DIAMONDS),
    new Card(Card.QUEEN, Card.HEARTS),
    new Card(Card.QUEEN, Card.SPADES),
    new Card(Card.QUEEN, Card.CLUBS),

    new Card(Card.JACK, Card.DIAMONDS),
    new Card(Card.JACK, Card.HEARTS),
    new Card(Card.JACK, Card.SPADES),
    new Card(Card.JACK, Card.CLUBS),
    };

    private int index = 0;
    public DeckOfCards(){//This is a constructor
    }
    //int numbers[] = {1,2,3,4}; populates an array
    public Card dealTopCard(){
        if (index == cards.length){
            shuffle();
            index = 0;
        }
        return cards[index++];
    }
    public void shuffle(){
        for ( int i = cards.length-1; i > 0; i-- ){
            int rand = (int)(Math.random())*(i+1);
            Card temp = cards[i];
            cards[i] = cards[rand];
            cards[rand] = temp;
        }
    }
    //This makes a new hand
    public Hand createHand(){
    Hand newHand = new Hand();//New Hand object w/ constructor.
        for (int i = 0; i < 8; i++){
            Card newCard = dealTopCard();
            newHand.addCard(newCard);
        }
        return newHand;
    }
}