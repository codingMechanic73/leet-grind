package twosum;

import java.util.*;

public class Solution {
    private Solution() {
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            if (map.containsKey(nums[index])) {
                return new int[]{map.get(nums[index]), index};
            } else {
                int complement = target - nums[index];
                map.put(complement, index);
            }
        }
        throw new RuntimeException("No Solution!");
    }
}
