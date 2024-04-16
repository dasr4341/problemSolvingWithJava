package Recursion;

public class PrintDecreasing_1 {
    public static void main(String[] args) {
        int n = 5;
        solveProblem(n);
    }

    private static void solveProblem(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        solveProblem(n - 1);

    }

}
