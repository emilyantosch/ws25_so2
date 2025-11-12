package Lecture05;

import java.util.Objects;

public class Circle extends Shape implements Scalable{
    public static void main(String[] args) {
        Circle circle = new Circle(1.0f);
        Rectangle rectangle = new Rectangle(1.0f, 1.0f);
        Square square = new Square(1.0f);


        Shape[] shapes = new Shape[3];
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = square;

        float result = 0;

        for(Shape element : shapes) {
            result += element.getArea();
        }
        System.out.println(result);
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

    public void resize(double factor) {
        this.radius *= factor;
    }

    public void reduce(double factor) {
        this.radius /= factor;
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        if (this.getX() != circle.getX() || this.getY() != circle.getY()) return false;
        return Float.compare(radius, circle.radius) == 0;
    }
}

