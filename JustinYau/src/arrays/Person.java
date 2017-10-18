package arrays;

public class Person {
	
	public static final String[] FIRST_START = {"J", "M", "Chr", "T", "Th", "D", "Fr"};
	public static final String[] FIRST_MIDDLE = {"usti", "ist", "oma", "o", "e", "or", "aphin"};
	public static final String[] FIRST_END = {"n", "y", "er", "old", "tian", "s", "d"};
	
	public static final String[] LAST_START = {"Y", "Ch", "B", "G", "P"};
	public static final String[] LAST_MIDDLE = {"a", "i", "e", "orbache", "uti", "om"};
	public static final String[] LAST_END = {"u", "n", "v", "eston", "ian", "o", "y"};
	
	private String firstName;
	private String lastName;
	private Borough home;
	
	public Person(String fn, String ln, Borough b) {
		firstName = fn;
		lastName = ln;
		home = b;
	}
	
	public String toString() {
		return "My name is " + firstName + " " + lastName + " and I live in " + home + ".";
	}
	
}
