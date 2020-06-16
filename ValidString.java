import java.util.Stack;

/**
 * 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 */
public class ValidString {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char ch : chars) {
            switch (ch) {
                case ')':
                    if (stack.isEmpty() || stack.peek() != '(') return false;
                    else if (!stack.isEmpty()) stack.pop();
                    break;
                case ']':
                    if (stack.isEmpty() || stack.peek() != '[') return false;
                    else if (!stack.isEmpty()) stack.pop();
                    break;
                case '}':
                    if (stack.isEmpty() || stack.peek() != '{') return false;
                    else if (!stack.isEmpty()) stack.pop();
                    break;
                default:
                    stack.push(ch);
            }
        }
        return stack.isEmpty() ? true : false;
    }

    public static void main(String[] args) {
        boolean res = new ValidString().isValid("([)])");
        System.out.println(res);
    }
}