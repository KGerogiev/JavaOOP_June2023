package P04_StackOfStrings_LAB;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        StackOfStrings stack = new StackOfStrings();

        stack.push("one");
        stack.push("two");
        stack.push("three");

        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
