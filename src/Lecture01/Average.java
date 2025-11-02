package Lecture01;

public class Average {
    float a;
    float b;
    float sum;

    void sum() {
        sum = a + b;
    }

    void setA(float a) {
        this.a = a;
    }

    float average() {
        return sum / 2.0f;
    }
}

class AverageDemo {
    public static void main(String[] args) {
        Average avg = new Average();
        Average bvg = new Average();
        avg.a = 2.0f;
        avg.b = 4.0f;
        avg.sum();
        float result = avg.average();
        System.out.println(result);
    }
}