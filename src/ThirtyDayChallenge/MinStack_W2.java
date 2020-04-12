package ThirtyDayChallenge;

import java.util.LinkedList;
import java.util.Stack;

public class MinStack_W2 {
	private Stack<Integer> stack = new Stack<Integer>();
	private Stack<Integer> minValues = new Stack<Integer>();

	public static void main(String[] args) {
		MinStack_W2 stack = new MinStack_W2();
		stack.push(5);
		stack.push(9);
		stack.push(4);

		int a = stack.getMin();
		stack.pop();
		int c = stack.top();
		int d = stack.getMin();

	}

	public MinStack_W2() {

	}

	public void push(int x) {
		stack.push(x);
		pushToMinStack(x);
	}

	private void pushToMinStack(int x) {
		if (minValues.isEmpty() || x <= minValues.peek())
			minValues.push(x);
	}

	public void pop() {
		int poppedVal = stack.pop();
		if (minValues.peek() == poppedVal)
			minValues.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minValues.peek();
	}
}
