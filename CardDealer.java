/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carddealer;

import java.util.Random;


/**
 *
 * @author NWilber2026
 */



public class CardDealer {
    public static void main(String[] args) {
        // 1. Initialize the 2D array: 4 suits (rows) and 13 ranks (columns)
        String[][] deckOfCards = new String[4][13];
        String[] suits = {"Diamonds", "Hearts", "Clubs", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // 2. Fill the deck with card names (e.g., "Ace of Spades")
        for (int row = 0; row < deckOfCards.length; row++) {
            for (int col = 0; col < deckOfCards[row].length; col++) {
                deckOfCards[row][col] = ranks[col] + " of " + suits[row];
            }
        }

        // 3. Shuffle the deck 
        // We swap each card with another random position in the 2D array
        Random rand = new Random();
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 13; col++) {
                int randomRow = rand.nextInt(4);
                int randomCol = rand.nextInt(13);
                
                // Classic swap logic
                String temp = deckOfCards[row][col];
                deckOfCards[row][col] = deckOfCards[randomRow][randomCol];
                deckOfCards[randomRow][randomCol] = temp;
            }
        }

        // 4. Deal 4 hands of 5 cards
        // Since the deck is shuffled, we can just take the first 20 cards sequentially
        int cardsDealt = 0;
        for (int hand = 1; hand <= 4; hand++) {
            System.out.println("Hand " + hand + ":");
            for (int i = 0; i < 5; i++) {
                // Calculate current row and column based on total cards dealt
                int row = cardsDealt / 13;
                int col = cardsDealt % 13;
                
                System.out.println(" - " + deckOfCards[row][col]);
                cardsDealt++;
            }
            System.out.println(); // Space between hands
        }
    }
}
