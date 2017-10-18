package arrays;

public class ObjectArrays {
	
	public ObjectArrays() {
		
		Object[] people = new Person[20];
		populate(people);
		people[0] = new Thing("coffee maker");
		for(Object p: people) {
			System.out.println(p);
		}
		
	}

	private void populate(Object[] people) {
	
		for(int i = 0; i < people.length; i++) {
			String firstName = randomNameFrom(Person.FIRST_START, Person.FIRST_MIDDLE, Person.FIRST_END);
			String lastName = randomNameFrom(Person.LAST_START, Person.LAST_MIDDLE, Person.LAST_END);
			Borough borough = randomBorough();
			//In Object[] (not primitive arrays like int), you can have multiple data types) (Sub classes of the declared type)
			if(Math.random() < .6) {
				int grade = (int) (Math.random() * 5) + 9;
				people[i] = new Student(firstName, lastName, borough, grade);
			}
			else {
				people[i] = new Person(firstName, lastName, borough);
			}
		}
		
	}

	private Borough randomBorough() {
		return Borough.NY_BOROUGHS[(int) (Math.random() * Borough.NY_BOROUGHS.length)];
	}
	
	private String randomNameFrom(String[] a, String[] b, String[] c) {
		return get(a)+get(b)+get(c);
	}

	private String get(String[] a) {
		return a[(int) (Math.random() * a.length)];
	}
	
}
