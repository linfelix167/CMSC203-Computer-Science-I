package application;

public class Manufacturing extends Employee{

	private double rate;
	private double piece;
	
	public Manufacturing(String f, String l, String p, int i, double r, double b) {
		super(f, l, p, i);
		setRate(r);
		setPiece(b);
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getPiece() {
		return piece;
	}

	public void setPiece(double piece) {
		this.piece = piece;
	}
	
	public double calculateWeeklyPay(){
		return getRate() * getPiece();
	}
	
	public String toString(){
		return super.toString() +" "+"Salary: "+calculateWeeklyPay();
	}

	//test use
	public static void main(String[] args){
		Manufacturing test = new Manufacturing("aaa", "bbb", "Manufacturing", 123, 12, 12);
		System.out.println(test.toString());
	}
}
