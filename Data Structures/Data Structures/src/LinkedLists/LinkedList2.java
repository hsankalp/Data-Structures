package LinkedLists;

public class LinkedList2 {

	// Head of the List
	public Node head;

	/////////////////////////////////////////////////////////
	// DISPLAY THE LIST
	public void display() {

		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

	/////////////////////////////////////////////////////////
	// INSERT AT THE END/APPEND
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
	// SWAP 2 NODES
	public void swapNodes(int x, int y){
		
		if(x==y)
			return;
		
		Node currX = head;
		Node prevX = null;
		
		while(currX!=null && currX.data!=x){
			prevX=currX;
			currX=currX.next;
			
		}
		
		Node currY = head;
		Node prevY = null;
		
		while(currY!=null && currY.data!=y){
			prevY=currY;
			currY=currY.next;
			
		}
		
		if(currX==null||currY==null)		//if x or y not present
			return;
		
		if(prevX!=null){					//check if x is head
			prevX.next = currY;
		}else{
			head = currY;
		}
		
		if(prevY!=null){					//check if y is head
			prevY.next = currX;
		}else{
			head = currX;
		}
		
		Node temp = currX.next;				//swap
		currX.next = currY.next;
		currY.next = temp;
	}

	/////////////////////////////////////////////////////////
	// REVERSE

	public void reverse(){
		
		Node curr = head;
		Node prev = null;
		Node next = null;
		
		while(curr!=null){
			
			next = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = next;
			
		}
		
		head = prev;
		return;
	}

	/////////////////////////////////////////////////////////
	public static void main(String[] args) {

		LinkedList2 list = new LinkedList2();

		list.inserAtEnd(5);
		list.inserAtEnd(3);
		list.inserAtEnd(2);
		list.inserAtEnd(7);
		list.inserAtEnd(9);
		list.inserAtEnd(1);
		list.display();
		//list.swapNodes(3,9);
		
		list.reverse();
		list.display();
	}

}
