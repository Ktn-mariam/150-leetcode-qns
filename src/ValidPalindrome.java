/*
Link: https://leetcode.com/problems/valid-palindrome/
Theory:
    1. Initialise left and right pointers for the string
    2. Run a while for till left < right
    3. If char at left is not a alphabet, increment left
    4. If char at right is not a alphabet, decrement right
    5. else if they are not the same after lowering the case, return false
    6. Else increment left and decrement right
    7. Return true on leaving the while loop
 */

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }
}

/*
New Syntax learnt:
    1. Character.isLetterOrDigit(char c): to check if char is a number or alphabet
    2. Character.toLowerCase(char c): to lowerCase a char
 */