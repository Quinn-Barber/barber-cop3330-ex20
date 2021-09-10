package org.example;
import java.text.DecimalFormat;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App 
{
    public static void main( String[] args )
    {
        DecimalFormat df = new DecimalFormat("###.##");
        Scanner input = new Scanner(System.in);
        final String wis = "Wisconsin";
        final String ill = "Illinois";
        final String ec = "Eau Claire";
        final String dunn = "Dunn";
        double amount, tax, ptax;
        tax = 0;
        ptax = tax;
        String state, county;
        System.out.println( "What is the order amount?" );
        amount = input.nextDouble();
        System.out.println("What state do you live in?");
        input.nextLine();
        state = input.nextLine();
        System.out.println("What county do you live in?");
        county = input.nextLine();
        if( state.equals(wis) ){
            tax = 0.05;
            if( county.equals(dunn) ){
                tax = tax + 0.004;
            }
            else if(county.equals(ec) ){
                tax = tax + 0.005;
            }
            ptax = tax * amount;
            amount = amount * (1+tax);
        }
        else if( state.equals(ill) ){
            tax = 0.08;
            ptax = tax * amount;
            amount = amount * (1+tax);
        }
        String taxs = ("$" + df.format(ptax));
        String amounts = ("$" + df.format(amount));
        System.out.println("The tax is " + taxs + ".\nThe total is " + amounts + ".");
    }
}
