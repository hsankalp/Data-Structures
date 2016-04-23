
public class Array {

	private int[] myArray = { 11, 11, 13, 18, 15, 19, 13, 11, 14, 17 };

	private int size = myArray.length;

	public void printArray() {
		for (int i = 0; i < size; i++) {
			System.out.print(i + " -> ");
			System.out.println(myArray[i]);
		}
		System.out.println();
	}
	
	// 1. BUBBLE SORT

	public void bubbleSort() {
		for (int i = size - 1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if (myArray[j] > myArray[j + 1]) {
					swap(j, j + 1);
					printArray();
				}
				printArray();
			}
		}
	}
	
	// 2. SELECTION SORT

	public void selesctionSort() {
		for (int i = 0; i < size; i++) {
			int min = i;
			for (int j = i; j < size; j++) {
				if (myArray[min] > myArray[j]) {
					min = j;
				}
			}
			swap(i, min);
			printArray();
		}
	}
	
	// 3. INSERTION SORT

	public void insertionSort() {
		for (int i = 0; i < size; i++) {
			int j = i;
			int key = myArray[i];
			while (j > 0 && myArray[j - 1] > key) {
				myArray[j] = myArray[j - 1];
				j--;
				printArray();
			}
			myArray[j] = key;
			printArray();
		}
	}

	public void swap(int j1, int j2) {
		int temp = myArray[j1];
		myArray[j1] = myArray[j2];
		myArray[j2] = temp;
	}
	
	// 4. BINARY SEARCH

	public void binarySearch(int value) {
		int low = 0;
		int high = size - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (myArray[mid] > value) {
				high = mid;
			} else if (myArray[mid] < value) {
				low = mid;
			} else {
				System.out.println("Item found at index: " + mid);
				low = high + 1;
			}
		}
	}
}
