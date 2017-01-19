package application;

public class Carrier extends WarShip{

	private int aircraft;
	private String name, year;
	
	public Carrier(String a, String b, String p, int c, int d, int e) {
		super(a, b, p, c, d, e);
		setName(a);
		setYear(b);
		setAircraft(d);
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getYear() {
		return year;
	}
	
	public void setYear(String year) {
		this.year = year;
	}

	public int getAircraft() {
		return aircraft;
	}

	public void setAircraft(int aircraft) {
		this.aircraft = aircraft;
	}

	public String toString(){
		return getName()+" built in "+getYear()+", Carrirer class carrying "+getAircraft()+" aircrafts.";
	}
	
	public String writeString(){
		return getName()+",Carrier,"+getYear()+","+getAircraft();
	}
}
