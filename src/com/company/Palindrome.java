package com.company;

public class Palindrome {

    public static boolean isPalindrome(int number) {
        int originalNum = number; //stores number unchanged
        int reverse = 0;


        if( number < 0){
            number *= -1;
            originalNum = number; // if negative make positive
        }

        while (number > 0 ){
            int lastDigit = number % 10;
            System.out.println("this is last digit " + lastDigit);
            reverse = (reverse * 10) + lastDigit;
            System.out.println("this is reverse after math " +reverse);
            number /= 10;
            System.out.println("this is num at end " + number);

        }

        if (originalNum == reverse){
            System.out.println("TRUE");
            return true;
        }else {
            System.out.println("FALSE");
            return false;
        }

    }

}
