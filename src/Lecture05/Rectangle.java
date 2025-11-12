package Lecture05;

public class Rectangle extends Shape {
    private float width, height;

    public Rectangle(float width, float height) {
        super();
        this.height = height;
        this.width = width;
    }

    public float getArea() {
        return width * height;
    }
}
