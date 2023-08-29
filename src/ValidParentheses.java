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
