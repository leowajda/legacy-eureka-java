package array.recursive;

import java.util.HashMap;
import java.util.Map;

public class LC_0001 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        return helper(nums, target, 0, map);
    }

    private static int[] helper(int[] nums, int target, int i, Map<Integer, Integer> map) {

        int complement = target - nums[i];
        if (map.containsKey(complement))
            return new int[] { map.get(complement), i };

        map.put(nums[i], i);
        return helper(nums, target, i + 1, map);
    }

}
