package com.company;

public class MegabytesConverter {

      int kiloBytes = 0;

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if(kiloBytes < 0 ) {
            System.out.println("Invalid Value");
        }else {
            int megabytes = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes +" KB = " + megabytes + " MB " + " and " + remainder + " KB" );

        }
    }
}
