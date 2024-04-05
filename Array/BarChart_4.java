package Array;

public class BarChart_4 {

    private static void SolveProblem(int[] arr) {
        int max = 0;
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        for (int i = max; i >= 1; i--) {
            for (int j = 0; j < l; j++) {
                int e = arr[j];
                if (e >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) throws Exception {
        int arr[] = { 1, 2, 4, 0, 5 };
        SolveProblem(arr);
    }
}