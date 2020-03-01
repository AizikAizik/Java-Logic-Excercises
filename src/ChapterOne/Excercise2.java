/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterOne;

/**
 *
 * @author Isaac Ogunleye
 */

/*
Write a java Program to display the following numeric Pattern
12345
1234
123
12
1
 */

//Main Class
public class Excercise2 {

    //Main Method
    public static void main(String[] args) {
        int limit = 5;// limit number to be printed
        for (int i = 0; i < 5; i++) { // number of rows the iteration will take place
            // inner  for loop
            for (int j = 1; j <= limit; j++) {
                System.out.print(j);// print the numbers stored in the current limit variable
            }
            limit = --limit; // reduce limit value by 1 i.e pre-decrement
            System.out.println(); // print a new line after inner for loop iteration
            
        } //end of outer for loop
        
    }// end of Main Method

}// end of Main Class
