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
	private Hobby hobby;
	private Person[] friends;
	
	public Person(String fn, String ln, Borough b) {
		firstName = fn;
		lastName = ln;
		home = b;
		hobby = Hobby.randomHobby();
		friends = new Person[3];
	}
	
	/**
	 * Chooses friends from People based on who is of !same class! of this instance and
	 * the same hobbies. 
	 * @param people
	 */
	public void mingle(Person[] people) {
		for(Person p: people) {
			if(p != this) {
				//Reassign p to the better of the two friends
				p = betterFriend(p, friends[0]);
				
				addFriendToFirstPlace(p);
			}
		}
	}
	
	public Person betterFriend(Person p, Person person) {
		if(person == null) {
			return p;
		}
		if(p == null) {
			return person;
		}
		if(person.getClass() == this.getClass() && this.getClass() == p.getClass())
		{
			if(p.hobby == this.hobby) {
				return p;
			}
			else if(person.hobby == this.hobby) {
				return person;
			}
		}
		if(p.getClass() == this.getClass()) {
			return p;
		}
		if(person.getClass() == this.getClass()) {
			return person;
		}
		//If none of these are true, just take p
		return p;
	}

	public void printFriends() {
		System.out.println("My name is " + firstName + " " + lastName + " and these are my friends:");
		for(Person f: friends) {
			if(f != null) {
				System.out.println(f);
			}
		}
	}
	
	/**
	 * Moves all people in friends back a place and add the new friend to first place.
	 * This version removes the last friend if there is no more space.
	 * @param p
	 */
	public void addFriendToFirstPlace(Person p) {
		Person temp = friends[0];
		friends[0] = p;
		for(int i = 1; i < friends.length - 1; i++) {
			Person temp1 = friends[i];
			friends[i] = temp;
			temp = temp1;
		}
		/*
			for(int i = friends.length - 1; i > 0; i --) {
				friends[i] = friends[i - 1];
			}
			friends[0] = p;
		*/
	}
	
	public String toString() {
		return "My name is " + firstName + " " + lastName + " and I live in " + home + "." + " I like to do a lot " + hobby + ".";
	}
	
}
