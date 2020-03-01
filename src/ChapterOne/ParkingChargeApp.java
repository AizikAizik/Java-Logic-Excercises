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
 * (Parking Charges) A parking garage charges a $2.00 minimum fee to park for up
 * to three hours. The garage charges an additional $0.50 per hour for each hour
 * or part thereof in excess of three hours. The maximum charge for any given
 * 24-hour period is $10.00. Assume that no car parks for longer than 24 hours
 * at a time. Write an application that calculates and displays the parking
 * charges for each customer who parked in the garage yesterday. You should
 * enter the hours parked for each customer. The program should display the
 * charge for the current customer and should calculate and display the running
 * total of yesterday’s receipts. It should use the method calculateCharges to
 * determine the charge for each customer.
 */

//Main Class
public class ParkingChargeApp {

    public static final int MAX_PARK_HR = 3;
    public static double MINIMUM_FEE = 2.00;
    double extraCharges = 0.50;
    public static final double MAXIMUM_FEE = 10.00;
    int maxParkHour = 24;
    double charges;
    int hoursParked;

    //Calculating Charges Method
    public double calculateCharges() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many hours did you park yesterday? ");
        System.out.print("Enter Value Here..  ");
        hoursParked = input.nextInt();
        if (hoursParked <= MAX_PARK_HR) {
            charges = MINIMUM_FEE;
            System.out.println("You are being charged  " + charges + " dollars for Parking here..");
        } else if (hoursParked >= maxParkHour) {
            charges = MAXIMUM_FEE;
            System.out.println("You are being charged  " + charges + " dollars for Parking here..");
        } else if (hoursParked > MAX_PARK_HR) {
            //start of for loop
            for (int i = 4; i < maxParkHour; i++) {
                double newCharge = MINIMUM_FEE + 0.5;
                charges = newCharge;
                MINIMUM_FEE += 0.5; //add 0.5 charges per hour as far as hour is greater than 3 hours and less than 24 hours
                if (i == hoursParked) {
                    if(charges > MAXIMUM_FEE){
                        charges = MAXIMUM_FEE;
                    }
                    System.out.println("You are being charged  " + charges + " dollars for Parking here..");
                    break; // breaks out once match is found    
                }
            }// end of for loop

        }

        return charges;
    }// end of method

    //Main Method
    public static void main(String[] args) {
        ParkingChargeApp park = new ParkingChargeApp(); //Creating Object of class

        park.calculateCharges(); // Invoking the Method

    } //end of Main Method

} // end of Main Class
