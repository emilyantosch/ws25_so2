public class Student {
    String name;
    int number;
    int year = 2020;

    void changeName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        byte b;
        b = 1;
        Student lena;
            lena = new Student();
    }
}

class StudentDemo {
    public static void main(String[] args) {
        int count;
        Student lena, jan;
        lena = new Student();
        lena.name = "Lena";

        jan = new Student();
        jan.name = "Jan";
        jan = lena;
        System.out.println(lena.name);
        System.out.println(jan.name);

        lena.changeName("Birgit");
        System.out.println(lena.name);
        System.out.println(jan.name);

    }
}