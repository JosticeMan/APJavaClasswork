package recursionPokemon;

public class MainBattle {

	public MainBattle() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 Pokemon squirtle = new Pokemon("Squirtle",26);
		 Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		 squirtle.iChooseYou();
		 bulbasaur.iChooseYou();
		 
		 System.out.println("Squirtle is preparing to attack with water blast");
		 
		 //An anonymous inner type is an implementation of an interface declared within the parameters
		 //of a method call. In so doing, the instance is not given a handle, so it cannot be referenced 
		 //again within the context through which it was instantiated. That is the technical way of 
		 //explaining it, but it is probably better to explain with an example. 

		 squirtle.attack(bulbasaur, new Attack() {
		 
			 public void attack(Pokemon target) {
				 int hp = target.getHP();
				 target.setHP(hp/2);
			 }
			 
		 });
		 
		 System.out.println("Bulbasaur is preparing to attack with poison.");
		 
		 //This is Anonymous Inner Type
		 
		 bulbasaur.attack(squirtle, new Attack() {
		 
			 public void attack(Pokemon target) {
				 target.setPoisoned(true);
			 }
		 });
		 
		 printEndScore(squirtle, bulbasaur); 
		 
		 System.out.println("Squirtle is preparing to attack with ice beam.");
		 
		 squirtle.attack(bulbasaur, new Attack() {
			 
			 public void attack(Pokemon target) {
				 int hp = target.getHP();
				 target.setHP(hp - 25);
			 }
			 
		 });
		 
		 System.out.println("Bulbasaur is preparing to detoxify."); 
		 
		 bulbasaur.attack(squirtle, new Attack() {
			 
			 public void attack(Pokemon target) {
				 target.setPoisoned(false);
			 }
			 
		 });
		 
		 printEndScore(squirtle, bulbasaur);
		 
	}

	public static void printEndScore(Pokemon squirtle, Pokemon bulbasaur) {
		 if(squirtle.isPoisoned()) {
			 squirtle.lapse();
		 }
		 if(bulbasaur.isPoisoned()) {
			 bulbasaur.lapse();
		 }
		 printScore(squirtle, bulbasaur);
	}
	
	private static void printScore(Pokemon p1, Pokemon p2) {
		p1.printResult();
		p2.printResult();
	}

}
