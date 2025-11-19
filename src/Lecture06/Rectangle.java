package Lecture06;

public class Rectangle extends Shape implements Transformable {
    private float width, height;

    public Rectangle(float width, float height) {
        super();
        this.height = height;
        this.width = width;
    }

    public float getArea() {
        return width * height;
    }

    public void scale(float factor) {
        this.height *= factor;
        this.width *= factor;
    }

    public void move (float x, float y) {
        setX(getX() + x);
        setY(getY() + y);
    }

    public void rotateLeft() {
        float tmp;
        tmp = this.width;
        this.width = this.height;
        this.height = tmp;
    }

    public void rotateRight() {
        rotateLeft();
    }
}
