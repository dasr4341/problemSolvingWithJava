package Array_2D;

public class Saddlepoint_8 {
    public static void main(String args[]) {
        int[][] arr = {
                { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }
        };
        solveProblem(arr);
    }

    private static void solveProblem(int[][] arr) {

        int minRow = Integer.MAX_VALUE;
        int colIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int el = arr[i][j];
                if (el < minRow) {
                    minRow = el;
                    colIndex = j;
                }
            }

            boolean isMax = true;

            for (int k = 0; k < arr.length; k++) {
                // is the max in that col
                int ele = arr[k][colIndex];
                if (minRow < ele) {
                    isMax = false;
                    break;
                }
            }

            if (isMax) {
                System.out.println(arr[i][colIndex]);
                break;
            }
            // reset minRow
            minRow = Integer.MAX_VALUE;

        }
    }

}
