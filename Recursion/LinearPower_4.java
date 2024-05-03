
public class LinearPower_4 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(solveProblem(2, n));
    }

    private static int solveProblem(int a, int n) {
        if (n == 0) {
            return 1;
        }

        int p = solveProblem(a, n - 1);
        return p * a;
    }

}
