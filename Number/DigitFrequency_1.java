package Number;

import java.util.*;

public class DigitFrequency_1 {
    public static void SolveProblem(int n, int x) {
        int c = 0;
        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            if (x == r)
                c++;
        }
        System.out.println(c);
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt(); // digit to find frequency
        SolveProblem(n, x);
    }
}
