package application;

public class CruiseShip extends Ship{

	private int passenger;
	
	public CruiseShip(String a, String b, String p, int c) {
		super(a, b, p);
		setPassenger(c);
	}

	public int getPassenger() {
		return passenger;
	}

	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}

	public String toString(){
		return super.toString()+" carrying "+getPassenger()+" passengers";
	}
	
	public String writeString(){
		return super.writeString()+","+passenger;
	}
}
