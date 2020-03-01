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
/*
Write a java Application that collects a letter from the user and checks whether the
letter is a consonant or a vowel.
 */
public class Excercise1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word to dtermine if it a consonant or vowel");
        System.out.print("Enter your word here: ");
        String choice;
        choice = input.next();

        if ((choice.equalsIgnoreCase("a"))
                || (choice.equalsIgnoreCase("e"))
                || (choice.equalsIgnoreCase("i"))
                || (choice.equalsIgnoreCase("o"))
                || (choice.equalsIgnoreCase("u"))) {
            System.out.println("The letter you entered is Vowel");
        } else {
            System.out.println("The letter you entered is a consonant");
        }
    }

}
