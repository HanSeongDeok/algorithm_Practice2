package org.example.windowsliding;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class MinWindow {
    public String solution(String t, String s) {
        if (t == null || s == null || t.isEmpty() || s.isEmpty() || s.length() > t.length()) return "";

        return "";
    }

    public String minWindow(String s, String t) {
           if (s == null || t == null || s.isEmpty() || t.isEmpty() || t.length() > s.length()) return "";
          int count = t.length(), end = 0, start = 0, minWindow = Integer.MAX_VALUE, startIndex = 0;
          char[] sArr = s.toCharArray();
          int [] tArr = new int[128];
          IntStream.range(0, t.length()).forEach(i -> tArr[t.charAt(i)]++);
          while (end < s.length()) {
              if (tArr[sArr[end++]]-- > 0) count--;
              while (0 == count) {
                 if (end - start < minWindow) {
                      startIndex = start;
                      minWindow = end - start;
                  }
                  count = (tArr[sArr[start++]]++ == 0) ? count+1 : count;
              }
          }
          return minWindow == Integer.MAX_VALUE ? "" :s.substring(startIndex, startIndex + minWindow);
      }

    public static void main(String[] args) {
        System.out.println(new MinWindow().minWindow("AABBCC", "ABC"));
    }
}



/**
 * class Solution {
 *     public String minWindow(String s, String t) {
 *          if (s == null || t == null || s.isEmpty() || t.isEmpty() || t.length() > s.length()) return "";
 *         int count = t.length(), end = 0, start = 0, minWindow = Integer.MAX_VALUE, startIndex = 0;
 *         char[] sArr = s.toCharArray();
 *         int [] tArr = new int[128];
 *         IntStream.range(0, t.length()).forEach(i -> tArr[t.charAt(i)]++);
 *         while (end < s.length()) {
 *             if (tArr[sArr[end++]]-- > 0) count--;
 *             while (0 == count) {
 *                if (end - start < minWindow) {
 *                     startIndex = start;
 *                     minWindow = end - start;
 *                 }
 *                 count = (tArr[sArr[start++]]++ == 0) ? count+1 : count;
 *             }
 *         }
 *         return minWindow == Integer.MAX_VALUE ? "" :s.substring(startIndex, startIndex + minWindow);
 *     }
 * }
 */