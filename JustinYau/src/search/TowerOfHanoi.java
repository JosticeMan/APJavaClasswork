package search;

public class TowerOfHanoi {

	private static String[] posts = {"", "", ""};
	private static int count;
	
	public static void main(String[] args) {
		//Starting stack will be 0 "a", Helper stack will be 1 "b", End stack will be 2 "c"
		int numberOfDiscs = 3;
		count = 0;
		
		//Populate the starting stack with the appropriate number of discs
		for(int j = numberOfDiscs; j > 0; j--) {
			posts[0] += j;
		}
		
		//Solve the puzzle
		hanoi(numberOfDiscs, "a", "b", "c");
		
		//Print out the result of the tower
		printTower();
		System.out.println("It took " + count + " moves.");
	}
	
	public static void printTower() {
		int tower = 1;
		for(String post: posts) {
			System.out.println(tower + " " + post);
			tower++;
		}
	}
	
	public static void hanoi(int disc, String start, String helper, String end) {
		count++;
		if(disc == 1) {
			moveTopDisk(start, end); //Move smallest disc to end post
			printTower();
		}
		else {
			hanoi(disc - 1, start, end, helper); //Move the 2nd largest stack to the helper post
			moveTopDisk(start, end); //Move largest disc to end post
			hanoi(disc - 1, helper, start, end); //Move the 2nd largest stack to the end post
		}
	}
	
	public static void moveTopDisk(String start, String end) {
		int startIndex = indexOfLetter(start);
		int endIndex = indexOfLetter(end);
		System.out.println("Moved disc " + posts[startIndex].substring(posts[startIndex].length() - 1, posts[startIndex].length()) + " to tower " + end + " from tower " + start);
		posts[endIndex] += posts[startIndex].substring(posts[startIndex].length() - 1, posts[startIndex].length()); //Last string/disc of the tower
		posts[startIndex] = posts[startIndex].substring(0, posts[startIndex].length() - 1); //Tower without last disc
	}
	
	public static int indexOfLetter(String letter) {
		return "abc".indexOf(letter);
	}
	
}
