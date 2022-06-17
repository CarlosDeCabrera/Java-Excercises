package com.company;

public class PerfectNumber {

    public static boolean isPerfectnumber(int number) {
        if (number < 1) {
            return false;
        }

        int num1 = 1;
        int sum = 0;

        while (num1 < number) {

            if(number % num1 == 0){
                sum += num1;
            }

            num1++;
        }
        if (number == sum){
            return true;
        }else {
            return false;
        }
    }

}
