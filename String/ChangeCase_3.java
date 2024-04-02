package String;

import java.util.*;

public class ChangeCase_3 {

    public static void SolveProblem(String str) {
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                char upperCase = (char) (ch - 'z' + 'Z');
                s += upperCase;
            } else if (ch >= 'A' && ch <= 'Z') {
                char lowerCase = (char) (ch - 'Z' + 'z');
                s += lowerCase;
            }

        }
        System.out.println(s);
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        SolveProblem(s);
    }
}
