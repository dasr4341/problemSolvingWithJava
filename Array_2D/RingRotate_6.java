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

        int arr1[] = getFlatArr(arr, s);

        rotate(arr1, r);

        putBackTheRotatedArr(arr, arr1, s);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

    }

    private static void putBackTheRotatedArr(int[][] arr, int[] arr1, int s) {
        int l = arr.length;
        int minR = s - 1;
        int maxR = l - s;
        int maxC = l - s;
        int minC = s - 1;
        int c = 0;

        for (int i = minR, j = minC; j <= maxC; j++) {
            arr[i][j] = arr1[c];
            c++;
        }
        minR++;

        for (int i = minR, j = maxC; i <= maxR; i++) {
            arr[i][j] = arr1[c];
            c++;
        }
        maxC--;

        for (int i = maxR, j = maxC; j >= minC; j--) {
            arr[i][j] = arr1[c];
            c++;
        }
        maxR--;

        for (int i = maxR, j = minC; i >= minR; i--) {
            arr[i][j] = arr1[c];
            c++;
        }
        minC++;
    }

    private static void rotate(int[] arr1, int r) {
        int l = arr1.length;
        reverse(arr1, 0, l - r - 1);
        reverse(arr1, l - r, l - 1);
        reverse(arr1, 0, l - 1);
    }

    private static void reverse(int[] arr, int i, int j) {
        while (i <= j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }

    private static int[] getFlatArr(int[][] arr, int s) {
        int l = arr.length;
        int minR = s - 1;
        int maxR = l - s;
        int maxC = l - s;
        int minC = s - 1;
        int c = 0;
        int size = ((2 * (maxC - minC + 1)) + (2 * (maxR - minR + 1))) - 4;
        int arr1[] = new int[size];

        for (int i = minR, j = minC; j <= maxC; j++) {
            arr1[c] = arr[i][j];
            c++;
        }
        minR++;

        for (int i = minR, j = maxC; i <= maxR; i++) {
            arr1[c] = arr[i][j];
            c++;
        }
        maxC--;

        for (int i = maxR, j = maxC; j >= minC; j--) {
            arr1[c] = arr[i][j];
            c++;
        }
        maxR--;

        for (int i = maxR, j = minC; i >= minR; i--) {
            arr1[c] = arr[i][j];
            c++;
        }
        minC++;

        return arr1;

    }

}
