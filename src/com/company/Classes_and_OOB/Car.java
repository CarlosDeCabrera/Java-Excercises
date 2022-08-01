package com.company.Classes_and_OOB;

public class Car extends Vehicle {

    private int doors;
    private String engine;
    private String colour;

    public Car(int gearbox, int doors, int wheels, String engine, String colour) {
        super(gearbox, 0, 0, wheels);
        this.doors = doors;
        this.engine = engine;
        this.colour = colour;
    }

}
