package string.iterative;

import java.util.Set;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toSet;

public class LC_0091 {

    private final static Set<String> nums = IntStream.rangeClosed(1, 26).mapToObj(String::valueOf).collect(toSet());

    public int numDecodings(String s) {

        int n = s.length();
        int[] memo = new int[n];

        for (int i = n - 1; i >= 0; i--)
            for (int j = i + 1; j <= n; j++) {
                String sub = s.substring(i, j);
                if (nums.contains(sub))
                    memo[i] += (j == n) ? 1 : memo[j];
            }

        return memo[0];
    }
}
