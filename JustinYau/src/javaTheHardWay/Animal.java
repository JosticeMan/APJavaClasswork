package javaTheHardWay;

public class Animal {

	private String description;
	
	private Trait trait1;
	private Trait trait2;
	private int age;
	private boolean mated;
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			Animal someAnimal = new Animal();
			System.out.println(someAnimal);
		}
	}

	public Animal() {
		chooseTraits();
		description = getName();
		age = 0;
	}

	public Animal(String description, Trait trait1, Trait trait2) {
		this.trait1 = trait1;
		this.trait2 = trait2;
		while(trait2.equals(trait1)) {
			trait2 = new Trait();
		}
		this.description = description;
	}
	
	public String getName() {
		return "animal";
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void chooseTraits() {
		trait1 = new Trait();
		trait2 = new Trait();
		while(trait1.equals(trait2)) {
			trait2 = new Trait();
		}
	}
	
	public String toString() {
		return "a " + age + " year old, " + trait1 + " , " + trait2 + " " + description;
	}
	
	public Trait getTrait1() {
		return trait1;
	}
	
	public Trait getTrait2() {
		return trait2;
	}
	
	public int getAge() {
		return age;
	}
	
	public void increaseAge() {
		age++;
	}
	
	public void act() {
		System.out.println(this + " is sleeping.");
		mated = true;
	}
	
	public boolean hasMated() {
		return mated;
	}
	
	public void setMated(boolean b) {
		this.mated = b;
	}
	
	public void reset() {
		mated = false;
	}
	
	//There are getters for age, trait1, and trait2, but not setters. Design-wise, why do you think that is?
	
	//There are only getters because the traits of an animal are constant
	//You can't make a long eared animal into a short eared animal just because you want it to
	
	//What are the purpose of the while loops in lines 30 and 47?
	
	//The while loops ensure that the animals don't get 2 of the same traits that define a particular region of the animal
	//Ex: A animal can't be both long eared and short eared
}
