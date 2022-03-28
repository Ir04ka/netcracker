package com.company;

public abstract class Figure implements Shape {

    static Integer ANGLES = 0;
    static Integer SIDES = 0;


    private int numberOfAngles;
    private int numberOfSides;

    public void draw() {
        System.out.println(this.getClass().getSimpleName() + " - draw()");
    }

    public void erase() {
        System.out.println(this.getClass().getSimpleName() + " - erase()");
    }

    public int getNumberOfAngles() {
        return numberOfAngles;
    }

    public void setNumberOfAngles(int numberOfAngles) {
        this.numberOfAngles = numberOfAngles;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setGetNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

}
