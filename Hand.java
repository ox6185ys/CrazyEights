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
        System.out.println("Hand is ");
        for (Card myCard : cards){
            System.out.println(myCard.toString());
        }

    }
    public boolean hasCard(Card checkCard){

        return cards.contains(checkCard);
    }
    //equals method -- compare facevalue/suit of car1 to facevalue/suit of card2
    //2hearts, 3jacks
    //@0x2345, @0x4569

    //2hearts
    //@0x10000


}

//fill out the remaining cards in the deck.
//