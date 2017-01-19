package application;

public class Submarine extends WarShip{

	private int torpedoes;
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

	public Submarine(String a, String b, String p, int c, int d, int e) {
		super(a, b, p, c, d, e);
		setName(a);
		setYear(b);
		setTorpedoes(e);
	}

	public int getTorpedoes() {
		return torpedoes;
	}

	public void setTorpedoes(int torpedoes) {
		this.torpedoes = torpedoes;
	}

	public String toString(){
		return getName()+" built in "+getYear()+", Submarine class with "+getTorpedoes()+" torpedoes.";
	}
	
	public String writeString(){
		return getName()+",Submarine,"+getYear()+","+getTorpedoes();
	}
}
