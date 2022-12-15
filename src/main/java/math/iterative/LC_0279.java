package math.iterative;

import java.util.stream.IntStream;
import static java.lang.Math.*;

public class LC_0279 {
    public int numSquares(int n) {
        int[] squares = IntStream.range(1, (int) sqrt(n) + 1).map(i -> (int) pow(i, 2)).toArray();
        int[] memo = IntStream.generate(() -> Integer.MAX_VALUE).limit(n + 1).toArray();

        memo[0] = 0;
        for (int i = 1; i <= n; i++)
            for (int square : squares)
                if (square <= i)
                    memo[i] = min(memo[i - square] + 1, memo[i]);

        return memo[n];
    }
}
