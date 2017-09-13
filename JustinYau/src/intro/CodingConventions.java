package intro;

//Class is file describing a new data type 
public class CodingConventions {

	/*
	//This is a special method, a "constructor". 
	//Notice that it does not have a return type. 
	//That is because it returns an instance of the class. 
	* Therefore, the name of the class must match the name of the constructor. 
	*/
	
	//fields
	private String name;
	private String description;
	
	public CodingConventions(String name, int index){
		//In Java, fields are instantiated in a constructor
		//Adding ( this ) to a variable allows the function to access the value of the global variable when there is a local variable with the same 
		// handle. 
		this.name = name;
		//Static reference begins with a class name. 
		description = IntroName.DESCRIPTIONS[index];
	}

	public void doStuff() {
		//Static Method Call rather than an Instance Method Call.
		//Static Method Call is always there. (In this case, Math and System are Static Method Calls)
		//System is capitalized. Calling a field inside of System. 
		//A capital letter references a class. 
		System.out.println(name + description); //Use a space between operations so like 1 + 1 ; It keeps things organized.
		System.out.println("The square root of 12 is "+ Math.sqrt(12) + ".");
	}
	
}
