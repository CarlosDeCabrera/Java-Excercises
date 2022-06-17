package com.company;

public class EvenDigitSum {
    public static int getEvenDigitSum (int number) {
        if (number < 0) {
            return -1;
        }

        int sumDigits = 0;
        int even = 0;
        while (number > 0) {
             even=number % 10;
            if (even % 2 == 0){
                sumDigits += even;
            }
            number /= 10;
        }

        return sumDigits;
    }

}
