package race2023.n01;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String correctedString = correctString(s);
        System.out.println(correctedString);
    }

    public static String correctString(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && Character.toLowerCase(stack.peek()) == Character.toLowerCase(c) && stack.peek() != c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        String correctedString = sb.toString();
        if (!correctedString.isEmpty()) {
            return correctedString;
        } else {
            return "kong";
        }
    }
}