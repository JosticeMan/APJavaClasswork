package javaTheHardWay;

public class Predator extends ReproductionAnimal {

	//It will override canEat, act
	
	public Predator(Habitat matingArea) {
		super(matingArea);
		setMaxLitterSize(3);
	}

	public Predator(Habitat matingArea, String description, Trait trait1, Trait trait2) {
		super(matingArea, description, trait1, trait2);
		setMaxLitterSize(3);
	}

	public static final String[] PREDATORS = {"wolf", "bear", "lion", "bobcat"};
	
	public String getName() {
		return PREDATORS[(int)(Math.random()*PREDATORS.length)];
	}
	
	public static void main(String[] args) {
		Wilderness wilderness = new Wilderness("A Wooded Area", 10);
		Predator p = new Predator(wilderness);
		wilderness.addAnimal(p);
		wilderness.simulate(2);
	}
	
	public ReproductionAnimal getOffspring(ReproductionAnimal mate) {
		return new Predator(habitat, getDescription(), 
				Trait.getDominanttrait(getTrait1(), mate.getTrait1()),
				Trait.getDominanttrait(getTrait2(), mate.getTrait2()));
	}
	
	public boolean canEat() {
		int attempts = 0; 
		while(attempts < 3) {
			int tIndex = (int)(Math.random() * habitat.getAnimals().length);
			Animal target = habitat.getAnimals()[tIndex];
			if(target instanceof Prey) {
				habitat.removeAnimal(tIndex);
				return true;
			}
			attempts++;
		}
		return false;
	}
	
	//What type of Object is returned when the method at line 28 is called?
	
	//It will return a ReproductionAnimal which may be converted into a string from its toString() method
	
	//Review the method at line 34. Suppose a Predator lives in an environment where
	//where there is a capacity for 100 aniamls and there are currently 50 Prey living in 
	//the environment. How would this situation affect the outcome of this method?
	//What if there are only 10 prey? 80?
	
	
	//The method would be able to return true more often the more prey there is since it is more
	//likely to get the index of a prey out of a 100 when there is more prey indexes. 
}
