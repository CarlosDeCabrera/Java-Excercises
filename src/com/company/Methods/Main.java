package com.company;

import com.company.Classes_and_OOB.Car;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car honda = new Car();
        porsche.setModel("porsche");
        honda.setModel("honda");
        System.out.println("model is " + porsche.getModel());
        System.out.println("model is " + honda.getModel());

    }
}