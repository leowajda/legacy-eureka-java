package math.iterative;

import static java.lang.Math.min;

public class LC_0746 {
    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length;

        if (n == 2)
            return min(cost[0], cost[1]);

        int a = cost[0], b = cost[1], c;
        for (int i = 2; i <= n; i++) {
            c = min(a, b) + ((i < n) ? cost[i] : 0);
            a = b;
            b = c;
        }

        return b;
    }
}