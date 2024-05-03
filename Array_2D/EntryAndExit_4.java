package Array_2D;

public class EntryAndExit_4 {
    public static void main(String args[]) {
        int[][] arr = {
                { 0, 0, 1, 0 },
                { 0, 1, 0, 0 },
                { 0, 1, 1, 0 },
                { 0, 0, 0, 1 }
        };

        int i = 0, j = 0;
        int dir = 0;

        while (true) {

            int ele = arr[i][j];
            dir = (dir + ele) % 4;

            if (dir == 0) {
                j++;
            } else if (dir == 1) {
                i++;
            } else if (dir == 2) {
                j--;
            } else if (dir == 3) {
                i--;
            }

            if (i < 0) {
                i++;
                break;
            } else if (j < 0) {
                j++;
                break;
            } else if (i >= arr.length) {
                i--;
                break;
            } else if (j >= arr[0].length) {
                j--;
                break;
            }

        }
        System.out.println(i + " " + j);

    }
}
