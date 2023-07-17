package org.example.TwoPointers;

import java.util.stream.IntStream;

public class Container_With_Most_Water {
    public int maxArea(int[] height){
        int i = 0;
        int j = height.length-1;
        int max = 0;
        while (i < j) {
            int currentArea = height[i] < height[j] ? height[i] * (j-i) : height[j] * (j-i);
            max = Math.max(currentArea, max);
            if (height[i] < height[j]) i ++;
            else j--;
        }
        return max;
    }

    public int maxArea2(int[] height) {
        int i = 0;
        int j = height.length-1;
        int max = 0;

        while (i < j) {
            int currentArea = height[i] < height[j] ? height[i] * (j - i) : height[j] * (j - i);
            max = Math.max(currentArea, max);
            if (height[i] < height[j]) i++;
            else j--;
        }
        return max;
    }
}
