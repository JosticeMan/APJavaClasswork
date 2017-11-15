package javaTheHardWay;

public class Habitat extends Environment {
	
	private Animal[] animals; 

	public static void main(String[] args) {
		Habitat h = new Habitat(5);
		int count = 0;
		while(count < 6) {
			Animal a = new Animal();
			h.addAnimal(a);
			count++;
		}
		System.out.println(h);
	}

	public Habitat(int livingCapacity) {
		super(livingCapacity);
		animals = new Animal[livingCapacity];
	}
	
	public String toString() {
		return super.toString() + "\nHabitants: \n"+animalReport();
	}
	
	public String animalReport() {
		String s = "";
		for(Animal a: animals) {
			s+= a+"\n";
		}
		return s;
	}
	
	public Animal[] getAnimals() {
		return animals;
	}
	
	public void addAnimal(Animal animal) {
		int i = 0; 
		while(i < animals.length) {
			if(animals[i]== null) {
				animals[i] = animal;
				break;
			}
			i++;
		}
	}
	
	public void removeAnimal(int i) {
		animals[i] = null;
	}
	
	public void removeAnimal(Animal a) {
		for(int i = 0; i < animals.length; i++) {
			if(animals[i] == a) {
				animals[i] = null;
			}
		}
	}
	
	//What is "livingCapacity"? How does addAnimal work? What happens if addAnimal is called but 
	//the "livingCapacity" has already been reached?
	
	//LivingCapacity is the max amount of animals that could be in a habitat
	
	//addAnimal works by iterating through the array and checking if there is an open slot, if there is
	//one open slot, place the given animal inside it and stop the method
	
	//If livingCapacity is already reached, then the method will still iterate through the array but 
	//do nothing as the conditions were not met and break out of the loop
	
	//In line 24, what is the result of calling super.toString()?
	
	//On line 24, it will return the Environment's toString method because Habitat extends that and the 
	//super references to the extended class's methods. 
}
