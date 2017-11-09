package javaTheHardWay;

public class Environment {

	private int plants;
	private int growthRate;
	
	public static void main(String[] args) {
		Environment farm = new Environment(10);
		System.out.println(farm);
		farm.growPlants();
	}
	
	public Environment(int plants) {
		this.plants = plants;
		this.growthRate = plants/2;
	}

	public void growPlants() {
		plants += growthRate;
		System.out.println("\nThere are "+plants+" plants.");
	}
	
	public boolean eatPlants() {
		if(plants > 0) {
			plants--;
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "An vast field";
	}
	
	//In line 67, farm is represented by the toString() method which contains text that the object is suppose to represent.
	//In line 82, eatPlants only returns true if there is a plant in the farm and was able to remove a plant from the farm.
	//It returns whether or not the plants can be eaten
	//Supposing that the growth rate should always be half the number of plants, you can update the growth rate after changing the plant counter
	//Given that, you only really need one variable (it can be either) to perform such operations
}
