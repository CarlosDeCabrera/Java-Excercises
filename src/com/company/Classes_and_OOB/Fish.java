package com.company.Classes_and_OOB;

public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void moveMuscles(){

    }
    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(25);
    }
    private void rest(){

    }
    private void moveBackFin(){

    }



}
