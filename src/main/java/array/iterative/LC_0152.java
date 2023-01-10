package array.iterative;

import java.util.stream.IntStream;

import static java.lang.Math.max;

public class LC_0152 {
    public int maxProduct(int[] nums) {

        int localMin = nums[0], localMax = nums[0];

        int maxProduct = localMax;
        for (int i = 1; i < nums.length; i++) {

            int prevMin = localMin, prevMax = localMax;
            localMin = IntStream.of(nums[i], prevMin * nums[i], prevMax * nums[i]).min().orElseGet(() -> 0);
            localMax = IntStream.of(nums[i], prevMin * nums[i], prevMax * nums[i]).max().orElseGet(() -> 0);

            maxProduct = max(maxProduct, localMax);
        }

        return maxProduct;
    }
}
