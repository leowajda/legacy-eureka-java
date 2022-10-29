package math.iterative;

public class LC_1137 {
    public int tribonacci(int n) {
        if (n <= 2)
            return n == 2 ? n - 1 : n;

        int a = 0, b = 1, c = 1, d;
        for (int i = 3; i <= n; i++) {
            d = a + b + c;

            a = b;
            b = c;
            c = d;
        }

        return c;
    }
}
