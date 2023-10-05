/*
Link: https://leetcode.com/problems/is-subsequence/
Theory:
    1. Convert both the strings into char Array
    2. Initialize i and j with the last indexes of the two char array
    3. If char in j and i are equal, decrement j
    4. If j == -1, indicates all characters in s are present in t in the order
    5. Thus return true, else false
 */

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() <= 0) return true;
        char[] tChar = t.toCharArray();
        char[] sChar = s.toCharArray();
        int j = sChar.length - 1;
        for (int i=tChar.length-1; i>=0; i--) {
            if (tChar[i] == sChar[j]) {
                j--;
                if (j==-1){
                    return true;
                }
            }
        }
        return false;
    }
}
