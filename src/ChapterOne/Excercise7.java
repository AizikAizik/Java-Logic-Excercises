/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterOne;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Isaac Ogunleye
 */

/*
Write an application that reads a line of text from the keyboard and prints a table indicating
the number of occurrences of each letter of the alphabet in the text. For example,
the phrase
To be, or not to be: that is the question:
contains one “a,” two “b’s,” no “c’s,” and so on.
 */
public class Excercise7 {

    public static void main(String[] args) {

        Test test = new Test();
        test.trying();
        Scanner input = new Scanner(System.in);

        //initialize all alphabet count to zero
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0, k = 0, l = 0, m = 0;
        int n = 0, o = 0, p = 0, q = 0, r = 0, s = 0, t = 0, u = 0, v = 0, w = 0, x = 0, y = 0, z = 0;

        //prompt the user to enter a sentence 
        System.out.println("Enter a Sentence Below");
        System.out.print("Enter sentence here: ");
        String sentence;
        sentence = input.nextLine();
        String[] splitSentence = sentence.split(""); //converts each alphabet in the sentence to an array

        System.out.println(Arrays.toString(splitSentence));

        System.out.println("Alphabet\t\tNo_Of_Occurence");

        for (String splitSentence1 : splitSentence) {
            if (splitSentence1.equalsIgnoreCase("a")) {
                a++;
            } else if (splitSentence1.equalsIgnoreCase("b")) {
                b++;
            } else if (splitSentence1.equalsIgnoreCase("c")) {
                c++;
            } else if (splitSentence1.equalsIgnoreCase("d")) {
                d++;
            } else if (splitSentence1.equalsIgnoreCase("e")) {
                e++;
            } else if (splitSentence1.equalsIgnoreCase("f")) {
                f++;
            } else if (splitSentence1.equalsIgnoreCase("g")) {
                g++;
            } else if (splitSentence1.equalsIgnoreCase("h")) {
                h++;
            } else if (splitSentence1.equalsIgnoreCase("i")) {
                i++;
            } else if (splitSentence1.equalsIgnoreCase("j")) {
                j++;
            } else if (splitSentence1.equalsIgnoreCase("k")) {
                k++;
            } else if (splitSentence1.equalsIgnoreCase("l")) {
                l++;
            } else if (splitSentence1.equalsIgnoreCase("m")) {
                m++;
            } else if (splitSentence1.equalsIgnoreCase("n")) {
                n++;
            } else if (splitSentence1.equalsIgnoreCase("o")) {
                o++;
            } else if (splitSentence1.equalsIgnoreCase("p")) {
                p++;
            } else if (splitSentence1.equalsIgnoreCase("q")) {
                q++;
            } else if (splitSentence1.equalsIgnoreCase("r")) {
                r++;
            } else if (splitSentence1.equalsIgnoreCase("s")) {
                s++;
            } else if (splitSentence1.equalsIgnoreCase("t")) {
                t++;
            } else if (splitSentence1.equalsIgnoreCase("u")) {
                u++;
            } else if (splitSentence1.equalsIgnoreCase("v")) {
                v++;
            } else if (splitSentence1.equalsIgnoreCase("w")) {
                w++;
            } else if (splitSentence1.equalsIgnoreCase("x")) {
                x++;
            } else if (splitSentence1.equalsIgnoreCase("y")) {
                y++;
            } else if (splitSentence1.equalsIgnoreCase("z")) {
                z++;
            }
        }
        
        //print out the result
        System.out.printf("%s %d %n", "A\t\t\t\t", a);
        System.out.printf("%s %d %n", "B\t\t\t\t", b);
        System.out.printf("%s %d %n", "C\t\t\t\t", c);
        System.out.printf("%s %d %n", "D\t\t\t\t", d);
        System.out.printf("%s %d %n", "E\t\t\t\t", e);
        System.out.printf("%s %d %n", "F\t\t\t\t", f);
        System.out.printf("%s %d %n", "G\t\t\t\t", g);
        System.out.printf("%s %d %n", "H\t\t\t\t", h);
        System.out.printf("%s %d %n", "I\t\t\t\t", i);
        System.out.printf("%s %d %n", "J\t\t\t\t", j);
        System.out.printf("%s %d %n", "K\t\t\t\t", k);
        System.out.printf("%s %d %n", "L\t\t\t\t", l);
        System.out.printf("%s %d %n", "M\t\t\t\t", m);
        System.out.printf("%s %d %n", "N\t\t\t\t", n);
        System.out.printf("%s %d %n", "O\t\t\t\t", o);
        System.out.printf("%s %d %n", "P\t\t\t\t", p);
        System.out.printf("%s %d %n", "Q\t\t\t\t", q);
        System.out.printf("%s %d %n", "R\t\t\t\t", r);
        System.out.printf("%s %d %n", "S\t\t\t\t", s);
        System.out.printf("%s %d %n", "T\t\t\t\t", t);
        System.out.printf("%s %d %n", "U\t\t\t\t", u);
        System.out.printf("%s %d %n", "V\t\t\t\t", v);
        System.out.printf("%s %d %n", "W\t\t\t\t", w);
        System.out.printf("%s %d %n", "X\t\t\t\t", x);
        System.out.printf("%s %d %n", "Y\t\t\t\t", y);
        System.out.printf("%s %d %n", "Z\t\t\t\t", z);

    }
}

//testing a logic out
class Test {

    //three dimensional Array
    public void trying() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 4; k++) {
                    System.out.print('*');
                }
                System.out.println();
            } // end inner for
            System.out.println();
        } // end outer for
    }
}
