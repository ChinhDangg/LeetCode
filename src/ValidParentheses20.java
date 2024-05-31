package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ValidParentheses20 {
    public static boolean isValid(String s) {
        HashMap<Character, Character> parenthesis = new HashMap<>();
        parenthesis.put(']', '[');
        parenthesis.put(')', '(');
        parenthesis.put('}', '{');

        List<Character> open = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (parenthesis.get(c) == null)
                open.add(c);
            else if (open.isEmpty() || parenthesis.get(c) != open.removeLast())
                return false;
        }
        return open.isEmpty();
    }

    public static void main(String[] args) {
        String p = "{([]){}}()()";
        System.out.println(isValid(p));
    }
}
