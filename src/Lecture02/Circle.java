package Lecture02;

public class Circle {

    double x;
    double y;
    double radius;

    static int count;
    static final double PI = 3.1415;

    static double getPi(){
        return PI;
    }

    Circle() {
        this.x = 0.0;
        this.y = 0.0;
        this.radius = 1.0;
        count++;
    }

    Circle(double x, double y, double radius){
        this();
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    Circle(double radius) {
        this();
        this.radius = radius;
    }

    Circle(Circle c) {
        this();
        this.x = c.x;
        this.y = c.y;
        this.radius = c.radius;
    }

    public String toString() {
        return "X: " + x + ", Y: " + y + ", Radius: " + radius;
    }

    public double getX() {
        return x;
    }

    public Circle(double y, double x) {
        this.y = y;
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setX(double x) {
        this.x = x;
    }

    static void main() {
        System.out.println(Circle.getPi());

        Circle circle = new Circle(2.0);
        Circle newCircle = new Circle(circle);
        String c = "Lecture02.Circle 1: " + circle;
        //String i = newCircle + c;
        //System.out.println(i);

        Circle newerCircle = new Circle(circle);
        System.out.println(circle.radius);
        System.out.println(newCircle.radius);
        System.out.println(Circle.count);
    }
}
