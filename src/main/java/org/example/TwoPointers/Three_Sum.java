package org.example.TwoPointers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Three_Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet();
        Arrays.sort(nums);
        return IntStream.range(0, nums.length).mapToObj(i -> {
            int compareI = i + 1;
            int compareJ = nums.length-1;
            while(compareI < compareJ) {
                int sum = nums[i] + nums[compareI] + nums[compareJ];
                if (sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[compareI], nums[compareJ]));
                    compareI++;
                    compareJ--;
                }
                else if (sum < 0) compareI ++;
                else compareJ --;
            }
            return set;
        }).flatMap(Collection::stream).distinct().collect(Collectors.toList());
    }

    public static List<List<Integer>> threeSum2(int[] nums) {
        Set<List<Integer>> set = new HashSet();
        Arrays.sort(nums);
        IntStream.range(0, nums.length).forEach(i -> {
            int compareI = i + 1;
            int compareJ = nums.length-1;
            while(compareI < compareJ) {
                int sum = nums[i] + nums[compareI] + nums[compareJ];
                if (sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[compareI], nums[compareJ]));
                    compareI++;
                    compareJ--;
                }
                else if (sum < 0) compareI ++;
                else compareJ --;
            }
        });
        return new ArrayList<>(set);
    }
    public static List<List<Integer>> threeSum3(int[] nums) {
        Set<List<Integer>> set = new HashSet();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int tempI = i + 1;
            int tempJ = nums.length-1;
            while (tempI < tempJ) {
                if (nums[i] + nums[tempI] + nums[tempJ] == 0) {
                    set.add(Arrays.asList(nums[i],nums[tempI],nums[tempJ]));
                    tempI++;
                    tempJ--;
                } else if (nums[i] + nums[tempI] + nums[tempJ] > 0) tempJ --;
                else tempI ++;
            }
        }
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        List<List<Integer>> threeSum = threeSum(new int[]{3,0,-2,-1,1,2});
    }
}







/**
 * class Solution {
 *     public List<List<Integer>> threeSum(int[] nums) {
 *         int target = 0;
 *         Arrays.sort(nums);
 *         Set<List<Integer>> s = new HashSet<>();
 *         List<List<Integer>> output = new ArrayList<>();
 *         for (int i = 0; i < nums.length; i++){
 *             int j = i + 1;
 *             int k = nums.length - 1;
 *             while (j < k) {
 *                 int sum = nums[i] + nums[j] + nums[k];
 *                 if (sum == target) {
 *                     s.add(Arrays.asList(nums[i], nums[j], nums[k]));
 *                     j++;
 *                     k--;
 *                 } else if (sum < target) {
 *                     j++;
 *                 } else {
 *                     k--;
 *                 }
 *             }
 *         }
 *         output.addAll(s);
 *         return output;
 *     }
 * }
 */