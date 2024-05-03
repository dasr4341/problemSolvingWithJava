import java.util.ArrayList;

public class GetMazePathWithJumps_18 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> s = solveProblem(0, 0, 2, 2);
        for (String s1 : s) {
            System.out.println(s1 + " <-");
        }
    }

    private static ArrayList<String> solveProblem(int i, int j, int k, int l) {

        if (i == k && j == l) {
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        } else if (i > k || j > l) {
            ArrayList<String> res = new ArrayList<>();
            return res;
        }
        // vertically
        ArrayList<String> resN = new ArrayList<>();

        for (int a = 1; a <= k - i; a++) {
            ArrayList<String> resV = solveProblem(i + a, j, k, l);
            for (String s : resV) {
                resN.add('v' + s);
            }
        }
        for (int a = 1; a <= l - j; a++) {
            ArrayList<String> resH = solveProblem(i, j + a, k, l);
            for (String s : resH) {
                resN.add('h' + s);
            }
        }
        for (int a = 1; a <= l - j && a <= k - i; a++) {
            ArrayList<String> resD = solveProblem(i + a, j + a, k, l);
            for (String s : resD) {
                resN.add('d' + s);
            }
        }

        return resN;
    }

}
