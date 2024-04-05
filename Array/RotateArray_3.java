package Array;

import java.util.*;

public class RotateArray_3 {

    public static void reverse(int[] arr, int i, int j) {
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void SolveProblem(int[] arr, int r) {
        int l = arr.length;
        if (r < 0) {
            r = l + r;
        }
        r = r % l;
        int p1 = (l - r - 1);
        int p2 = (l - r);
        reverse(arr, 0, p1);
        reverse(arr, p2, l - 1);
        reverse(arr, 0, l - 1);

        for (int arr2 : arr) {
            System.out.print(arr2 + " ");
        }

    }

    public static void main(String[] args) throws Exception {
        int arr[] = { 10, 20, 30, 40, 50 };
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        SolveProblem(arr, r);
    }
}