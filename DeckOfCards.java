package com.patrick;
import java.util.Random;
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

    new Card(2, Card.DIAMONDS),
    new Card(2, Card.HEARTS),
    new Card(2, Card.SPADES),
    new Card(2, Card.CLUBS),

    new Card(3, Card.DIAMONDS),
    new Card(3, Card.HEARTS),
    new Card(3, Card.SPADES),
    new Card(3, Card.CLUBS),

    new Card(4, Card.DIAMONDS),
    new Card(4, Card.HEARTS),
    new Card(4, Card.SPADES),
    new Card(4, Card.CLUBS),

    new Card(5, Card.DIAMONDS),
    new Card(5, Card.HEARTS),
    new Card(5, Card.SPADES),
    new Card(5, Card.CLUBS),

    new Card(6, Card.DIAMONDS),
    new Card(6, Card.HEARTS),
    new Card(6, Card.SPADES),
    new Card(6, Card.CLUBS),

    new Card(7, Card.DIAMONDS),
    new Card(7, Card.HEARTS),
    new Card(7, Card.SPADES),
    new Card(7, Card.CLUBS),

    new Card(8, Card.DIAMONDS),
    new Card(8, Card.HEARTS),
    new Card(8, Card.SPADES),
    new Card(8, Card.CLUBS),

    new Card(9, Card.DIAMONDS),
    new Card(9, Card.HEARTS),
    new Card(9, Card.SPADES),
    new Card(9, Card.CLUBS),

    new Card(10, Card.DIAMONDS),
    new Card(10, Card.HEARTS),
    new Card(10, Card.SPADES),
    new Card(10, Card.CLUBS),
            
//rest of cards to add
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
    //System.nanoTime()
    //Random rand = new Random(System.currentTimeMillis());
    public void shuffle(){
        Random randObject = new Random(System.currentTimeMillis());
        for ( int i = cards.length-1; i > 0; i-- ){
            int rand = randObject.nextInt(cards.length);
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