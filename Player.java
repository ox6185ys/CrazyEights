package com.patrick;
/**
 * Created by Patrick on 3/26/2016.
 */
public abstract class Player {
    protected String nameOfPlayer;
    protected Hand newHand;

    public String getNameOfPlayer(){
        return nameOfPlayer;
    }
    public Hand getHand(){
        return newHand;
    }
    public void setNameOfPlayer(String nameOfPlayer){
        this.nameOfPlayer = nameOfPlayer;
    }
    public void setNewHand(Hand newHand){
        this.newHand = newHand;
    }
    public abstract Card throwCard(Card dealtCard);


}