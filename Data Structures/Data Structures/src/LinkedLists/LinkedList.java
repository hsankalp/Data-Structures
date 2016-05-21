package LinkedLists;

public class LinkedList {

	// Head of the List
	public Node head;

	/////////////////////////////////////////////////////////
	// 1. DISPLAY THE LIST
	public void display() {

		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

	/////////////////////////////////////////////////////////
	// 2. INSERT AT THE BEGINNING
	public void insertAtFront(int item) {

		Node newNode = new Node(item);

		newNode.next = head;
		head = newNode;

	}

	/////////////////////////////////////////////////////////
	// 3. INSERT AFTER A GIVEN NODE
	public void insertAfter(Node prevNode, int item) {

		if (prevNode == null) {
			System.out.println("Prev Node cannot be null");
		} else {
			Node newNode = new Node(item);
			newNode.next = prevNode.next;
			prevNode.next = newNode;
		}

	}

	/////////////////////////////////////////////////////////
	// 4. INSERT AT THE END/APPEND
	public void inserAtEnd(int item) {

		Node newNode = new Node(item);

		if (head == null) {

			head = newNode;
			return;
		}
		newNode.next = null;

		Node tail = head;

		while (tail.next != null) {
			tail = tail.next;
		}
		tail.next = newNode;

	}

	/////////////////////////////////////////////////////////
	// 5. REMOVE A GIVEN KEY
	public void deleteNode(int key) {

		Node temp = head;
		Node prev = null;

		if (temp != null && temp.data == key) {
			head = temp.next;
			return;
		}

		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}

		if (temp == null) {
			return;
		}

		prev.next = temp.next;

	}

	/////////////////////////////////////////////////////////
	// 5. REMOVE AT GIVEN POSITION
	public void deleteAtPos(int pos) {

		if (head == null) {
			return;
		}

		Node temp = head;

		if (pos == 0) {
			head = temp.next;
			return;
		}

		for (int i = 0; temp != null && i < pos - 1; i++) {
			temp = temp.next;
		}

		if (temp == null || temp.next == null) {
			return;
		}

		Node nextNode = temp.next.next;
		temp.next = nextNode;

	}
	/////////////////////////////////////////////////////////
	// 6. SIZE OF LIST
	
	public void sizeOfList(){
		
		int counter = 0;
		Node temp = head;
		
		while(temp!=null){
			temp = temp.next;
			counter++;
		}
		System.out.println("\nSize: "+counter);
	}

	/////////////////////////////////////////////////////////
	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.inserAtEnd(5);
		list.inserAtEnd(3);

		list.insertAtFront(6);

		list.inserAtEnd(2);
		list.inserAtEnd(7);

		list.insertAtFront(8);

		list.inserAtEnd(9);
		list.inserAtEnd(1);

		list.insertAfter(list.head.next.next, 9);

		list.deleteNode(9);

		list.deleteAtPos(0);
		list.deleteAtPos(4);

		list.display();
		list.sizeOfList();
	}

}
