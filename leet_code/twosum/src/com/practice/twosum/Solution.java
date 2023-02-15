package com.practice.twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null) {
                return new int[] {i, complementIndex};
            }
            complements.put(target - nums[i], i);
        }
        return nums;
    }
}

// Input: nums = [3,2,4], target = 6
// Output: [1,2]

// use hashmap to assign k,v pairs to check for matches
// k = complement of element
// v = current index
