package com.company;

import java.util.Scanner;

public class InputCalculator {

        public static void inputThenPrintSumAndAverage(){
            Scanner scn = new Scanner(System.in);
            double sum = 0;
            double avg = 0;
            int count = 1;

            while (true) {
                System.out.println("Enter a Number: ");
                boolean isAnInt = scn.hasNextInt();

                if (isAnInt) {
                    int number = scn.nextInt();
                    sum += number;
                    avg =sum / count;
                    count++;

                } else {
                    break;
                }
            }

            System.out.println("SUM = " + Math.round(sum) + " AVG = " + Math.round(avg));
            scn.close();
        }
}
