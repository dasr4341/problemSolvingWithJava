
public class PowerLogarithmic_5 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(solveProblem(2, n));
    }

    private static int solveProblem(int i, int n) {

        int p = solveProblem(i, n / 2);
        int r = p * p;

        if (n % 2 != 0) {
            return r * i;
        }

        return r;

    }
}
