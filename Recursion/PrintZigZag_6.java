
public class PrintZigZag_6 {

    public static void main(String[] args) {
        solveProblem(2);
    }

    private static void solveProblem(int i) {
        if (i == 0) {
            return;
        }
        System.out.println("Pre" + i);
        solveProblem(i - 1);
        System.out.println("In" + i);
        solveProblem(i - 1);
        System.out.println("Post" + i);
    }

}
