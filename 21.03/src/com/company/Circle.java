package com.company;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName());
    }
}
