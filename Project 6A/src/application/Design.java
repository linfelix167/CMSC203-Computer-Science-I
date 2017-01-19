package application;

public class Design extends Employee{

	private double rate;
	private double hours;
	
	public Design(String f, String l, String p, int i, double r, double h) {
		super(f, l, p, i);
		setRate(r);
		setHours(h);
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		if ( ( hours >= 0.0 ) && ( hours <= 168.0 ) )
			this.hours = hours;
		else
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0" );
	}
	
	public double calculateWeeklyPay(){
		if ( getHours() <= 40 )
			return getRate() * getHours(); 
		else
			return 40 * getRate() + ( getHours() -  40 ) * getRate() *  1.5 ;
	}
	
	public String toString(){
		return super.toString() +" "+"Salary: "+calculateWeeklyPay();
	}
	
	//test use
	public static void main(String[] args){
		Design test = new Design("aaa", "bbb", "Design", 123, 12.50, 50);
		System.out.println(test.toString());
	}
	

}
