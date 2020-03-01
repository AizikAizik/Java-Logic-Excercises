/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterOne;

import java.util.Random;

/**
 *
 * @author Isaac Ogunleye
 */

/*
Write an application that uses random-number generation to create
sentences. Use four arrays of strings called article, noun, verb and preposition. Create a sentence
by selecting a word at random from each array in the following order: article, noun, verb, preposition,
article and noun. As each word is picked, concatenate it to the previous words in the sentence.
The words should be separated by spaces. When the final sentence is output, it should start with a
capital letter and end with a period. The application should generate and display 20 sentences.
The article array should contain the articles "the", "a", "one", "some" and "any"; the noun
array should contain the nouns "boy", "girl", "dog", "town" and "car"; the verb array should contain
the verbs "drove", "jumped", "ran", "walked" and "skipped"; the preposition array should
contain the prepositions "to", "from", "over", "under" and "on".
 */
public class Excercise6 {

    public static void main(String[] args) {

        Random ran = new Random();

        String[] article = {"the", "a", "one", "some", "any"};

        String[] noun = {"boy", "girl", "dog", "town", "car"};

        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};

        String[] preposition = {"to", "from", "over", "under", "on"};

        String point = ".";

        for (int i = 0; i < 10; i++) {

            int rand = ran.nextInt(article.length);
            int rand2 = ran.nextInt(noun.length);
            int rand3 = ran.nextInt(verb.length);
            int rand4 = ran.nextInt(preposition.length);
            int rand5 = ran.nextInt(article.length);
            int rand6 = ran.nextInt(noun.length);

            System.out.println(article[rand].toUpperCase() + " " + noun[rand2] + " " + verb[rand3] + " "
                    + preposition[rand4] + " " + article[rand5] + " " + noun[rand6] + point);

            System.out.println();

        }
    }

}
