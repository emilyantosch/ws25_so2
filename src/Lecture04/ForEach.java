package Lecture04;

public class ForEach {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 4};

        int sum = 0;
        for(int e : arr) {
           sum = sum + e;
        }
        System.out.println(sum / arr.length);


    }
}
