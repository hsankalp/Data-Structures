package Stack;

public class App {

	public static void main(String[] args) {

		Stack stack1 = new Stack(3);
		
		stack1.push("23");
		
		stack1.push("56");
		
		stack1.push("29");
		
		stack1.push("18");
		
		stack1.topOfStack();
		
		stack1.pop();
		
		stack1.pop();
		
		stack1.topOfStack();
		
	}

}
