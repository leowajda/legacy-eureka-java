package array.iterative;

public class LC_0162 {
    public int findPeakElement(int[] nums) {

        int left = 0, right = nums.length - 1;
        int result = -1;

        while (left <= right) {

            int middle = left + (right - left) / 2;
            if (middle + 1 == nums.length || nums[middle] > nums[middle + 1]) {
                right = middle - 1;
                result = middle;
            }
            else left = middle + 1;
        }

        return result;
    }
}
