package com.company;

public class LargestPrime {

    public static int getLargestPrime(int number) {
            if (number < 2) {
                return -1;
            }
            for (int i = 2; i < number; i++) {
                if ((number % i) == 0) {
                    number /= i;
                    i--;

                }
            }
        System.out.println(number);
            return number;
        }
}


