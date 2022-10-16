package array.iterative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_0015 {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++)
            if (i == 0 || nums[i] != nums[i - 1])
                helper(nums, i, result);

        return result;
    }

    private void helper(int[] nums, int i, List<List<Integer>> result) {

        int left = i + 1, right = nums.length - 1;

        while (left < right) {

            int sum = nums[i] + nums[left] + nums[right];
            if (sum == 0) {
                result.add(List.of(nums[i], nums[left++], nums[right--]));
                while (left < right && nums[left - 1] == nums[left])
                    left++;
            }

            if (sum > 0) right--;
            if (sum < 0) left++;
        }

    }
}
