package Lecture05;

public class Square extends Shape {
    float length;

    public Square(float length) {
        super();
        this.length = length;
    }
    public float getArea() {
        return length * length;
    }
}
