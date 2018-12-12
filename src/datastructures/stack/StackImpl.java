package datastructures.stack;

import java.util.Stack;

public class StackImpl {
    //constructor

    //push
    public void pushStack(Stack<Integer> stack, int value) {
        stack.push(value);
    }

    //pop
    public int popStack(Stack<Integer> stack, int value) {
        return stack.pop();
    }

    //peek
    public int peekStack(Stack<Integer> stack) {
        return stack.peek();
    }

    //search
    public int searchStack(Stack<Integer> stack, int pos) {
        return stack.search(pos);
    }
    //test

    public static void main(String ar[]) {
        Stack<Integer> stack = new Stack<>();
        // push
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
//        System.out.println(stack.pop());
        //peek
        for (int i : stack) {
            System.out.println(stack.peek());
        }

        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }
}
