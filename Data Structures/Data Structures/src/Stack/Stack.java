package Stack;
import java.util.Arrays;

public class Stack {

	private String[] myArray;
	private int size;
	private int top = -1;

	public Stack(int size) {
		this.size = size;
		myArray = new String[size];
		Arrays.fill(myArray, "-1");
	}

	public void printStack() {
		for (int i = 0; i < size; i++) {
			System.out.print(i + " -> ");
			if (myArray[i] == "-1") {
				System.out.println();
			} else {
				System.out.println(myArray[i]);
			}
		}
	}

	// 1. PUSH

	public void push(String value) {
		if (top + 1 < size) {
			top++;
			myArray[top] = value;
			System.out.println("Pushed item: " + value);
		} else {
			System.out.println("The Stack is Full!");
		}
		printStack();
	}

	// 2. POP

	public void pop() {
		if (top >= 0) {
			System.out.println("Popped item: " + myArray[top]);
			myArray[top] = "-1";
			top--;
		} else {
			System.out.println("Stack Empty!");
		}
		printStack();
	}

	// 3. TOP OF STACK

	public void topOfStack() {
		if (top >= 0) {
			System.out.println("Top of the Stack is: " + myArray[top]);
		} else {
			System.out.println("Stack Empty!");
		}
	}
}
