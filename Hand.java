package com.patrick;

import java.util.ArrayList;

/**
 * Created by Patrick on 3/26/2016.
 */
public class Hand {
    private ArrayList <Card> cards = new ArrayList<Card>();
    public Hand(){
    }
    //add card remove card
    public void addCard(Card drawCard){
        cards.add(drawCard);
    }
    public void removeCard(Card throwCard){
        cards.remove(throwCard);
    }
    public void showHand(){
        for (Card myCard : cards){
            System.out.println("My Hand is " + myCard.toString());
        }
    }
}