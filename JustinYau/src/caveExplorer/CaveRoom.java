package caveExplorer;

public class CaveRoom {

	private String description; //Tells the room looks like
	private String directions; //Tells what you can do 
	private String contents; //A symbol representing what's in the room
	private String defaultContents;
	//The rooms are organized by direction, 'null' signifies no room/doors in that direction
	private CaveRoom[] borderingRooms;
	private Door[] doors;
	
	public static final int NORTH = 0;
	public static final int EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;
	
	public CaveRoom(String description) {
		this.description = description;
		setDefaultContents(" ");
		contents = defaultContents;
		//Difference between defaultContents and contents is "contents" becomes
		//an x when you are inside this room, when you leave it goes back to default
		//contents
		
		//Note: By default, arrays will populate with 'null', meaning there are no connections
		borderingRooms = new CaveRoom[4];
		doors = new Door[4];
		setDirections();
	}

	/**
	 * For every door in doors[], appends a String to "directions" describing the access
	 * For example: 
	 *  "There is a door to the north" 
	 *  "There is a door to the south" ... etc
	 *  
	 *  If there are no doors at all, directions should say: 
	 * 		"There are no doors, you are trapped in here." 
	 */
	public void setDirections() {
		boolean doorFound = false;
		for(int i = NORTH; i < WEST + 1; i++) {
			if(doors[i] != null) {
				directions += "\n   There is a " + doors[i].getDescription() + " to " + toDirection(i) + ". " + doors[i].getDetails();
				doorFound = true;
			}
		}
		if(!doorFound) {
			directions = "There are no doors in your room. You're trapped";
		}
	}

	/**
	 * Converts an int to a direction
	 *    toDirection(0) -> "the North"
	 * @param dir
	 * @return
	 */
	public static String toDirection(int dir) {
		String[] direction = {"the North", "the East", "the South", "the West"};
		return direction[dir];
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public void setDefaultContents(String defaultContents) {
		this.defaultContents = defaultContents;
	}

	
	
}
