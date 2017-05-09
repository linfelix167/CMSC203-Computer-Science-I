package application;

public class WarShip extends Ship{

	private int guns, aircrafts, torpedoes;
	
	
	public WarShip(String a, String b, String p, int c, int d, int e) {
		super(a, b, p);
		setGuns(c);
		setAircrafts(d);
		setTorpedoes(e);
		
	}

	public int getGuns() {
		return guns;
	}
	public void setGuns(int guns) {
		this.guns = guns;
	}
	public int getAircrafts() {
		return aircrafts;
	}
	public void setAircrafts(int aircrafts) {
		this.aircrafts = aircrafts;
	}
	public int getTorpedoes() {
		return torpedoes;
	}
	public void setTorpedoes(int torpedoes) {
		this.torpedoes = torpedoes;
	}
	
	public String toString(){
		return super.toString()+" with "+getGuns()+" guns, "+getTorpedoes()+" torpedoes, and "+getAircrafts()+ " aircrafts.";
	}

	public String writeString(){
		return super.writeString()+","+guns+","+torpedoes+","+aircrafts;
	}
}
