package search;

public class TowerOfHanoi {

	private static String[] post;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfDiscs = 7;
		for(int i = 0; i < numberOfDiscs; i++) {
			for(int j = numberOfDiscs; j >= 0; j--) {
				post[i] += j;
			}
		}
		hanoi(7, "a", "b", "c");
	}
	
	public static void hanoi(int disc, String start, String helper, String end) {
		if(disc == 1) {
			moveDisk(start, end); //Move smallest disc to end post
		}
		else {
			hanoi(disc - 1, start, end, helper); //Move the 2nd largest stack to the helper post
			moveDisk(start, end); //Move largest disc to end post
			hanoi(disc -1, helper, start, end); //Move the 2nd largest stack to the end post
		}
		
	}
	
	public static void moveDisk(String start, String end) {
		int startIndex = indexOfLetter(start);
		int endIndex = indexOfLetter(end);
	}
	
	public static int indexOfLetter(String letter) {
		return "abc".indexOf(letter);
	}
	
	
}
