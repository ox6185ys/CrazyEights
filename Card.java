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

    public static final char spade =9824;  //There are Unicode characters for playing card symbols
    public static final char club = 9827;
    public static final char heart =9829;
    public static final char diamond = 9830;

    public Card(String faceValueString, String suitString){
        this.faceValue = Integer.parseInt(faceValueString);
        this.suit = Integer.parseInt(suitString);
        //Jack =11.  switch stmnt convert 11 to Jack.
    }
    public Card(int faceValue, int suit){
        this.faceValue = faceValue;
        this.suit = suit;
    }
    public String toString(){
        char charSuit = ' ';
        switch (suit){
            case CLUBS:
                charSuit = club;
                break;
            case SPADES:
                charSuit = spade;
                break;
            case DIAMONDS:
                charSuit = diamond;
                break;
            case HEARTS:
                charSuit = heart;
        }
        String faceValueString = Integer.toString(faceValue);
        switch (faceValue){
            case JACK:
                faceValueString = "JACK";
                break;
            case QUEEN:
                faceValueString = "QUEEN";
                break;
            case KING:
                faceValueString = "KING";
                break;
            case ACE:
                faceValueString = "ACE";
                break;

        }


        return (faceValueString +","+ charSuit);


    }
//tostring
   //Card jackOFSpaces.showCard();  used in static
    //Card.showCard()
    //new Card(Card.JACK, Card.SPADES);
}