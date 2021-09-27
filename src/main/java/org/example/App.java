package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 26 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.lang.Math;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Creates reader

        System.out.printf("What is your balance? ");
        String bStr = reader.nextLine();
        System.out.printf("What is the APR on the card (as a percent)? ");
        String aprStr = reader.nextLine();
        System.out.printf("What is the monthly payment you can make? ");
        String pStr = reader.nextLine();

        double b = Double.parseDouble(bStr);
        double apr = Double.parseDouble(aprStr);
        double p = Double.parseDouble(pStr);

        double i = apr/365;

        PaymentCalculator paymentCalculator = new PaymentCalculator();

        double n = paymentCalculator.calculateMonthsUntilPaidOff(i, b, p);

        System.out.printf("It will take you " + n + " months to pay off this card. ");
    }
}