package Array_2D;

public class RotateBy90_5 {
    public static void main(String args[]) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int l = arr.length - 1;

        // transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            reverse(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }

    private static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;

            i++;
            j--;
        }
    }
}
