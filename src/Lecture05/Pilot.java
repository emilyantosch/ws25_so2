package Lecture05;

class Person {
    String name;

    public String toString() {
        return name;
    }
}

public final class Pilot extends Person {
    String airline;

    public Pilot(String name, String airline) {
        this.name = name;
        this.airline = airline;
    }


    public static void main(String[] args) {
        Pilot pilot = new Pilot("Birgit", "Winglet Airways");
        Person personRef = pilot;
        Object objectRef = pilot;

        System.out.println(pilot.name);
        System.out.println(pilot.airline);
        System.out.println(personRef.name);

        System.out.println(objectRef.toString());
        System.out.println(personRef.toString());
    }

    public String toString() {
        return String.format("%s (%s)", name, airline);
    }
}
