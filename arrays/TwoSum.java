/*
Problem: Two Sum
LeetCode: https://leetcode.com/problems/two-sum/

Input:
nums = array of integers
target = integer

Output:
indices of two numbers whose sum equals target

Approach:
Use HashMap to store numbers and their index.
For each number, check if target - current exists.

Time: O(n)
Space: O(n)
*/

import java.util.HashMap;

class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int need = target - nums[i];

            if (map.containsKey(need)) {
                return new int[]{ map.get(need), i };
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
