package Lecture04;

public class Array {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a;
        int[] c = b;

        b[3] = -1;
        c[4] = 10;

        System.out.println(b[1]);
        System.out.println(a[3]);
        System.out.println(a[4]);


        int[] testArr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 7};
        // 9 10 8 7 6 5 4 3 2 1 7
        // 9 8 10 7 6 5 4 3 2 1 7
        // 1 2 3 4
        bubbleSort(testArr);
        for(int i = 0; i < testArr.length; i++) {
            System.out.println(testArr[i]);
        }

    }

    static void bubbleSort(int[] arr) {
        int tmp;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = tmp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

}