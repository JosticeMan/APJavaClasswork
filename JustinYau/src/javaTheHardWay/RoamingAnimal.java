package javaTheHardWay;

public class RoamingAnimal extends Animal {
	
	protected Habitat habitat;
	private boolean sex;

	public RoamingAnimal(Habitat matingArea) {
		super(); 
		this.habitat = matingArea;
		sex = Math.random() > .5;
	}

	public RoamingAnimal(Habitat matingArea, String description, Trait trait1, Trait trait2) {
		super(description, trait1, trait2);
		this.habitat = matingArea;
		sex = Math.random() > .5;
	}

	public static void main(String[] args) {
		int capacity = 6;
		Habitat h = new Habitat(capacity);
		for(int i =0; i < capacity; i++) {
			RoamingAnimal r = new RoamingAnimal(h);
			h.addAnimal(r);
		}
		System.out.println(h);
		int years = 7;
		for(int y = 0; y < years; y++) {
			for(Animal a: h.getAnimals()) {
				if(a != null) {
					a.act();
				}
			}
			h.growPlants();
			System.out.println("\n" + h);
		}
	}
	
	public boolean getSex() {
		return sex;
	}

	public void mate() {
		System.out.println(this + " does not have a mating ritual.");
	}
	
	public void act() {
		increaseAge();
		if(!canEat()) {
			System.out.println(this + " died of starvation");
			habitat.removeAnimal(this);
		}
		else {
			if(getAge() > 5) {
				System.out.println(this + " died of old age");
				habitat.removeAnimal(this);
			}
			if(!hasMated()) {
				mate();
			}
		}
	}
	
	public boolean canEat() {
		return habitat.eatPlants();
	}
	
	//What is the point of the mate method if the method just prints out it does not have a mating ritual
	
	//You can override the method to define the mate behavior
	
	//In line 31, why is necessary to check whether a is null? When would a ever be null?
	
	//You do not want to call the act method on an animal that does not exist at a certain index of the Habitat Array.
	//A would be null when the Habitat has an open slot for animals at the index
	
	//There are no boolean instance variable "living" to keep track of whether an animal is alive or dead. 
	//In lines 50 and 55, animals do die. How does the program "keep track" of which animals are alive
	//and which animals are dead?
	
	//The program knows that all the animals in the Habitat array are alive and those 
	//that aren't, are dead
	
	//Under what circumstances would an animal ever die of starvation? Can you explain how the method at 
	//line 64 works?
	
	//If the habitat runs out of plants for the animals to eat, the animal attempting to eat would die
	//This is how the method at line 64 works
	
}
