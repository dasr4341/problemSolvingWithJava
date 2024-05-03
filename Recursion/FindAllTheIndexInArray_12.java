
public class FindAllTheIndexInArray_12 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 4, 5, 8, 1, 8 };
        int[] res = solveProblem(arr, 0, 8, 0);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i] +  " <-");
        }
    }

    private static int[] solveProblem(int[] arr, int i, int j, int count) {
        if (arr.length == i) {
            return new int[count];
        }
        if(arr[i] == j) {
            count++;
        }
        int res[] = solveProblem(arr, i + 1, j, count);
        
        if (arr[i] == j) {
            res[count - 1] = i;
        }
        return res;
    }
}
