package Lecture01;

class Person {

}

public class Concepts {
    /*public static void main(String[] args) {
        int weekDay = 7;
        if (weekDay <= 5) {
            System.out.println("Working");
        } else if (weekDay == 6) {
            System.out.println("Shopping");
        } else {
            System.out.println("Resting");
        }
    }*/

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }
        int weekDay = 3;
        switch (weekDay) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Working");
                break;
            case 6:
                System.out.println("Shopping");
                break;
            case 7:
                System.out.println("Resting");
                break;
            default:
                System.out.println("None matched!");
        }
    }
}
