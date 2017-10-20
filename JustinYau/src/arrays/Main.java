package arrays;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		ObjectArrays oA = new ObjectArrays();
		Person s = new Person("Ben", "Nockles", Borough.NY_BOROUGHS[0]);
		//String s = "Hello";
		int x = 10;
		int[] a = {5,6,7};
		test(s, x, a);
		System.out.println(s + "," + x + "," + Arrays.toString(a));
	}

	//Arrays have methods in forms of indices.
	/**
	 * PASS BY-VALUE EXAMPLES
	 */
	public static void test(Person s, int x, int[] arr) {
		//The variable stored only the value of the name and not the references
		String name = s.getFirstName();
		name = "Ilona";
		/**
		 * This does change the variable
		 */
		//s.setFirstName("Ilona");
		/**
		 * This does change the variable
		 */
		//s = s.substring(0, 1);
		x = 5; 
		/** 
		 * INT CANNOT BE CHANGED IN THE METHOD
		 */
		arr = new int [3];
		arr[0] = 1; 
		arr[1] = 2;
		arr[2] = 3;
		/**
		 * This does change the array
		 */
		/* 
		 * AS LONG AS YOU DON'T MAKE A NEW ARRAY, THE REFERENCES THEMSELVES CHANGE
		arr[0] = 1; 
		arr[1] = 2;
		arr[2] = 3;
		*/
		/**
		 * This does change the array
		 */
	}
}