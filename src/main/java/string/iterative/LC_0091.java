package string.iterative;

import java.util.Set;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toSet;

public class LC_0091 {
    public int numDecodings(String s) {

        Set<String> nums = IntStream.rangeClosed(1, 26).mapToObj(String::valueOf).collect(toSet());
        int[] memo = new int[s.length() + 1];

        memo[0] = 1;
        for (int i = 1; i <= s.length(); i++) {

            if (nums.contains(s.substring(i - 1, i)))
                memo[i] += memo[i - 1];

            if (i >= 2 && nums.contains(s.substring(i - 2, i)))
                memo[i] += memo[i - 2];
        }

        return memo[s.length()];
    }
}
