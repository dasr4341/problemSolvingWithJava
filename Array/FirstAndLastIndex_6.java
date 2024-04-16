package Array;

public class FirstAndLastIndex_6 {
    private static void solveProblem(int[] arr, int n) {
        int i = 0;
        int j = arr.length - 1;
        int fi = -1;
        int li = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (n < arr[mid]) {
                j = mid - 1;

            } else if (n > arr[mid]) {
                i = mid + 1;
            } else {
                fi = mid;
                j = mid - 1;
            }
        }
        System.out.println(fi + " <- First Index");

        i = 0;
        j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (n < arr[mid]) {
                j = mid - 1;

            } else if (n > arr[mid]) {
                i = mid + 1;
            } else {
                li = mid;
                i = mid + 1;
            }
        }
        System.out.println(li + " <- Last Index");
    }

    public static void main(String[] args) throws Exception {
        int[] arr = { 10, 10, 20, 20, 30, 30, 30, 30, 40, 50, 60, 70 };
        int n = 30;
        solveProblem(arr, n);
    }

}
