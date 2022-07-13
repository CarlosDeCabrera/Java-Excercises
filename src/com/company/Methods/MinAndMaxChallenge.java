package com.company;

import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void minMax (){
        Scanner scn = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;

        while (true){
            System.out.println("enter Number: ");
            boolean isAnInt = scn.hasNextInt();

            if (isAnInt){
                int number = scn.nextInt();

                if (first){
                    first = false;
                    min = number;
                    max = number;
                }

                if (number > max){
                    max = number;
                }

                if (number < min) {
                    min = number;
                }

            }else {
                break;
            }
            scn.nextLine();
        }
        System.out.println("min =" + min + ", max= " + max);
        scn.close();
    }
}
