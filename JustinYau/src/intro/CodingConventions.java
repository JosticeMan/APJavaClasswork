package intro;

//Class is file describing a new data type 
public class CodingConventions {

	/*
	//This is a special method, a "constructor". 
	//Notice that it does not have a return type. 
	//That is because it returns an instance of the class. 
	*Therefore, the name of the class must match the name of the constructor. 
	*/
	
	//fields
	private String name;
	private String description;
	
	public CodingConventions()
	{
		//In Java, fields are instantiated in a constructor
		name = "Justin Yau";
		description = "Is a student";
	}
	
}
