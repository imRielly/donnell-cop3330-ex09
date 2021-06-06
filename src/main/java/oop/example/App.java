/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rielly Donnell
 */

package oop.example;

import java.util.Scanner;

/**
 Exercise 9 - Paint Calculator
 Sometimes you have to round up to the next number rather than follow standard rounding rules.

 Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width,
 and assume one gallon covers 350 square feet. Display the number of gallons needed to paint the
 ceiling as a whole number.

 Example Output
 You will need to purchase 2 gallons of paint to cover 360 square feet.
 Remember, you can’t buy a partial gallon of paint. You must
 round up to the next whole gallon.

 Constraints
 Use a constant to hold the conversion rate.
 Ensure that you round up to the next whole number.

 Challenges
 Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
 Implement support for a round room.
 Implement support for an L-shaped room.
 Implement a mobile version of this app so it can be used at the hardware store.
 */
public class App 
{
    public static void main( String[] args )
    {
        double const_FeetPerGallon = 350.0;

        Scanner in = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        int l = in.nextInt();
        System.out.print("What is the width of the room in feet? ");
        int w = in.nextInt();
        int areaF = calculateArea(l, w);
        int gallons = calculateGallonsToCover(areaF, const_FeetPerGallon);
        String output = String.format("You will need to purchase %s gallons of paint to cover %s square feet.\n" +
                "Remember, you can’t buy a partial gallon of paint. You must\n" +
                "round up to the next whole gallon.", gallons, areaF);
        System.out.println(output);
    }

    private static int calculateArea(int l, int w){
        return l * w;
    }

    private static int calculateGallonsToCover(int ft, double const_FeetPerGallon){
        return (int) Math.ceil(ft / const_FeetPerGallon);
    }
}
