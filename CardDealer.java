/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carddealer;

//------------------------------------------------------------------------------
//Imports:
import java.util.Random;
//------------------------------------------------------------------------------


//------------------------------------------------------------------------------
/* Directions: Write a 2D String array called deckOfCards. This will have 4 arrays, 
each of length 13. Fill the 4 arrays with the 4 suits of playing cards, from Ace 
to King (1 to 13). Shuffle the deck, and deal out 4 hands of 5 cards from this 2D 
array (no dealing the same card twice). Show the hands (Diamonds, Hearts, Clubs, 
Spades). */
//------------------------------------------------------------------------------

/**
 * @author NWilber2026
 */

//------------------------------------------------------------------------------
//CardDealer Class Starts
//------------------------------------------------------------------------------
public class CardDealer {
    
    public static void main(String[] args) 
    {
        
        //2D array (4 suits, 13 ranks)------------------------------------------
            String[][] deckOfCards = new String[4][13];
            String[] suits = {"Diamonds", "Hearts", "Clubs", "Spades"};
            String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        //"For" loops to full each (52) slot with a value
            for (int row = 0; row < deckOfCards.length; row++) //"For" loop (rows)
            {
                for (int column = 0; column < deckOfCards[row].length; column++)    //"For" loop (columns)
                {
                    deckOfCards[row][column] = ranks[column] + " of " + suits[row];    //Layout of print
                }
            }

        //Shuffle the deck------------------------------------------------------                    
            Random rand = new Random(); //Declare Random
        
            for (int row = 0; row < 4; row++) 
            {
                for (int column = 0; column < 13; column++) 
                {
                    int randomRow = rand.nextInt(4);    //Random suit
                    int randomColumn = rand.nextInt(13);   //Random column
                
                    //Swap (moves each card at least once)
                    String temp = deckOfCards[row][column];
                    deckOfCards[row][column] = deckOfCards[randomRow][randomColumn];
                    deckOfCards[randomRow][randomColumn] = temp;
                }
            }

        //Deal 4 hands of 5 cards-----------------------------------------------        
            int cardsDealt = 0; //initalize at 0
            for (int hand = 1; hand <= 4; hand++)   //runs 4 times
            {
                System.out.println("\nHand " + hand + ":");
                for (int i = 0; i < 5; i++)    //gives 5 cards to each run (hand)
                {
                    // Calculate current row and column based on total cards dealt
                    int row = cardsDealt / 13;
                    int column = cardsDealt % 13;
                
                    System.out.println(" - " + deckOfCards[row][column]);    //card print format
                    cardsDealt++;    //add 1 for rollover of next run
                }                
            }
    }
}
