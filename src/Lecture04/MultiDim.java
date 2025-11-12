package Lecture04;

public class MultiDim {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        // 1
        // 1 1
        // 1 1 1
        for(int i = 1; i <= 3; i++){
            int[] tmpArr = new int[i];
            for (int j = 0; j < tmpArr.length; j++) {
                tmpArr[j] = 1;
            }
            arr[i - 1] = tmpArr;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }




    }
}
