package String;

import java.util.*;

public class CaseDiffInAsci_4 {
    public static void SolveProblem(String str) {
        char prevCh = str.charAt(0);
        String s = prevCh + "";
        for (int i = 1; i < str.length(); i++) {
            char currCh = str.charAt(i);
            int d = (currCh - prevCh);
            s += d + "" + currCh;
            prevCh = currCh;
        }
        System.out.println(s);
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        SolveProblem(s);
    }
}
