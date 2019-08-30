package com.leetcode.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>(32);
        int max = 0;
        int sum = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (map.containsKey(s.charAt(i))) {
                Integer index = map.get(s.charAt(i));
                map = new HashMap<>(32);
                for (int j = index+1; j <= i; ++j){
                   map.put(s.charAt(j), j);
                }
                sum = i - index;
            } else {
                ++sum;
                map.put(s.charAt(i), i);
            }
            if (sum > max) {
                max = sum;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters app = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(app.lengthOfLongestSubstring("bbbbb"));
    }


}
