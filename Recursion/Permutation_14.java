import java.util.ArrayList;

public class Permutation_14 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> s = solveProblem("abc");
        for (String s1 : s) {
            System.out.println(s1 + " <-");
        }
    }

    private static ArrayList<String> solveProblem(String s) {
        if (s.length() == 0) {
            ArrayList<String> res = new ArrayList<>();
            return res;
        }

        char firstC = s.charAt(0);
        String newS = s.substring(1);

        ArrayList<String> res = solveProblem(newS);

        ArrayList<String> newRes = new ArrayList<>();

        if (res.size() > 0) {
            for (String ss : res) {
                int l = ss.length() + 1;
                for (int i = 0; i < l; i++) {
                    StringBuilder sB = new StringBuilder(ss);
                    sB.insert(i, firstC);
                    newRes.add(sB.toString());
                }
            }
        } else {
            newRes.add(firstC + "");
        }

        return newRes;
    }
}