package application;

public class Sales extends Employee{

	private double gross;
	
	public Sales(String f, String l, String p, int i, double a) {
		super(f, l, p, i);
		setGross(a);
	}

	public double getGross() {
		return gross;
	}

	public void setGross(double gross) {
		this.gross = 250 + (0.057 * gross);
	}
	
	public double calculateWeeklyPay(){
		return getGross();
	}
	
	public String toString(){
		return super.toString() +" "+"Salary: "+calculateWeeklyPay();
	}

}
