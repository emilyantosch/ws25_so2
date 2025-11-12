package Lecture04;

class Person {
    String name;
}

public class Pilot extends Person {
    int flightHours;

    public static void main(String[] args) {
        Pilot pilot = new Pilot();
        pilot.name = "Tim";
        pilot.flightHours = 100;
        System.out.println(pilot.name);
        System.out.println(pilot.flightHours);

    }


}

class Captain extends Pilot {
    int subordinates;

    public static void main(String[] args) {
        Captain captain = new Captain();
        captain.name = "Tom";
        captain.flightHours = 1000;
        captain.subordinates = 10;
    }
}
