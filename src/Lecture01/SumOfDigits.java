package Lecture01;

public class SumOfDigits {
    int digits;

    void setDigits(int digits) {
        this.digits = digits;
    }

    int getDigits() {
        return digits;
    }

    int sof() {
        int result = 0;
        int r = 10, b = 10;
        while (digits > 0) {
           result += digits % 10;
           digits /= 10;
        }
        return result;
    }
}

class SumOfDigitsDemo {
    public static void main(String[] args) {
        SumOfDigits sumOfDigits = new SumOfDigits();
        sumOfDigits.setDigits(1234); // 10
        System.out.println(sumOfDigits.sof());
        int a = 10;
        int b = 11;
    }
}
