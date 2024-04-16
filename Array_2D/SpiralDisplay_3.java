package Array_2D;

public class SpiralDisplay_3 {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        solveProblem(arr);
    }

    private static void solveProblem(int[][] arr) {
        int minRow = 0;
        int minCol = 0;

        int maxRow = arr.length;
        int maxCol = arr[0].length;
        int c = 1;
        int tC = maxCol * maxRow;

        while (c <= tC) {
            for (int i = minRow, j = minCol; i < maxRow && c <= tC; i++) {
                System.out.print(arr[i][j] + " ");
                c++;
            }
            minCol++;
            for (int i = maxRow - 1, j = minCol; j < maxCol && c <= tC; j++) {
                System.out.print(arr[i][j] + " ");
                c++;
            }
            maxRow--;
            for (int i = maxRow - 1, j = maxCol - 1; i >= minRow && c <= tC; i--) {
                System.out.print(arr[i][j] + " ");
                c++;
            }
            maxCol--;
            for (int i = minRow, j = maxCol - 1; j >= minCol && c <= tC; j--) {
                System.out.print(arr[i][j] + " ");
                c++;
            }
            minRow++;

        }

    }
}
