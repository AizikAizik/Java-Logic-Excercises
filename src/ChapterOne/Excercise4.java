/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterOne;

import java.util.Scanner;

/**
 *
 * @author Isaac Ogunleye
 */

/**
 * Write a java Application that collects a length from a user and prints the
 * length of # in a multidimensional Array e.g if the user enters a length of 2
 * then the output should look like this
 * ## 
 * ##
 */

//Main Class
public class Excercise4 {

    // Main Method
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating Scanner Class Object
        System.out.println("Enter the length of # tags that should be printed here: ");
        System.out.print("Enter number of rows: ");//prompt the user for number of rows
        int row = input.nextInt(); // stores no of row value
        System.out.print("Enter number of columns: "); // prompt the user for number of columns
        int col = input.nextInt(); // store number of columns

        String printArray[][] = new String[row][col];// Creating multi-dimensional array of size row and col values
        //Outer for loop
        for (String[] printArray1 : printArray) {
            //Inner for loop
            for (int j = 0; j < printArray1.length; j++) {
                //String[] strings = printArray[j];
                printArray1[j] = "#";
                System.out.printf("%s ", printArray1[j]);
            } // end of Inner loop
            System.out.println(); // prints a new line after Inner iteration is successful
        } // end of Outer for loop

    } // end of Main Method
    
} // end of Main class
