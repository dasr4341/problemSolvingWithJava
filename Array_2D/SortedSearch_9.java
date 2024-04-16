package Array_2D;

public class SortedSearch_9 {
    public static void main(String args[]) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        solveProblem(arr, 1);
    }

    private static void solveProblem(int[][] arr, int find) {

        int iMax = arr.length;
        int jMax = arr[0].length;

        int i = 0;
        int j = jMax - 1;
        while (i < iMax && j >= 0 && j < jMax) {
            int ele = arr[i][j];
            if (find > ele) {
                i++;
            } else if (find < ele) {
                j--;
            } else {
                System.out.println(i + " " + j);
                break;
            }

        }
    }
}
