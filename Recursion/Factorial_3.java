
public class Factorial_3 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(solveProblem(n));
    }

    private static int solveProblem(int n) {
        if (n == 1)
            return 1;

        int f = solveProblem(n - 1);
        return f * n;
    }

}
