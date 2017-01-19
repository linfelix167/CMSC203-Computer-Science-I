package application;

public class Manager extends Employee{

	private double weeklySalary;
	
	public Manager(String f, String l, String p, int i, double fparam) {
		super(f, l, p, i);
		setWeeklySalary(fparam);
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary < 0.0 ? 0.0 :weeklySalary;
	}
	
	public double calculateWeeklyPay(){
		return getWeeklySalary();
	}
	
	public String toString(){
		return super.toString() +" "+"Salary: "+getWeeklySalary();
	}

}
