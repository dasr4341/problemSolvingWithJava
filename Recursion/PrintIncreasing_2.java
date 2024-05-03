
public class PrintIncreasing_2 {
    public static void main(String[] args) {
        int n = 5;
        solveProblem(n);
    }

    private static void solveProblem(int n) {
        if (n == 0)
            return;

        solveProblem(n - 1);
        System.out.println(n);
    }

}
