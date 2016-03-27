package com.patrick;

/**
 * Created by Patrick on 3/26/2016.
 */
public class Card {
    private int faceValue;
    private int suit;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 1;

    public static final int CLUBS = 1;
    public static final int DIAMONDS = 2;
    public static final int SPADES = 3;
    public static final int HEARTS = 4;


    public Card(int faceValue, int suit){
        this.faceValue = faceValue;
        this.suit = suit;

    }
    public String toString(){
        return (Integer.toString(faceValue)+","+Integer.toString(suit));
    }
//tostring
   //Card jackOFSpaces.showCard();  used in static
    //Card.showCard()
    //new Card(Card.JACK, Card.SPADES);
}