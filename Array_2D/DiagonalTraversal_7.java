package Array_2D;

public class DiagonalTraversal_7 {
    public static void main(String args[]) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        solveProblem(arr);
    }

    private static void solveProblem(int[][] arr) {
        for (int g = 0; g < arr[0].length; g++) {
            for (int i = 0, j = g; j < arr[0].length; j++, i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
