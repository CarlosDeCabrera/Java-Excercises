package com.company;

public class TeenChecker {

    public static boolean hasTeen(int num1, int num2, int num3){
            return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }

    public static boolean isTeen(int num1 ){
        if (num1 >= 13 && num1 <= 19){
            return true;
        }return false;
    }

}
