package Stack;

public class stackx {
	private char[] stackArr;
	private int maxSize;
	private int top;

	public stackx(int maxSize) {

		this.maxSize = maxSize;
		stackArr = new char[maxSize];
		top = -1;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (maxSize - 1 == top);
	}

	public void push(char c) {
		if (isFull()) {
			System.out.println("stack is full");
		} else {
			stackArr[++top] = c;
		}
	}

	public char peek() {
		if (isEmpty()) {
			System.out.println("stack is empty");
			return 0;
		} else {
			return stackArr[top];
		}

	}

	public char pop() {
		if (isEmpty()) {
			return 0;
		} else {
			return stackArr[top--];
		}
	}
}
