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

    private static void solveProblem(int[][] arr, int eleToFind) {
        int l = arr[0].length;
        int i = 0;
        int j = l - 1;
        boolean isAvailable = false;

        while (j >= 0 && i < arr.length) {
            int ele = arr[i][j];
            if (ele < eleToFind) {
                i++;
            } else if (ele > eleToFind) {
                j--;
            } else {
                isAvailable = true;
                System.out.println(i + " " + j);
                break;
            }
        }
        if (!isAvailable) {
            System.out.println("Element not found !");
        }

    }

}
