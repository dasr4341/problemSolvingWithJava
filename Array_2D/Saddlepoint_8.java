package Array_2D;

public class Saddlepoint_8 {
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
        int i = 0;
        int j = 1;
        int maxI = arr.length;
        int maxJ = arr[0].length;
        int fI = 0;
        int fJ = 0;
        while (i < maxI) {

            int ele = arr[i][j];
            int f = arr[fI][fJ];

            if (ele < f) {
                fI = i;
                fJ = j;
            }

            j++;

            i = i % maxI;
            j = j % maxJ;

            if (j == 0) {
                int k = 0;
                for (int x = 0; x < maxI; x++) {
                    int e = arr[x][fJ];
                    int eleF = arr[fI][fJ];
                    if (eleF < e) {
                        k++;
                    }
                }
                if (k == 0) {
                    System.out.println(arr[fI][fJ]);
                    break;
                }
                i++;
                fI = i;
                fJ = j;
            }
        }
    }
}
