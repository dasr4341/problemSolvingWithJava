package WhiteGoingUp_19;

public class PrintSubSequent_1 {
    public static void main(String[] args) throws Exception {
        solveProblem("abc", "");
    }

    private static void solveProblem(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = s.charAt(0);
        String sub = s.substring(1);

        solveProblem(sub, "" + ans);
        solveProblem(sub, ch + ans);
    }
}
