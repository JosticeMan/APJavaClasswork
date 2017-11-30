package search;

public class LionsPuzzle {

	public static void main(String[] args) {
		int lions = 101;
		System.out.println(lions + " lions decided to eat the sheep? " + 
		eatSheepOrNot(lions));
	}

	private static boolean eatSheepOrNot(int lions) {
		if(lions == 1) {
			//There are no lions to eat you if you eat a sheep!
			return true;
		}
		else {
			//You would eat the sheep knowing the other lions don't eat the sheep
			return !eatSheepOrNot(lions - 1);
		}
	}

}
