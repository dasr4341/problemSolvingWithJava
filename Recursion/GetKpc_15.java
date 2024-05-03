import java.util.ArrayList;

public class GetKpc_15 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> s = solveProblem("123");
        for (String s1 : s) {
            System.out.println(s1 + " <-");
        }
    }

    static String[] helper = {
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno", "pqrs", "tu", "vwx", "yz"
    };

    private static ArrayList<String> solveProblem(String s) {
        if (s.length() == 0) {
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        int index = ((int) s.charAt(0)) - 48;
        String subS = s.substring(1);
        ArrayList<String> res = solveProblem(subS);
        ArrayList<String> newRes = new ArrayList<>();
        String helperStr = helper[index];

        for (int i = 0; i < helperStr.length(); i++) {
            char c = helperStr.charAt(i);
            for (String s1 : res) {
                newRes.add(c + s1);
            }
        }

        return newRes;
    }
}
