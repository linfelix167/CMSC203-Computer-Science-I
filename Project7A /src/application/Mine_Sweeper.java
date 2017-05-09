package application;

public class Mine_Sweeper extends WarShip{

	private int guns;
	private String name, year;
	
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

	public Mine_Sweeper(String a, String b, String p, int c, int d, int e) {
		super(a, b, p, c, d, e);
		setName(a);
		setYear(b);
		setGuns(c);
	}

	public int getGuns() {
		return guns;
	}

	public void setGuns(int guns) {
		this.guns = guns;
	}

	public String toString(){
		return getName()+" built in "+getYear()+", Mine Sweeper class with "+ getGuns() +" guns.";
	}
	
	public String writeString(){
		return getName()+",Mine Sweeper,"+getYear()+","+getGuns();
	}
}
