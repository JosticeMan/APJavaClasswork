package arrays;

public class Hobby extends Thing {

	public Hobby(String description) {
		super(description);
		// TODO Auto-generated constructor stub
	}

	public static Hobby randomHobby() {
		Hobby[] someHobbies = {new Hobby("Programming"), 
							   new Hobby("Dancing"), 
							   new Hobby("Video Games"), 
							   new Hobby("Singing"),
							   new Hobby("Fishing"), 
							   new Hobby("Handball")};
		return someHobbies[(int) (Math.random() * someHobbies.length)];
	}
	
}
