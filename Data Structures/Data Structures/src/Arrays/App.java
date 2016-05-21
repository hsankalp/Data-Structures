package Arrays;

public class App {

	public static void main(String[] args) {

		Array array1 =  new Array();
		
		array1.printArray();
		
		System.out.println(array1.findItem(5));
		
		System.out.println(array1.isPresent(18));
		
		array1.deleteItem(6);
		
		System.out.println("\nAfter Deletion:");
		
		array1.printArray();
		
		array1.insertItem(10);
		
		System.out.println("\nAfter Insertion:");
		
		array1.printArray();
		
		array1.searchItem(11);

	}

}
