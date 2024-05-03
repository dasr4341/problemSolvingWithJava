import java.util.ArrayList;

public class GetStairPaths_16 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> s = solveProblem(4);
        for (String s1 : s) {
            System.out.println(s1 + " <-");
        }
    }

    private static ArrayList<String> solveProblem(int i) {
        if (i == 0) {
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        } else if (i < 0) {
            ArrayList<String> res = new ArrayList<>();
            return res;
        }

        ArrayList<String> res1 = solveProblem(i - 1);
        ArrayList<String> res2 = solveProblem(i - 2);
        ArrayList<String> res3 = solveProblem(i - 3);
        ArrayList<String> rRes = new ArrayList<>();

        for (String s : res1) {
            rRes.add("1" + s);
        }
        for (String s : res2) {
            rRes.add("2" + s);
        }
        for (String s : res3) {
            rRes.add("3" + s);
        }

        return rRes;
    }
}
