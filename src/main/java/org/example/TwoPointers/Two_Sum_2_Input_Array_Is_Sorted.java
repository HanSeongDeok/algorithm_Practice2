package org.example.TwoPointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Two_Sum_2_Input_Array_Is_Sorted {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap();
        IntStream.range(0, numbers.length).forEach(i -> map.put(numbers[i],i));

        return IntStream.range(0,numbers.length)
                .filter(i -> map.containsKey(target - numbers[i]))
                .filter(i -> map.get(target - numbers[i]) != i)
                .mapToObj(i -> {
                    int [] twoSumNum = new int[2];
                    twoSumNum[0] = i;
                    twoSumNum[1] = map.get(target - numbers[i]);
                    return twoSumNum;
                }).findFirst().orElse(new int[0]);
    }
}
/**
 *   public int[] twoSum(int[] nums, int target) {
 *          Map<Integer, Integer> map = new HashMap();
 *         int [] twoNums = new int[2];
 *
 *         IntStream.range(0, nums.length).forEach(value -> map.put(nums[value], value));
 *         return IntStream.range(0, nums.length)
 *                 .filter(value -> map.containsKey(target - nums[value]))
 *                 .filter(value -> value != map.get(target - nums[value]))
 *                 .mapToObj(value -> {
 *                     twoNums[0] = value;
 *                     twoNums[1] = map.get(target - nums[value]);
 *                     return twoNums;
 *                 }).findFirst().orElse(new int[0]);
 *     }
 */
