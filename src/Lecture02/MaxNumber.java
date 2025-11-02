package Lecture02;

public class MaxNumber {
    int a;
    int b;


    MaxNumber(int a) {
        this(10, 10);
        this.a = a;

    }

    MaxNumber() {
        this.a = 8;
        this.b = 9;
    }

    MaxNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    int maxInt(int c, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    int max(int a, int b, int c) {
        return max(max(a, b), c);

        /*if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }*/
    }
}
