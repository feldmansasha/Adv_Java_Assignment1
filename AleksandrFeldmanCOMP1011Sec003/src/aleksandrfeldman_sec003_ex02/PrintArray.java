package aleksandrfeldman_sec003_ex02;

public class PrintArray {
	public static void main(String[] args) {
		Double [] grades= {56.7, 89.23, 45.56, 88.40, 90.56};
		String[] product= {"iphone", "Galaxy", "Pixel", "Nokia"};
		Character[] status= {'y', 'n', 'i', 'd', 'e'};
		
		System.out.println("Version 1");
		printArray(grades);
		printArray(product);
		printArray(status);
		
		System.out.println("\nVersion 2");
		printArray(grades, 2);
		printArray(product, 1);
		printArray(status, 6);
		
		System.out.println("\nVersion 3");
		printArray(grades, -1, 3);
		printArray(product, 1, 3);
		printArray(status, 2, 6);
	}
	
	//Function to display arrays 
	public static <T> void printArray(T[] inputArray) {
		for (T number : inputArray) {
			System.out.print(number+"\t");
		}
		System.out.println();
	}
	
	//Function to display array from the start index (with validation)
	public static <T> void printArray(T[] inputArray, int startIndex) {
		//validation for the start index. If wrong, then startIndex gets value of 0
		if (startIndex<0 || startIndex>inputArray.length-1) {
			System.out.print("Wrong startIndex. Display will start from the first element:\n");
			startIndex=0;
		}
		for (int i=startIndex; i<inputArray.length; i++) {
			System.out.print(inputArray[i]+"\t");
		}
		System.out.println();
	}
	
	//Function to display array from the start index until the end index (with validation)
	public static <T> void printArray(T[] inputArray, int startIndex, int endIndex) {
		//validation for the start index. If wrong, then startIndex gets value of 0
		if (startIndex<0 || startIndex>inputArray.length-1) {
			System.out.print("Wrong startIndex. Display will start from the first element:\n");
			startIndex=0;
		}
		//validation for the end index. If wrong, then endIndex gets the position of the last element
		if(endIndex<0 || endIndex>inputArray.length-1 || endIndex<startIndex) {
			System.out.print("Wrong endIndex. Display will end at the last element: \n");
			endIndex=inputArray.length-1;
		}
		for (int i=startIndex; i<=endIndex; i++) {
			System.out.print(inputArray[i]+"\t");
		}
		System.out.println();
	}
}
