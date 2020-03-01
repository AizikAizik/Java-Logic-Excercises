/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterOne;

//Write a program that prints the range of numbers specified in a methods arguement
//list. For example range(1,10) sums up the range of 1 to to and didplays the Output
/**
 *
 * @author Isaac Ogunleye
 */
public class Excercise3 {
    
    public int range(int x, int y) {
        int total = 0;
        int sum = 0;
        if (x < y) {
            for (int i = x; i <= y; i++) {
                sum = sum + i;
                total = sum;
                if (i == y) {
                    System.out.println("the total of the range entered from " + x + " to " + y
                            + " is " + total);
                }

            }
        } else if (x > y) {
            for (int i = x; i >= y; i--) {
                sum = sum + i;
                total = sum;
                if (i == y) {
                    System.out.println("the total of the range entered from " + y + " to " + x
                            + " is " + total);
                }

            }
        } else {
            for (int i = x; i <= y; i++) {
                sum = sum + i;
                total = sum;
            }
            System.out.println("The range of the value " + x + " and " + y + " are equal\n"
                    + "hence the total range is: " + total + "\n");
        }
        return total;
    }

    public static void main(String[] args) {
        Excercise3 exc3 = new Excercise3();
        ArrayRange arr = new ArrayRange();
        exc3.range(5, 5);
        int newTotal = exc3.range(1, 4);
        System.out.println();
        System.out.print("The value of the new total  is: ");
        System.out.println(newTotal);
        System.out.println();

        int[] myArrays = {1, 2, 3, 4};
        arr.arrayRange(myArrays);

        exc3.range(-3, 5);

    }

}

// Using Arrays to calculate the range
class ArrayRange {

    public void arrayRange(int[] x) {
        int total = 0;
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum = x[i] + sum;
            total = sum;
        }
        System.out.println("The Array range is: " + total);
    }
}
