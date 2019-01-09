package datastructures.stack;

import java.util.ArrayList;
import java.util.List;

public class StackImpl {

    private List<Integer> stackList;

    public StackImpl(List<Integer> stackList) {
        this.stackList = stackList;
    }

    public void pushStack(int value) {
        stackList.add(value);
    }

    public Integer popStack() {
        if (stackList.size() > 0) {
            int top = stackList.get(stackList.size() - 1);
            stackList.remove(stackList.size() - 1);
            System.out.println("top is :: " + top);
            return top;
        }
        return null;
    }

    public Integer peekStack() {
        if (stackList.size() > 0) {
            return stackList.get(stackList.size() - 1);
        }
        return null;
    }

    public int searchStack(int pos) {
        return stackList.get(pos);
    }

    public static void main(String ar[]) {
        StackImpl stackImpl = new StackImpl(new ArrayList<>());
        for (int i = 0; i < 10; i++) {
            stackImpl.pushStack(i);
        }
        for (int i = 0; i < stackImpl.stackList.size(); i++) {
            stackImpl.popStack();
        }
    }
}
