package org.example.TwoPointers;

/**
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 */

public class Trapping_rain_water {


}




















/**
 * public int trap(int[] A) {
 *         if (A==null) return 0;
 *         Stack<Integer> s = new Stack<Integer>();
 *         int i = 0, maxWater = 0, maxBotWater = 0;
 *         while (i < A.length){
 *             if (s.isEmpty() || A[i]<=A[s.peek()]){
 *                 s.push(i++);
 *             }
 *             else {
 *                 int bot = s.pop();
 *                 maxBotWater = s.isEmpty()? // empty means no il
 *                 0:(Math.min(A[s.peek()],A[i])-A[bot])*(i-s.peek()-1);
 *                 maxWater += maxBotWater;
 *             }
 *         }
 *         return maxWater;
 *     }
 */

/**
 * class Solution {
 *     public int trap(int[] height) {
 *         int left = 0, right = height.length - 1;
 *         int leftMax = height[0], rightMax = height[height.length - 1];
 *         int water = 0;
 *         while (left < right) {
 *             if (leftMax < rightMax) {
 *                 left++;
 *                 if (leftMax < height[left]) {
 *                     leftMax = height[left];
 *                 } else {
 *                     water += leftMax - height[left];
 *                 }
 *             } else {
 *                 right--;
 *                 if (rightMax < height[right]) {
 *                     rightMax = height[right];
 *                 } else {
 *                     water += rightMax - height[right];
 *                 }
 *             }
 *         }
 *         return water;
 *     }
 * }
 */