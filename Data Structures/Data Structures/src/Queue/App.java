package Queue;

public class App {

	public static void main(String[] args) {

		Queue queue1 = new Queue(10);
		
		queue1.insert("10");
		queue1.insert("20");
		queue1.insert("15");
		queue1.insert("35");
		
		queue1.frontOfQueue();
		
		queue1.remove();
		queue1.remove();
		
		queue1.frontOfQueue();
		
	}

}
