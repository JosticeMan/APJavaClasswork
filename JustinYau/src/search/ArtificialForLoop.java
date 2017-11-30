package search;

public class ArtificialForLoop {
	
	public static void main(String[] args) {
		forLoop(10, new Action() {
			
			int count = 1;
			
			@Override 
			public void act() {
				System.out.println(count+". Hello world!");
				count++;
			}
			
		});
	}
	
	public static void forLoop(int n, Action s) {
		if(n <= 0) {
			return;
		}
		else {
			s.act();
			forLoop(n - 1, s);
			return;
		}
	}
	
}
	

