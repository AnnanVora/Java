//You have to represent a point in 2D space. Write a class with the name Point. The class needs two fields (instance variables) with name x and y of type int.
//
//    The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters x and y of type int and it needs to initialize the fields.
//
//    Write the following methods (instance methods):
//    * Method named getX without any parameters, it needs to return the value of x field.
//    * Method named getY without any parameters, it needs to return the value of y field.
//    * Method named setX with one parameter of type int, it needs to set the value of the x field.
//    * Method named setY with one parameter of type int, it needs to set the value of the y field.
//    * Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0 as double.
//    * Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point and Point x,y as double.
//    * Method named distance with parameter another of type Point, it needs to return the distance between this Point and another Point as double.
//
//    How to find the distance between two points?To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
//
//    d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
//
//    Where √ represents square root.

package com.annan.exercises.CodingExercise32;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    public double distance(int xB, int yB) {
        return Math.sqrt((xB - this.x) * (xB - this.x) + (yB - this.y) * (yB - this.y));
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(Point another) {
        return distance(another.getX(), another.getY());
    }

}
