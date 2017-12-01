package search;

public class TowerOfHanoi {

	private static String[] posts = {{""}, {""}, {""}};
	
	public static void main(String[] args) {
		//Starting stack will be 0, Helper stack will be 1, End stack will be 2
		int numberOfDiscs = 7;
		//Populate the starting stack with the appropriate number of discs
		for(int j = numberOfDiscs; j >= 0; j--) {
			posts[0] += j;
		}
		hanoi(7, "a", "b", "c");
		
		int tower = 1;
		for(String post: posts) {
			System.out.println(tower + post);
			tower++;
		}
	}
	
	public static void hanoi(int disc, String start, String helper, String end) {
		if(disc == 1) {
			moveTopDisk(start, end); //Move smallest disc to end post
		}
		else {
			hanoi(disc - 1, start, end, helper); //Move the 2nd largest stack to the helper post
			moveTopDisk(start, end); //Move largest disc to end post
			hanoi(disc -1, helper, start, end); //Move the 2nd largest stack to the end post
		}
		
	}
	
	public static void moveTopDisk(String start, String end) {
		int startIndex = indexOfLetter(start);
		int endIndex = indexOfLetter(end);
		posts[endIndex] += posts[startIndex].substring(0, posts[startIndex].length - 1);
	}
	
	public static int indexOfLetter(String letter) {
		return "abc".indexOf(letter);
	}
	
	
}
