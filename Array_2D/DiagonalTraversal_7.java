package Array_2D;

public class DiagonalTraversal_7 {
    public static void main(String args[]) {
        int[][] arr = {
                { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }
        };
        solveProblem(arr);
    }

    private static void solveProblem(int[][] arr) {
        int l = arr.length;
        int j = 0;
        for (int k = 0; k <= l; k++) {
            j = k;
            for (int i = 0; j < l; i++) {
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println(" ");
        }

    }

}
