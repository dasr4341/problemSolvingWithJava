
public class TowerOfHanoi_7 {
    public static void main(String[] args) {
        solveProblem(3, 'A', 'B', 'C');
    }

    private static void solveProblem(int i, char a, char b, char c) {
        if (i == 0) {
            return;
        }
        solveProblem(i - 1, a, c, b);
        System.out.println(i + "-> " + a + " - " + b);
        solveProblem(i - 1, c, b, a);
    }

}
