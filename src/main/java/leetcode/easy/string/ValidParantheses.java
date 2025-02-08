package leetcode.easy.string;

import java.util.Stack;

/**
 * Created by nikoo28 on 7/11/19 2:00 AM
 */

public class ValidParantheses {

  public boolean isValid(String s) {

    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {

      if (c == '(')
        stack.push(')');
      else if (c == '{')
        stack.push('}');
      else if (c == '[')
        stack.push(']');

      else if (stack.isEmpty() || stack.pop() != c)
        return false;
    }
    return stack.isEmpty();

  }

}
