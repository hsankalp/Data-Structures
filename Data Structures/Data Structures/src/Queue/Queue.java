package Queue;
import java.util.Arrays;

public class Queue {

	private String[] myArray;
	private int size;
	private int front, rear, numberOfItems = 0;

	public Queue(int size) {
		this.size = size;
		myArray = new String[size];
		Arrays.fill(myArray, "-1");
	}

	public void printQueue() {
		for (int i = 0; i < size; i++) {
			System.out.print(i + " -> ");
			if (myArray[i] == "-1") {
				System.out.println();
			} else {
				System.out.println(myArray[i]);
			}
		}
	}
	
	// 1. INSERT

	public void insert(String value) {
		if (numberOfItems + 1 <= size) {
			myArray[rear] = value;
			rear++;
			numberOfItems++;
			System.out.println("Inserted item: " + value);
		} else {
			System.out.println("The Queue is Full!");
		}
		printQueue();
	}

	// 2. REMOVE

	public void remove() {
		if (numberOfItems > 0) {
			System.out.println("Removed item: " + myArray[front]);
			myArray[front] = "-1";
			front++;
			numberOfItems--;
		} else {
			System.out.println("Stack Empty!");
		}
		printQueue();
	}

	// 3. FRONT OF QUEUE

	public void frontOfQueue() {
		if (numberOfItems > 0) {
			System.out.println("Front of the Queue is: " + myArray[front]);
		} else {
			System.out.println("Stack Empty!");
		}
	}
}
