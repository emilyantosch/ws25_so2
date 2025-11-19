package Lecture06;

import Lecture05.Scalable;

import java.util.ArrayList;
import java.util.Collections;

public class Circle extends Shape implements Transformable {
    public static void main(String[] args) {
        Circle circle = new Circle(1.0f);
        Rectangle rectangle = new Rectangle(1.0f, 1.0f);
        Square square = new Square(1.0f);

        ArrayList<Shape> list = new ArrayList<Shape>();


        list.add(circle);
        list.add(rectangle);
        list.add(square);

        Collections.sort(list);

        for(Shape element : list) {
            System.out.println(element);
        }
    }
    private float radius;

    public Circle(float x, float y, float radius){
        super(x, y);
        this.radius = radius;
    }

    public Circle(float radius) {
        super();
        this.radius = radius;
    }

    public float getArea() {
        return (float) (radius * radius * Math.PI);
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void scale(float factor) {
        radius *= factor;
    }

    public void move(float x, float y) {
        setX(getX() + x);
        setY(getY() + y);
    }

    public void rotateLeft() {

    }

    public void rotateRight() {

    }


    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        if (this.getX() != circle.getX() || this.getY() != circle.getY()) return false;
        return Float.compare(radius, circle.radius) == 0;
    }
}

