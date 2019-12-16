package com.nguyendodinh;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       //Implicit casting
        // byte  short  int  long  float double
//        double x =1.1;
//        double y = x + 2;
//        System.out.println(y);
//        NumberFormat percentInstance = NumberFormat.getPercentInstance();
//        String result = percentInstance.format(0.1);
//        System.out.println(result);
        Scanner principleScanner = new Scanner(System.in);
        System.out.print("Principal: ");
        Long principle = principleScanner.nextLong();

        Scanner annualScanner = new Scanner(System.in);
        System.out.print("Annual Interest Rate: ");
        double rate = annualScanner.nextDouble();
        double monthlyRate = rate /(12*100);
        Scanner periodScanner = new Scanner(System.in);
        System.out.print("Period (Years): ");
        int period = periodScanner.nextInt();

        double mortgagePayments = principle*(monthlyRate*Math.pow(1+monthlyRate,period*12))
                                    /((Math.pow(1+monthlyRate,period*12)) - 1) ;

        System.out.println("Morgage: "+ NumberFormat
                .getCurrencyInstance(Locale.US)
                .format((double)Math.round(mortgagePayments*100)/100));
    }
}
