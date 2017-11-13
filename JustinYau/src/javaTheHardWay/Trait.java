package javaTheHardWay;

public class Trait {

	public static final String[] traits = {"striped", "long-tailed", "furry", "brown", "short-eared",
										   "spotted", "short-tailed", "hairless", "white", "long-eared"
										   };
	
	private String description;
	private int index;

	public static void main(String[] args) {
		Trait longTailed = new Trait(1);
		Trait shortTailed = new Trait(6);
		System.out.println(longTailed + " and " + shortTailed + " are the same trait: "+ longTailed.equals(shortTailed));
	}
	
	public Trait() {
		index = (int)(Math.random()*traits.length);
		description = traits[index];
	}
	
	public Trait(int index) {
		this.index = index;
		description = traits[index];
	}
	
	public String toString() {
		return description;
	}
	
	private int getIndex() {
		return index;
	}
	
	public boolean equals(Object o) {
		 return (o instanceof Trait) && (this.getIndex() - ((Trait)o).getIndex()) % (traits.length/2) == 0;
	}
	
	public static Trait getDominanttrait(Trait t1, Trait t2) {
		if(t1.equals(t2) && t1.getIndex() < t2.getIndex()) {
			return t1;
		}
		else if(t1.equals(t2) && t2.getIndex() < t1.getIndex()) {
			return t2;
		}
		else if(Math.random() < .5) {
			return t1;
		}
		else {
			return t2;
		}
	}

	
	//This class overrides the "equals" method. The way it overrides it is unexpected. What determines whether
	//Or not the two traits are "equal"?
	
	//Two traits are equal if the parameter is an Trait and if the difference between the 
	//index of the current Trait and inputed trait modded by half of traits length is 0.
	
	//Purpose: You can't be furry and hairless at the same time
	
	//What determines whether or not a trait is dominant?
	
	//If the traits are equal, meaning that the traits correspond to each other, then
	//It will return t1 if Trait 1's index is before Trait 2's index
	//It will return t2 if Trait 2's index is before Trait 1's index
	//Else it will return a random trait of the two
	
	//There are two constructors for Trait. Why do you think that is?
	
	//Optional whether or not you want to specify a trait
	
}
