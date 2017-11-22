package javaTheHardWay;

public class Prey extends ReproductionAnimal {

	public static final String[] PREY = {"bunny"};
	
	public Prey(Habitat matingArea) {
		super(matingArea);
		setMaxLitterSize(6);
	}

	public Prey(Habitat matingArea, String description, Trait trait1, Trait trait2) {
		super(matingArea, description, trait1, trait2);
		setMaxLitterSize(6);
	}

	public static void main(String[] args) {
		Wilderness wilderness = new Wilderness("A Wooded Area", 400);
		int numPredators = 100;
		int numPrey = 250;
		for(int i = 0; i < numPredators; i++) {
			Predator predator = new Predator(wilderness,"wolf", new Trait(), new Trait());
			wilderness.addAnimal(predator);
		}
		for(int i = 0; i < numPrey; i++) {
			Prey prey = new Prey(wilderness);
			wilderness.addAnimal(prey);
		}
		wilderness.simulate(10);
	}

	public String getName() {
		return PREY[(int)(Math.random() * PREY.length)];
	}
	
	public ReproductionAnimal getOffspring(ReproductionAnimal mate) {
		return new Prey(habitat, getDescription(), Trait.getDominanttrait(getTrait1(), mate.getTrait1()), Trait.getDominanttrait(getTrait2(), mate.getTrait2()));
	}
	
	//Run the simulation. One thing you will notice is there is always more Prey than food. 
	//To modify this, change the growPlants() method in the Environment class so that the 
	//number of plants increases by the growthRate plus half the number of plants.
	
	//In lines 26 and 31, change the max litter size for Prey. What happens to the simulation when the litter size is greater? Lesser?
	
	//By increasing the litter size, the prey were able to reproduce faster than the wolves can eat them and outnumber the plants faster, starving faster. 
	
	//In line 10, change the starting numPredators. What happens if you start with more Predators? What happens if you start with less?
	
	//The more predators there are, the more faster they will eat all the prey and 
	//if the prey don't reproduce fast enough, then the predator will wipe them out and eventually starve 
	
	//What happens if you change the livingCapacity of the Wilderness (line 9) from 40 to 400? What happens if you also multiple numPredators and numPrey (lines 10 and 11) by 10? 
	//If you are overwhelmed by Console output, change the toString method in the Wilderness class so it no longer prints the animalReport(). What type of equilibrium do you observe?
	
	//You will get a more accurate simulation of what would happen given the parameters
	//In this case, the predators keep eating the prey but the prey reproduce fast enough to keep the supply going
	//The prey eventually number more than the plants and starve
	//This causes the predator to also die out
	//The cycle is over
}
