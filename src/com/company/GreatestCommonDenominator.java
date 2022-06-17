package com.company;

public class GreatestCommonDenominator {

    public static int getGreatestCommonDivisor (int first, int second){
        if (first < 10 || second < 10) {
            return -1;
        }

        int number = 0;

        while (number > 10){

            int num1 = 0;
            int num2 = 0;
            first = first / number;
            second = second / number;
            if (first == second){
                System.out.println("first number = " + first);
                break;
            }
            number++;
        }
        System.out.println("the common divisor is " + first);
        return first;
    }

}
