package String;

import java.util.*;

public class PalindromeString_1 {

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if (ch2 != ch1) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static void SolveProblem(String str) {
        for (int i = 0; i <= str.length() - 1; i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String s = str.substring(i, j);
                if (isPalindrome(s)) {
                    System.out.println(s);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        SolveProblem(s);
    }
}