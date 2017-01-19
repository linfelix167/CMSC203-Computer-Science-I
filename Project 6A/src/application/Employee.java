package application;

public abstract class Employee {

	private String firstName;
	private String lastName;
	private int id;
	private Position office;
	
	public Employee(String f, String l, String p, int i){
		
		this.firstName = f;
		this.lastName = l;
		setOffice(p);
		this.id = i;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Position getOffice() {
		return office;
	}
	public void setOffice(String o) {
		if (o.toUpperCase().equals("MANAGER")) {
			this.office = Position.MANAGER;
		} else if (o.toUpperCase().equals("DESIGN")) {
			this.office = Position.DESIGN;
		} else if (o.toUpperCase().equals("SALES")) {
			this.office = Position.SALES;
		} else if (o.toUpperCase().equals("MANUFACTURING")) {
			this.office = Position.MANUFACTURING;
		}
	}
	
	public String toString() {
		return firstName + " " + lastName +" Position: " + office;
	}
	
	public abstract double calculateWeeklyPay();
	
	
}
