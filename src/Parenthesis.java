import java.util.Scanner;
import java.util.Stack;
public class Parenthesis {

        public static boolean isBalanced(String expression) {
            Stack<Character> stack = new Stack<>();
            for (char ch : expression.toCharArray()) {
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                }
                else if (ch == ')' || ch == '}' || ch == ']') {
                    if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }

        private static boolean isMatchingPair(char open, char close) {
            return (open == '(' && close == ')') ||
                    (open == '{' && close == '}') ||
                    (open == '[' && close == ']');
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String expression = sc.nextLine();
            boolean balanced = isBalanced(expression);

            System.out.println("Expression: " + expression);
            System.out.println("Is Balanced: " + balanced);
        }
    }







