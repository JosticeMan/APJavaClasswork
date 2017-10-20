package arrays2d;

public class ArraysMain {

	public static void main(String[] args) {

	}

	//This doesn't change the input array
	/* 
	public int[] changeNeighbor(int[] arr, int index) {
		int[] newArr = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		for(int i = index - 1; i < index + 2; i++) {
			try {
				newArr[i] = arr[i] - 1;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				
			}
		}
		newArr[index] = arr[index] + 1;
		return newArr;
	}
    */
	/**
	 * THIS IDEA is another major topic in AP CSA.
	 * It is the idea of avoiding an indexOutOfBoundsException
	 * You will see it on quizzes, tests, and project rubrics
	 * SO ALWAYS BE MINDFUL
	 * @param arr
	 * @param index
	 * @return
	 */
	public int[] changeNeighbor(int[] arr, int index) {
		arr[index]++;
		if(index - 1 > 0) {
			arr[index - 1]--;
		}
		if(index + 1 < arr.length) {
			arr[index + 1]--;
		}
		return arr;
	}
}
