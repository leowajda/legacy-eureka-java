package array.iterative;

public class LC_0413 {
    public int numberOfArithmeticSlices(int[] nums) {

        if (nums.length < 3)
            return 0;

        int arithmeticSlices = 0, prevSlices = 0;
        for (int i = 2; i < nums.length; i++) {
            prevSlices = (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) ? prevSlices + 1 : 0;
            arithmeticSlices += prevSlices;
        }

        return arithmeticSlices;
    }
}
