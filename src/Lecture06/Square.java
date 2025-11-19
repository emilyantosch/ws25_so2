package Lecture06;

public class Square extends Shape implements Transformable{
    float length;

    public Square(float length) {
        super();
        this.length = length;
    }
    public float getArea() {
        return length * length;
    }

    public void scale (float factor) {
        this.length *= factor;
    }

    public void move (float x, float y) {
        setX(getX() + x);
        setY(getY() + y);
    }

    public void rotateLeft() {}
    public void rotateRight() {}
}
