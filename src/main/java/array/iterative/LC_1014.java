package array.iterative;

import static java.lang.Math.max;

public class LC_1014 {
    public int maxScoreSightseeingPair(int[] values) {

        int maxScore = 0, prevScore = values[0];
        for (int i = 1; i < values.length; i++) {
            maxScore = max(prevScore + values[i] - 1, maxScore);
            prevScore = max(values[i], prevScore - 1);
        }

        return maxScore;
    }
}
