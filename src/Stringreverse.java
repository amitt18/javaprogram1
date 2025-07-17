import java.util.Scanner;
import java.util.Stack;

public class Stringreverse {
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();

        // Push each character of the string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();

        // Pop characters from the stack to form the reversed string
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}
