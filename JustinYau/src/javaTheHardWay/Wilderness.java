package javaTheHardWay;

public class Wilderness extends Habitat {
	
	private String description;

	public Wilderness(String description, int livingCapacity) {
		super(livingCapacity);
		this.description = description;
	}

	public static void main(String[] args) {
		Wilderness w = new Wilderness("An empty dessert", 10);
		w.simulate(3);
	}

	public String toString() {
		return this.description + "\n" + animalReport();
	}
	
	public void simulate(int rounds) {
		for(int i = 0; i < rounds; i++) {
			for(Animal a: getAnimals()) {
				if(a instanceof ReproductionAnimal) {
					((ReproductionAnimal)a).reset();
				}
			}
			int predatorCount = 0;
			int preyCount = 0;
			for(Animal a: getAnimals()) {
				//Create predator and prety class
				if(a instanceof Predator) {
					predatorCount++;
				}
				else  if(a instanceof Prey) {
					preyCount++;
				}
			}
			String s = "\nROUND " + (i+1)+"\nPREDATORS: "+ predatorCount+ ", PREY: "+preyCount+"\n"+animalReport();
			System.out.println(s);
			for(Animal a: getAnimals()) {
				if(a != null) {
					a.act();
				}
			}
			growPlants();
		}
	}
	
	//At line 18, what does animalReport() do?
	
	//Animal report prints out all the animals in the habitat 
	
	//At line 24, what does reset do? Why must it check for "instance ReproductionAnimal" and why, immediately after that, is "ReproductionAnimal" found in parentheses?
	
	//Reset allows the animal to mate again. 
	//It must check for only instances of Reproduction Animal since they are the only ones who would utilize this method as they are the only ones that can mate. \
	//ReproductioNAnimal is found in parentheses to indicate that the object is of the ReproductionAnimal class
	
	//What do you think is the purpose of the Wilderness class?
	
	//The purpose of the wilderness class is to allow a user to easily simulate an environment
}
