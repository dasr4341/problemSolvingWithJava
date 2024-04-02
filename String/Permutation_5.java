package String;

import java.util.*;

public class Permutation_5 {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void SolveProblem(String str) {
        int l = str.length();
        int f = factorial(l);
        for (int i = 0; i < f; i++) {
            StringBuilder s = new StringBuilder(str);
            int temp = i;
            for (int j = l; j >= 1; j--) {
                int q = temp / j;
                int r = temp % j;
                char ch = s.charAt(r);
                System.out.print(ch);
                s.deleteCharAt(r);
                temp = q;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        SolveProblem(s);
    }
}
