
public class MaxOfArray_9 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 4, 5 };
        System.out.println(solveProblem(arr, 0));
    }

    private static int solveProblem(int[] arr, int i) {
        if (i == arr.length) {
            return Integer.MIN_VALUE;
        }

        int max = solveProblem(arr, i + 1);
        int ele = arr[i];
        if (ele < max) {
            return max;
        }
        return ele;
    }
}
