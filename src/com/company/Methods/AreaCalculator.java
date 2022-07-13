package com.company;

public class AreaCalculator {

    public static double area(double radius){
        return (radius < 0) ? -1 : Math.pow(radius,2) * Math.PI;
// my attempt

//        if (radius < 0){
//            return -1.0;
//        }
//        double area2 = Math.PI * (Math.pow(radius,2));
//        System.out.println(area2);
//        return area2;
    }
    public static double area(double x, double y){
        if (x < 0 || y < 0){
            return -1.0;
        }
        double area = x * y;
        System.out.println(area);
        return area;
    }
}
