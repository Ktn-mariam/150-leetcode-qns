/*
Link: https://leetcode.com/problems/longest-common-prefix/
Theory:
    1. Sort the array containing all the strings
    2. Then we compare the first and the last string since they will be the least similar after sorting
    3. Run a while loop for length that is common for both the strings
    4. If the character at an index is common, increment the length, else break
    5. Return the substring starting from 0 to the length
 */


import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
}
