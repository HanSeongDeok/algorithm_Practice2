package org.example.windowsliding;

public class Longest_Repeating_Character_Replacement {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int largestCount = 0, beg = 0, maxlen = 0;
        for(int end = 0; end < s.length(); end ++){
            largestCount = Math.max(largestCount, ++arr[s.charAt(end) - 'A']);
            if(end - beg + 1 - largestCount > k){
                arr[s.charAt(beg++) - 'A']--;
            }
            maxlen = Math.max(maxlen, end - beg + 1);
        }
        return maxlen;
    }

    public int characterReplacement2(String s, int k) {
        int i = 0, j =0, len=s.length();
        
        return 0;
    }
}
