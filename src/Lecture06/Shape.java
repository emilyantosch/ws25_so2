package Lecture06;

public abstract class Shape implements Comparable<Shape> {
    private float x, y;
    public Shape() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public int compareTo(Shape other) {
        if (getArea() < other.getArea()) {
            return -1;
        } else if (getArea() > other.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }

    public Shape(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public abstract float getArea();

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
