package application;

public class CargoShip extends Ship{

	private double tons;
	
	public CargoShip(String a, String b, String p, double c) {
		super(a, b, p);
		setTons(c);
	}

	public double getTons() {
		return tons;
	}

	public void setTons(double tons) {
		this.tons = tons;
	}
	
	public String toString(){
		return super.toString()+" with "+tons+" tons capacity";
	}
	
	public String writeString(){
		return super.writeString()+","+tons;
	}
	
	

}
