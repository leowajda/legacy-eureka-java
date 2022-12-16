package array.iterative;

import static java.lang.Math.max;

public class LC_0045 {
    public int jump(int[] nums) {

        int maxJump = 0, prevJump = 0;
        int result = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            maxJump = max(i + nums[i], maxJump);
            if (i == prevJump) {
                prevJump = maxJump;
                result++;
            }
        }

        return result;
    }
}
