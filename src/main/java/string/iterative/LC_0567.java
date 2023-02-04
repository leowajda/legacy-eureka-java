package string.iterative;

import java.util.Arrays;

public class LC_0567 {
    public boolean checkInclusion(String a, String b) {

        if (a.length() > b.length())
            return false;

        String sub = b.substring(0, a.length());
        int[] original = getCounter(a), window = getCounter(sub);

        for (int i = a.length(); i < b.length(); i++) {
            if (Arrays.equals(original, window))
                return true;

            window[b.charAt(i - a.length()) - 'a']--;
            window[b.charAt(i) - 'a']++;
        }

        return Arrays.equals(original, window);
    }

    private static int[] getCounter(String s) {
        int[] counter = new int[26];
        s.chars().map(c -> c - 'a').forEach(c -> counter[c]++);
        return counter;
    }
}
