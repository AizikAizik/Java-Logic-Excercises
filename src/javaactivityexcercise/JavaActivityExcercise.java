/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaactivityexcercise;

import java.util.Scanner;

/**
 *
 * @author Isaac Ogunleye
 */

public class JavaActivityExcercise {

    static int number;
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        //Prompt the user for input 
        System.out.println("Enter a number to determine if its a prime Number");
        number = input.nextInt(); // gets the users input
        int divisor = number /2;
        
        for (int i = 1; i < divisor ; i++) {
          
        }
        
    }
    
}
