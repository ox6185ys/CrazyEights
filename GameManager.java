package com.patrick;

/**
 * Created by Patrick on 3/27/2016.
 */
public class GameManager {
    public void start(){


        DeckOfCards currentDeck = new DeckOfCards();
        currentDeck.shuffle();

        HumanPlayer firstPlayer = new HumanPlayer();
        firstPlayer.setNameOfPlayer("Pat");

        ComputerPlayer autoPlay = new ComputerPlayer();
        autoPlay.setNameOfPlayer("Mac");

        Hand newHand = currentDeck.createHand();
        firstPlayer.setNewHand(newHand);

        Hand autoHand = currentDeck.createHand();
        autoPlay.setNewHand(autoHand);
        Card card = currentDeck.dealTopCard();
        firstPlayer.throwCard(card);
/*
        Hand compHand = autoPlay.getHand();
        compHand.showHand()*/;
    }
}