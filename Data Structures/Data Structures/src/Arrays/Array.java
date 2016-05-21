package Arrays;

public class Array {

	private int[] myArray = { 11, 11, 13, 18, 15, 19, 13, 11, 14, 17 };

	private int size = myArray.length;

	public void printArray() {

		for (int i = 0; i < size; i++) {

			System.out.print(i + " -> ");
			System.out.println(myArray[i]);

		}

	}
	
	public int findItem(int index) {

		if (index < size)
			return myArray[index];
		return 0;

	}

	public boolean isPresent(int value) {

		for (int i = 0; i < size; i++) {
			if (myArray[i]==value)
				return true;
		}
		return false;
	}

	public void deleteItem(int index) {

		for (int i = index; i < size - 1; i++) {
			myArray[i] = myArray[i + 1];
		}
		size--;
	}

	public void insertItem(int value) {

		myArray[size] = value;
		size++;
	}
	
	public String searchItem(int value){
		
		String indices = "";
		
		Boolean isPresent = false;
		
		System.out.println("\nThe item was found at:");
		
		for (int i = 0; i < size; i++){
			
			if (myArray[i]==value){
				
				isPresent = true;
				System.out.print(i+" ");
				indices+=i;
			}
						
		}
		if(!isPresent){
			System.out.println("-");
		}
		
		
		return  indices;
	}

}
