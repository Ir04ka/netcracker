package com.company;

public class Main {

    public static void main(String[] args) {

        Shape square1 = new Square();
        Shape square2 = new Square();
        Shape square3 = new Square();

        Shape triangle = new Triangle();

        Shape circle1 = new Circle();
        Shape circle2 = new Circle();
        Shape circle3 = new Circle();

        Picture pictureMain = new Picture();
        Picture picture1 = new Picture();
        Picture picture2 = new Picture();

        picture1.addShapeToList(square1);
        picture1.addShapeToList(square2);
        picture1.addShapeToList(square3);

        picture2.addShapeToList(circle1);
        picture2.addShapeToList(circle2);
        picture2.addShapeToList(circle3);
        picture2.addShapeToList(triangle);

        pictureMain.addShapeToList(picture1);
        pictureMain.addShapeToList(picture2);

        pictureMain.draw();
    }

}

