/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrayasssignment;

/**
 *
 * @author NWilber2026
 */

//------------------------------------------------------------------------------
//Instructions:
/* Write out an initialized array "weekDays" with all 7 days of the week. Print the 
days of the week out, one day per row. Now resize the array to 5, and copy just 
the weekdays (so not Saturday or Sunday) to it, and print the days again, one day 
per row. Comment your code where you are resizing it. For an extra bonus point, 
add a shuffling method, to change the order of the days randolmly. */
//------------------------------------------------------------------------------



//------------------------------------------------------------------------------
//Arrays Assignment Class starts
//------------------------------------------------------------------------------
public class ArrayAsssignment 
{

    public static void main(String[] args)
    {
    //Set up array with all 7 days of week    
        String[] weekDays = 
        {
        "  Sunday", "  Monday", "  Tuesday", "  Wednesday", "  Thursday", "  Friday", "  Saturday"
        };

        // Print all
        System.out.println("\nAll 7 days of the week:");
        printArray(weekDays);

    
    //Resize the array for only weekdays(5)   
        String[] weekDaysOnly = new String[5];        
        for (int i = 0; i < weekDaysOnly.length; i++)
        {
        weekDaysOnly[i] = weekDays[i + 1];
        }

        // Print all (Array-5)
        System.out.println("\nWeekdays only:");
        printArray(weekDaysOnly);
     
    //*BONUS*: Shuffle the weekdays (random)    
        randomArray(weekDays);
        
        //Print all
        System.out.println("\nShuffled days:");
        printArray(weekDays);
    }
     
    // Method to print each day on its own line
        public static void printArray(String[] array)
        {
            for (String day : array)
            {
            System.out.println(day);
            }
        }
    
    //Method for shuffle (bonus)
        public static void randomArray(String[] array)
        {
            for (int i = 0; i < array.length; i++)
            {
         int randomIndex = (int)(Math.random() * array.length);

            // Swap current element with random element
            String temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
            }
        }
}
