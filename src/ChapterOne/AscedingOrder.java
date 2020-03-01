/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterOne;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Isaac Ogunleye
 */

/*
EXCERCISE
Write a java aplication that takes 5 number from a user and displays the result in 
An ascending order i.e from lowest to highest
 */
public class AscedingOrder {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int fiveNum[] = new int[5];

        for (int i = 0; i < fiveNum.length; i++) {
            System.out.println("Enter number here:");
            fiveNum[i] = input.nextInt();
        }

        System.out.println("Here is the result in an ascending order");
        Arrays.sort(fiveNum);
        System.out.println(Arrays.toString(fiveNum));
        
    }

}
