package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Picture implements Shape {

    List<Shape> shapeList = new ArrayList<>();

    public void addShapeToList(Shape shape) {
        getShapeList().add(shape);
    }

    public void removeShaperFromList(Shape shape) {
        getShapeList().remove(shape);
    }

    public List<Shape> getShapeList() {
        return shapeList;
    }

    @Override
    public void draw() {
        for (Shape shape: getShapeList()) {
            shape.draw();
        }
    }
}
