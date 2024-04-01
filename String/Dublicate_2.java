package String;

import java.util.*;

public class Dublicate_2 {

    public static void SolveProblem(String str) {

        char prevEle = str.charAt(0);
        String result = prevEle + "";
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char currEle = str.charAt(i);
            if (currEle == prevEle) {
                count++;
            } else {
                result += currEle + "" + count;
                count = 0;
            }
            prevEle = currEle;
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        SolveProblem(s);
    }
}
