package array.iterative;

import static java.lang.Math.max;

public class LC_0053 {
    public int maxSubArray(int[] nums) {

        int result = Integer.MIN_VALUE;
        int prevSum = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            prevSum = max(nums[i], nums[i] + prevSum);
            result = max(prevSum, result);
        }

        return result;
    }
}
