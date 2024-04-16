package Array;

import java.util.*;

public class CeilAndFloor_5 {
    private static void solveProblem(int[] arr, int n) {
        int i = 0;
        int f = -1;
        int c = -1;
        int j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (n < arr[mid]) {
                j = mid - 1;
                c = arr[mid];
            } else if (n > arr[mid]) {
                i = mid + 1;
                f = arr[mid];
            } else {
                c = arr[mid];
                f = arr[mid];
                break;
            }
        }
        System.out.println(c + " - " + f);
    }

    public static void main(String[] args) throws Exception {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        solveProblem(arr, n);
    }

}
