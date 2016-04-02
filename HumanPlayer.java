package com.patrick;
import java.lang.reflect.Array;
import java.util.Scanner;
/**
 * Created by Patrick on 3/27/2016.
 */
public class HumanPlayer extends Player {
public Card throwCard(Card dealtCard) {
    newHand.showHand();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Which card do you want to play?  Enter like this 1,2 ");
    System.out.println("1 =" + Card.club+", " + "2 ="+Card.diamond+", "+"3 = "
            +Card.spade+", "+"4 = "+Card.heart);

    String inputCard = scanner.next();
    String words[] = inputCard.split(",");
    String firstWord = words[0];
    String secondWord = words[1];
    Card throwCard = new Card(firstWord,secondWord);
    System.out.println(throwCard.toString());
    if (!newHand.hasCard(throwCard))
        System.out.println("Card not in the hand.");
        return null;
    }
}