
public class App {

	public static void main(String[] args) {

		Array array1 = new Array();

		System.out.println("The Given Array is:");
		array1.printArray();

		// System.out.println("Bubble Sort:");
		// array1.bubbleSort();

		// System.out.println("Selection Sort:");
		// array1.selesctionSort();

		System.out.println("Insertion Sort:");
		array1.insertionSort();
		
		System.out.println("Binary Search:");
		array1.binarySearch(17);

	}

}
