//This is a package declaration
package intro;

//This is a class declaration
public class IntroName {

	//Constants (Public)
	public static final String[] DESCRIPTIONS = {" is a student."
	                                            ," is a teacher."
	                                            ," is a poodle."};
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration of a local variable
		//Notice the use of the word "new"
		//New must be used to call a constructor
		CodingConventions conventionsInstance = new CodingConventions("Justin Yau", 0);
		
		//ConventionsInstance is an individual instance of CodingConventions
		//Instance Method Call
		conventionsInstance.doStuff();
	}

}
