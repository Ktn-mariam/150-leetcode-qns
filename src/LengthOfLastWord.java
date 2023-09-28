/*
Link: https://leetcode.com/problems/length-of-last-word/
Theory:
    Trim the string and convert it into a char array
    Start from the end and increment the length as long as it we dont encounter a space
    break when a space is encountered
    return the length
 */


public class LengthOfLastWord {
    // Best solution
    public int lengthOfLastWord(String s) {
        char[] sc = s.trim().toCharArray();
        int length = 0;
        for (int i=sc.length-1; i>=0; i--) {
            if (sc[i] == ' ') break;
            else  length++;
        }

        return length;
    }
}
/*
NEW SYNTAX
    1. s.trim(): to remove and leading and trailing whitespaces in a string
    2. s.length(): to find the length of the string
    3. arr.length: to find the length of an array
 */