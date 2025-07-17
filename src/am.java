import java.util.*;
public class am {
    public static boolean valid(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if ((c == ')' || c == ']' || c == '}')) {
                if (stack.isEmpty() || !ismatch(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
        public static boolean ismatch(int open,int close){
        return (open=='(' && close==')'|| open=='['&& close==']'|| open=='{'&& close=='}');
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(valid(str)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    }

