
public class FindLastIndexInArray_11 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 4, 5, 8, 1, 8 };
        System.out.println(solveProblem(arr, arr.length - 1, 8));
    }

    private static int solveProblem(int[] arr, int i, int j) {
        if (i == -1) {
            return -1;
        }
        if (arr[i] == j) {
            return i;
        }
        int res = solveProblem(arr, i + 1, j);
        return res;
    }
}
