package arrays;

public class ObjectArrays {
	
	public ObjectArrays() {
		
		Object[] people = new Object[20];
		populate(people);
		//System.out.println(testShuffling());
		//people[0] = new Thing("coffee maker");
		/*
		for(Object p: people) {
			System.out.println(p);
		}
		*/
		/*
		Person[] people2 = selectGroup(people1, 6);
		for(Object p: people2) {
			System.out.println(p);
		}
	    */
		/*
		for(Person p: people1) {
			p.mingle(people1);
			p.printFriends();
			System.out.println("");
		}
		*/
	}

	//Warm up for 10/19/2017
	public double testShuffling() {
		double[] diff = new double[100];
		for(int i = 0; i < diff.length; i++) 
		{
			Person[] people1 = new Person[20];
			populate(people1);
			Person[] people2 = selectGroup(people1, people1.length);
			diff[i] = countDifferences(people1, people2);
		}
		double sum = 0;
		for(int i = 0; i < diff.length; i++) {
			sum += diff[i];
		}
		return sum/(diff.length);
	}
	
	public Person[] selectGroup(Person[] population, int length) {
		//Prevents those sneaky people from causing an infinite loop.
		if(length > population.length) {
			return population;
		}
		//
		Person[] sGroup = new Person[length];
		for(int i = 0; i < sGroup.length; i++) {
			sGroup[i] = randomPerson(sGroup, population);
		}
		return sGroup;
	}
	
	
	/**
	 * Returns the number of differences between arr1 and arr2
	 * A "difference" means they don't have the same element at the same position
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	public double countDifferences(Person[] arr1, Person[] arr2) {
		int diffCount = 0;
	    for(int i = 0; i < arr1.length; i++) {
	    	if(arr1[i] != arr2[i]) {
	    		diffCount++;
	    	}
	    }
	    return diffCount;
	}
	
	public static boolean personInGroup(Person[] group, Person nextPerson) {
		for(int i = 0; i < group.length; i++) {
			if(group[i] == nextPerson) {
				return true;
			}
		}
		return false;
	}
	
	public Person randomPerson(Person[] theGroup, Person[] population) {
		int index = (int) (Math.random() * population.length);
		boolean isNew = false;
		while(!isNew) {
			boolean isFound = false;
			for(int i = 0; i < theGroup.length; i++) {
				if(theGroup[i] == population[index]) {
					isFound = true;
				}
			}
			if(!isFound) {
				isNew = true;
			}
			else {
				index = (int) (Math.random() * population.length);
			}
		}
		
		return population[index];
	}
	//Warm up for 10/19/2017
	
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
