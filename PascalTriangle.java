/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pascaltriangle;

//------------------------------------------------------------------------------
//Imports:
import java.util.Scanner;
//------------------------------------------------------------------------------

/**
@author NWilber2026
**/

//------------------------------------------------------------------------------
//Pascal Triangle Class starts
//------------------------------------------------------------------------------
public class PascalTriangle 
{

    //Set up recursion
    public static int pascalTriangle(int r, int c) 
    {
        //Base Case (stop condition)
        if (c == 0 || c == r)
        {
            //Limit will be 1
            return 1; 
        }
    
        //Recursion call
        return pascalTriangle(r - 1 , c - 1) + pascalTriangle(r - 1, c);
    }
    
       
    //Print "Nth" row
    public static void printRow(int oneRow)
    {
        //Label
        System.out.print("Row " + oneRow + ": ");
        
        //One Row Condition
        for (int l = 0; l <= oneRow; l++) 
        {System.out.printf("%4d", pascalTriangle(oneRow, l));}
        
        //Print
        System.out.println();
    }

    //Ask and Display for user
    public static void main(String[] args)
    {
        //Declare scanner
        Scanner scan = new Scanner(System.in);
        
        //Ask User
        System.out.println("\nWhat row of the triangle do you want?: ");
        int user1 = scan.nextInt();
        
        //Print Final
        printRow(user1);
    }
}
