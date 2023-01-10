package array.iterative;

import static java.lang.Math.max;

public class LC_1567 {
    public int getMaxLen(int[] nums) {

        int prevPositive = (nums[0] > 0) ? 1 : 0, prevNegative = (nums[0] < 0) ? 1 : 0;
        int maxLen = prevPositive;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > 0) {
                prevNegative = (prevNegative == 0) ? 0 : prevNegative + 1;
                prevPositive++;
            }

            if (nums[i] < 0) {
                int tempNegative = prevNegative, tempPositive = prevPositive;
                prevPositive = (tempNegative == 0) ? 0 : tempNegative + 1;
                prevNegative = tempPositive + 1;
            }

            if (nums[i] == 0)
                prevPositive = prevNegative = 0;

            maxLen = max(prevPositive, maxLen);
        }

        return maxLen;
    }
}
