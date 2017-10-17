package arrays;

import java.util.Arrays;

public class ArraysMain {

	private String[] testArray;
	private int[] intRay;
	
	public ArraysMain() {
		intRay = new int[100];
		populate(intRay);
		System.out.println("The longest consecutive sequence occured on the " + (longestConsecSeqAndPos(intRay)[1]+1) + "th roll with a length of " + (longestConsecSeqAndPos(intRay)[0]) +  ". Starting with a roll of " + intRay[longestConsecSeqAndPos(intRay)[1]] + ".");
		//checkOccurences(intRay, 3, 18);
		//populate1ToN(intRay);
		//shuffle(intRay);
		//System.out.println(Arrays.toString(reverseOrder(intRay)));
		//System.out.println(countLessThan(intRay, 10));
		//Arrays is a Utility class included in Java formatting output
		System.out.println(Arrays.toString(intRay));
	}

	//---------CLASSWORK 10/17/2017 --------------
	
	private int[] reverseOrder(int[] arr) {
		int[] newIntRay = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			newIntRay[i] = arr[arr.length - i - 1];
		}
		return newIntRay;
	}
	
	private int countLessThan(int[] arr, int lessThanValue) {
		int count = 0;
		for(int value: arr) {
			if(value < lessThanValue) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Remove the element at index zero, push every other element up by 1
	 * @param arr
	 */
	public void frontToBack(int[] arr) {
		int placeHolder = arr[0];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = placeHolder;
	}
	
	/**
	 * Moves the front to the back repeatedly, exactly n times
	 * @param arr
	 * @param n
	 */
	public void cycleThrough(int[] arr, int n) {
		for(int i = 0; i < n; i++) {
			frontToBack(arr);
		}
	}
	
	/**
	 * Returns the length of the longest sequence of consecutive integers in array
	 * @param arr
	 * @return
	 */
	public int[] longestConsecutiveSequence(int[] arr) {
		int highestCount = 0;
		int position = 0; 
		for(int i = 0; i < arr.length; i++) {
			if(consecutiveLength(arr, i) > highestCount) {
				highestCount = consecutiveLength(arr, i);
				position = i;
			}
		}
		int[] answer = {highestCount, position};
		return answer;
	}
	
	public int[] longestConsecSeqAndPos(int[] arr) {
		int[] data = new int[2];
		int[] result = longestConsecutiveSequence(arr);
		data[0] = result[0];
		data[1] = result[1];
		return data;
	}
	
	public int consecutiveLength(int[] arr, int pos) {
		int count = 1;
		for(int i = pos; i < arr.length - 1; i++) {
			if(isNext(arr, i))
			{
				count++;
			}
			else
			{
				return count;
			}
		}
		//This checks to see if the last element is consecutive or not as the FOR loop does not check 
		if(isNext(arr, arr.length - 2))
		{
			count++;
		}
		return count;
	}
	
	public boolean isNext(int[] arr, int pos) {
		return arr[pos] + 1 == arr[pos + 1];
	}
	
	//---------CLASSWORK 10/17/2017 --------------
	
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
			intRay[i] = diceRoll(2);
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
