package application;

public enum Position {

	MANAGER ("Manager"), 
	SALES ("Sales"), 
	DESIGN ("Design"), 
	MANUFACTURING ("Manufacturing");
	
	private String name;
	
	/**
	 * Creates a new Position
	 * 
	 * @param name The name of the office
	 */
	Position(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
