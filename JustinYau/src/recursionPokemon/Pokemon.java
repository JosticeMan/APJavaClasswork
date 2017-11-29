package recursionPokemon;

public class Pokemon {

	private int level;
	private int hp;
	private String name;
	private boolean poisoned;
	
	public Pokemon(String name, int level) {
		this.name = name;
		this.level = level;
		hp = 100;
		poisoned = false;
	}

	public void iChooseYou() {
		String phrase = "I choose you, level " + this.level + " " + this.name + "!";
		System.out.println(phrase);
	}
	
	public void levelUp(Effect e) {
		this.level++;
		e.happen();
	}
	
	public int getHP() {
		return this.hp;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setHP(int newHP) {
		this.hp = newHP;
	}
	
	public boolean isPoisoned() {
		return this.poisoned;
	}
	
	public void setPoisoned(boolean b) {
		this.poisoned = b;
	}
	
	public void lapse() {
		this.hp -= 15;
		String phrase = this.name + " took 15 hitpoints from it's poison!";
		System.out.println(phrase);
	}
	
	public void attack(Pokemon target, Attack attack){
		if(Math.random() < .9){
			 attack.attack(target);
			 levelUp(new Effect() { 
				 
				 public void happen() {
					 String previousPokemon = name;
					 if(name.equalsIgnoreCase("squirtle")) {
						 name = "Wartortle";
						 System.out.println(previousPokemon + " has evolved into " + name + "!");
					 }
					 if(name.equalsIgnoreCase("bulbasaur")) {
						 name = "Ivysaur";
						 System.out.println(previousPokemon + " has evolved into " + name + "!");
					 }
				 }
				 
			 });
			 System.out.println("The attack hit");
		}else{
			 System.out.println("The attack missed");
		}
	 }
	 
	public void printResult() {
		String phrase = this.name + " has " + this.hp + " HP!";
		System.out.println(phrase);
	}
}
