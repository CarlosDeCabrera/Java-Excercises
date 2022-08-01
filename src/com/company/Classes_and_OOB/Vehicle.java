package com.company.Classes_and_OOB;

public class Vehicle {
    private int gearbox;
    private int speed;
    private int steering;
    private int wheels;


    public Vehicle(int gearbox, int speed, int steering, int wheels) {
        this.gearbox = gearbox;
        this.speed = speed;
        this.steering = steering;
        this.wheels = wheels;
    }

    public void changeGear(int gearbox){
        this.gearbox++;
    }

    public void steerLeft(){
        this.steering = -180;
    }

    public void steerRight(){
        this.steering = 360;
    }

    public int getWheels() {
        return wheels;
    }

    public int getGearbox() {
        return gearbox;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSteering() {
        return steering;
    }
}
