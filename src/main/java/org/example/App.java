/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hao Nguyen
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        double height;
        double weight;

        while (true) {
            System.out.print("Enter your height: ");
            String in = input.nextLine();
            if (isNumeric(in))
            {
                height = Double.parseDouble(in);
                break;
            }
            else
            {
                System.out.println("Please only enter numeric value!");
            }
        }

        while (true) {
            System.out.print("Enter your weight: ");
            String in = input.nextLine();
            if (isNumeric(in))
            {
                weight = Double.parseDouble(in);
                break;
            }
            else
            {
                System.out.println("Please only enter numeric value!");
            }
        }

        double bmi = (weight / (height * height)) * 703;
        System.out.printf("Your BMI is %.1f\n", bmi);
        if (bmi < 18.5) {
            System.out.println("You are underweight. You should see a doctor.");
        } else if (bmi <= 25) {
            System.out.println("You are within the ideal weight range.");
        } else {
            System.out.println("You are overweight. You should see a doctor.");
        }
    }
}
