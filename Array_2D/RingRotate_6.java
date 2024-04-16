package Array_2D;

public class RingRotate_6 {
    public static void main(String args[]) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        int s = 2;
        int r = 1;

        int[] arr1 = accomodateInArray(arr, s);

        rotate(arr1, r);

        putBackTheRoatedArr(arr, arr1, s);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private static void putBackTheRoatedArr(int[][] arr, int[] arr1, int s) {

        int minRow = s - 1;
        int minCol = s - 1;
        int c = 0;

        int row = (arr.length - s);
        int col = (arr[0].length - s);

        int ii = 0;
        while (c < 1) {
            for (int i = minRow, j = minCol; j <= col; j++) {
                arr[i][j] = arr1[ii];
                ii++;
            }
            minRow++;
            for (int i = minRow, j = col; i <= row; i++) {
                arr[i][j] = arr1[ii];
                ii++;
            }
            col--;
            for (int i = row, j = col; j >= minCol; j--) {
                arr[i][j] = arr1[ii];
                ii++;
            }
            row--;
            for (int i = row, j = minCol; i >= minRow; i--) {
                arr[i][j] = arr1[ii];
                ii++;
            }
            minCol++;
            c++;
        }

    }

    public static void reverse(int[] arr, int i, int j) {
        while (i <= j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }

    private static void rotate(int[] arr1, int r) {
        int l = arr1.length;
        reverse(arr1, 0, l - r - 1);
        reverse(arr1, l - r, l - 1);
        reverse(arr1, 0, l - 1);

    }

    private static int[] accomodateInArray(int[][] arr, int s) {

        int minRow = s - 1;
        int minCol = s - 1;
        int c = 0;

        int rl = arr.length - s;
        int cl = arr[0].length - s;

        int[] a = new int[rl * cl];

        int row = (arr.length - s);
        int col = (arr[0].length - s);

        int ii = 0;
        while (c < 1) {
            for (int i = minRow, j = minCol; j <= col; j++) {
                a[ii] = arr[i][j];
                ii++;
            }
            minRow++;
            for (int i = minRow, j = col; i <= row; i++) {
                a[ii] = arr[i][j];
                ii++;
            }
            col--;
            for (int i = row, j = col; j >= minCol; j--) {
                a[ii] = arr[i][j];
                ii++;
            }
            row--;
            for (int i = row, j = minCol; i >= minRow; i--) {
                a[ii] = arr[i][j];
                ii++;
            }
            minCol++;
            c++;
        }

        return a;
    }

}
