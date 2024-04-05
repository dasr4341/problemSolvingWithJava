package Array;

public class SubSetOfArray_1 {

    public static void SolveProblem(int[] arr) {
        int l = arr.length;
        int n = (int) Math.pow(2, l);
        for (int i = 0; i < n; i++) {
            int temp = i;
            String s = "";
            for (int j = l - 1; j >= 0; j--) {
                int q = temp / 2;
                int r = temp % 2;

                if (r == 0) {
                    s = "_ " + s;
                    // System.out.print("_ ");
                } else {
                    s = arr[j] + " " + s;
                    // System.out.print(arr[j]);
                }
                temp = q;
            }
            System.out.println(s);
        }
    }

    public static void main(String[] args) throws Exception {
        int arr[] = { 10, 20, 30 };
        SolveProblem(arr);
    }
}