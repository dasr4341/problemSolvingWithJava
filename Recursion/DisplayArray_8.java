
public class DisplayArray_8 {
    public static void main(String[] args) {
        int[] arr = { 1, 20, 3, 4, 5 };
        solveProblem(arr, arr.length - 1);
    }

    private static void solveProblem(int[] arr, int length) {
        if (length == -1) {
            return;
        }
        solveProblem(arr, length - 1);
        System.out.println(arr[length]);
    }
}
