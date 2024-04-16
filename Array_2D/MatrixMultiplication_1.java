package Array_2D;

public class MatrixMultiplication_1 {
    public static void main(String args[]) throws Exception {
        int[][] arr1 = {
                { 1, 2 },
                { 2, 1 },
                { 1, 2 }
        };
        int[][] arr2 = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
        };

        int[][] arr3 = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[0].length; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[0].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
