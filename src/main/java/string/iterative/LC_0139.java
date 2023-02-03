package string.iterative;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC_0139 {
    public boolean wordBreak(String s, List<String> wordDict) {

        Set<String> words = new HashSet<>(wordDict);
        boolean[] memo = new boolean[s.length() + 1];

        memo[0] = true;
        for (int i = 1; i <= s.length(); i++)
            for (int j = 0; j < i; j++)
                if (words.contains(s.substring(j, i)) && memo[j])
                    memo[i] = true;

        return memo[s.length()];
    }
}
