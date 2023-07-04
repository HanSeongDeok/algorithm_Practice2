package org.example.arrayhashing;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        final int MAX_INDEX = 0;
        final int [] max = new int[1];
        final int [] maxCompare = new int [1];
        final int [] sortedNum = Arrays.stream(nums).sorted().toArray();

        IntStream.range(0, sortedNum.length-1).filter(value ->
            (nums[value] != nums[value+1] || (value != 0 && nums[value] != nums[value-1]))
        ).forEach(value -> {
            int currentCount = max[MAX_INDEX];
            if (nums[value] + 1 == nums[value + 1]) {
                max[MAX_INDEX] = ++currentCount;
            } else max[MAX_INDEX] = 0;

            maxCompare[MAX_INDEX] = Math.max(max[MAX_INDEX], maxCompare[MAX_INDEX]);
        });
        return maxCompare[0];
    }

    public static void main(String[] args) {
        
    }
}
