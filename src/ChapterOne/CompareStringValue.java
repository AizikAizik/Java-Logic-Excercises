/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterOne;

import java.util.Arrays;

/**
 *
 * @author LENOVO
 */
public class CompareStringValue {

    static String result = "";

    public static String Comparison(String a, String b) {
        // first convert both strings to lower case
        String x = a.toLowerCase();
        String y = b.toLowerCase();

        // lets compare the second string against the first
        String str2[] = y.split("");
        int idx = 0;
        for (String ch : str2) {
            if (!ch.equals(x.charAt(idx))) {
                if (x.contains(ch)) {

                } else {
                    result += ch;
                }
            }
            idx++;
        }

        //lets compare the first against the second
        String str1[] = x.split("");

        int idx2 = 0;
        for (String ch : str1) {
            if (!ch.equals(y.charAt(idx2))) {
                if (y.contains(ch)) {

                } else {
                    result += ch;
                }
            }
            idx2++;
        }

        return result;

    }

    public static void main(String[] args) {

        System.out.println(Comparison("Under", "Tune"));
        
    }

}
