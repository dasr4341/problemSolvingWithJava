import java.util.ArrayList;

public class GetSubSequence_13 {

    public static void main(String[] args) throws Exception {
        ArrayList<String> s = solveProblem("abc");
        for (String s1 : s) {
            System.out.println(s1 + " <-");
        }
    }

    private static ArrayList<String> solveProblem(String s) {
        if (s.length() == 0) {
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }

        char firstC = s.charAt(0);
        String newS = s.substring(1);

        ArrayList<String> res = solveProblem(newS);
        ArrayList<String> newRes = new ArrayList<>();

        for (String s1 : res) {
            newRes.add("" + s1);
            newRes.add(firstC + s1);
        }

        return newRes;
    }
}
