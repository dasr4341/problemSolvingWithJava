import java.util.ArrayList;

public class GetMazePaths_17 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> s = solveProblem(0, 0, 2, 2);
        for (String s1 : s) {
            System.out.println(s1 + " <-");
        }
    }

    private static ArrayList<String> solveProblem(int i, int j, int x, int y) {
        if (i == x && j == y) {
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        } else if (i > x || j > y) {
            ArrayList<String> res = new ArrayList<>();
            return res;
        }
        ArrayList<String> s1 = solveProblem(i + 1, j, x, y);
        ArrayList<String> s2 = solveProblem(i, j + 1, x, y);

        ArrayList<String> rRes = new ArrayList<>();
        for (String s : s1) {
            rRes.add("v" + s);
        }
        for (String s : s2) {
            rRes.add("h" + s);
        }
        return rRes;
    }
}
