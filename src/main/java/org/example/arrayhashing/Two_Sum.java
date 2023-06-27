package org.example.arrayhashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class Two_Sum {
    private static int index = 0;
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int[] sums = new int[2];
        Arrays.stream(nums).forEach(v -> map.put(v, index++));


        return sums;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        twoSum(nums,9);
    }
}



/**
 * class Solution {
 *     public int[] twoSum(int[] nums, int target) {
 *         List<Integer> solution = new ArrayList<>();
 *         Map<Integer, Integer> map = new HashMap();
 *         for(int i=0; i< nums.length; i++) map.put(nums[i], i);
 *         for(int i=0; i< nums.length; i++){
 *             if(map.containsKey(target - nums[i])&&i!=map.get(target - nums[i])){
 *                 solution.add(i);
 *                 solution.add(map.get(target-nums[i]));
 *                 return solution.stream().mapToInt(Integer::intValue).toArray();
 *             }
 *         }
 *         return null;
 *     }
 * }
 *
 */