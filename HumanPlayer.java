package com.patrick;
import java.util.Scanner;
/**
 * Created by Patrick on 3/27/2016.
 */
public class HumanPlayer extends Player {
public Card throwCard(Card dealtCard) {
    newHand.showHand();
    Scanner scanner = new Scanner(System.in);
    System.out.println("What's card do you want to play? ");
    String inputCard = scanner.next();
    return null;
    }
}