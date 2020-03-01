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
/**
 * (Perfect Numbers) An integer number is said to be a perfect number if its
 * factors, including 1 (but not the number itself), sum to the number. For
 * example, 6 is a perfect number, because 6 = 1 + 2 + 3. Write a method
 * isPerfect that determines whether parameter number is a perfect number. Use
 * this method in an application that displays all the perfect numbers between 1
 * and 1000. Display the factors of each perfect number to confirm that the
 * number is indeed perfect. Challenge the computing power of your computer by
 * testing numbers much larger than 1000. Display the results.
 */
//Main Class
public class PerfectNumberApp {

    // method for returning boolean if arguement is a perfect number
    public static boolean isPerfect(int num) {
        int total = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                total = total + i;
            }
        }
        if (total == num) {
            System.out.println("The Number " + num + " is a Perfect Number!!");
            return true;
        } else {
            System.out.println("The Number " + num + " is  not a Perfect Number!!");
            return false;
        }

    }// end of boolean isPerfect Method

    //Method for getting perfect Number between 1 and 1000
    public static void isPerfect() {
        int total = 1;
        //int sum = 0;
        int max = 100000;
        //Outer for loop
        for (int i = 2; i <= max; i++) {
            total = 1; // Reset total to 1 after each inner for loop iteration
            //Inner for loop which acts as the divisor to the number i
            for (int j = 2; j < i; j++) {
               
                if (i % j == 0) {
                    total = total + j;
                }

            }// end of Inner for loop
            if (total == i) { // checks if total is the same as our testing number which in this case is the perfect Number
                System.out.println(i);//logs the perfect Number to the console
            }

        }// end of outer for loop

    }// end of second overLoaded Method

    //Main Method
    public static void main(String[] args) {
        System.out.println(isPerfect(2)); // invoking overloaded int parameter Method
        isPerfect(); // invoking overloaded no parameter Method

    }// end of Main Method

} // end of Main Class
