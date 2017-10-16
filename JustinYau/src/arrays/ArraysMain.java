package arrays;

import java.util.Arrays;

public class ArraysMain {

	private String[] testArray;
	private int[] intRay;
	
	public ArraysMain() {
		intRay = new int[100];
		//populate(intRay);
		//checkOccurences(intRay, 3, 18);
		populate1ToN(intRay);
		shuffle(intRay);
		//Arrays is a Utility class included in Java formatting output
		System.out.println(Arrays.toString(intRay));
	}

	private void shuffle(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int swapper1 = (int) (Math.random() * arr.length);
			int swapper = (int) (Math.random() * arr.length);
			swap(arr, swapper1, swapper);
		}
	}

	private void swap(int[] arr, int i, int j) {
		int ph = arr[i];
		arr[i] = arr[j];
		arr[j] = ph;
	}

	private void populate1ToN(int[] arr) {
		for(int i = 0; i < arr.length;i++) {
			arr[i] = i + 1;
		}
	}

	private void checkOccurences(int[] arr, int i, int j) {
		int[] counter = new int[j-i+1];
		for(int value: arr) {
			//Suppose i is 3 and value is 4, it'd be in the 1st index 
			counter[value - i]++;
		}
		for(int r = 0; r < counter.length; r++) {
			System.out.println("A "+ (i+r) + " was rolled " + counter[r] + " times.");
		}
		//System.out.println(Arrays.toString(counter));
	}

	private void populate(int[] intRay) {
		for(int i = 0; i < intRay.length; i++) {
			intRay[i] = diceRoll(3);
		}
		//This does not work:
		/*
		 * for(int value: intRay) {
		 * 	 value = diceRoll(2);
		 * }
		 */
	}

	public void notes() {
		//---------ARRAYS---------
		//Collection of primitives or objects 
		//SPECIAL NOTE: This is the ONLY collection of primitives.
		//Size cannot be modified
		/*
		 * Elements of an Array are REFERENCED to objects
		 * In other words, changing an element of the array changes
		 * the REFERENCE, not the object (More on this later)
		 */
		
		//--------CONSTRUCTORS--------
		//There are two types of constructors, the first we've seen already:
		//int[] firstType = {3, 14, -9, 10};
		//This constructor can only be used as a declaration. Error:
		//firstType = {12,13,14,15};
		
		//The 2nd type:
		//testArray = new String[50];
		/*
		 * SPECIAL NOTE: For primitive arrays, when they are instantiated 
		 * they are automatically populated with 0s. This is not the case with
		 * Object arrays, which are populated with null.
		 */
		
		//You can use a for loop to iterate through an array
		
		/*
		 * for(int i = 0; i < intRay.length; i++) {
		 * 	 System.out.println("The #" +i+ " item in the array is:" + intRay[i]);
		 * }
		 */

		
		//For each loop (useful only when you don't need to keep track of an index)
		/*
		 * For each int in testArray: 
		 * for(String value:testArray) {
		 *   System.out.println(value);
		 * }
		 */
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysMain arrayPractice = new ArraysMain();
	}
	
	/**
	 * Returns the result from rolling "number" of dices.
	 * @param numberOfDice
	 * @return
	 */
	public int diceRoll(int numberOfDice) {
		int sum = 0;
		int num = numberOfDice;
		while(num != 0) {
			sum = sum + (int) ((Math.random() * 6) + 1);
			num--;
		}
		return sum;
	}

}
