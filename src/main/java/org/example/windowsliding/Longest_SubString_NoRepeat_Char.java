package org.example.windowsliding;

import java.util.HashSet;
import java.util.Set;

public class Longest_SubString_NoRepeat_Char {
    public int lengthOfLongestSubstring(String s) {
        int i=0, j=0, max=0;
        Set<Character> set = new HashSet<>();
        while (i < s.length()) {
            if (!set.add(s.charAt(i))) set.remove(s.charAt(j++));
            else {
                i++;
                max = Math.max(max, set.size());
            }
        }
        return max;
    }
}
