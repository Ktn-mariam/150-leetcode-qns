/*
Link: https://leetcode.com/problems/valid-parentheses/
Theory:
    1-Create an ArrayDeque character obj
    2-Run a for loop for every character in the string
    3-create a switch statement
    4-If it is an opening bracket, push the element in the array
    5-If it is a closing bracket, pop an element from the array
    6-The popped element should be the closing bracket's equivalent
      opening bracket, if not return false
    7-Also return false if there is no element to pop
    8-After completing the loop the stack should be empty, if not return
      false
 */

import java.util.*;
public class ValidParentheses {
    public boolean isValid(String s) {
        ArrayDeque<Character> stk = new ArrayDeque<Character>();
        for (char c: s.toCharArray()){
            switch(c) {
                case '(':
                case '[':
                case '{':
                    stk.push(c);
                    break;
                case ')':
                    if (stk.isEmpty() || stk.pop() != '(') return false;
                    break;
                case '}':
                    if (stk.isEmpty() || stk.pop() != '{') return false;
                    break;
                case ']':
                    if (stk.isEmpty() || stk.pop() != '[') return false;
                    break;
                default:
                    break;
            }
        }
        return stk.isEmpty();
    }
}

/*
NEW SYNTAX LEARNT:
    1-Inbuilt structure to use for stack:
        ArrayDeque<E> stk = new ArrayDeque<E>();
    2-Functions of ArrayDeque
        aq.push(): void function
        aq.pop(): returns an element else error if empty
        aq.isEmpty() : returns boolean
    3-String to character array:
        string.toCharArray()
 */