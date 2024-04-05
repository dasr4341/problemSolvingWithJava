package Array;

public class ReserseArray_2 {
    public static void SolveProblem(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) throws Exception {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
        SolveProblem(arr);
    }
}