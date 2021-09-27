package org.example;

import java.lang.Math;

public class PaymentCalculator {
    public double calculateMonthsUntilPaidOff(double i, double b, double p) {

        double n = (-1*(1/30)) * (Math.log(1 + b/p * (Math.pow((1 - (1 + i)),30)) )) / (Math.log(1 + i));

        return n;
    }
}
