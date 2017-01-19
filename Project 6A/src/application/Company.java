package application;

import java.util.ArrayList;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Company {

	private String name;
	private ArrayList<Employee> officers;
	private static int count;
	private	int numMan;
	private int numDes;
	private int numSal;
	private int numManu;
	private String fName;
	private String lName;
	
	
	
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Company(){
		
		officers = new ArrayList<Employee>();
		count = 0;
		numMan = 0;
		numDes = 0;
		numSal = 0;
		numManu = 0;
	}
	
	public Company(String n){
		this.name = n;
		officers = new ArrayList<Employee>();
		count = 0;
		numMan = 0;
		numDes = 0;
		numSal = 0;
		numManu = 0;
	}
	
	public boolean removeEmployee(String firstName, String lastName){
		Employee d = null;
		
		if(firstName == d.getFirstName() && lastName == d.getLastName()){
			officers.remove(firstName);
			officers.remove(lastName);
			return true;
		}
		else
			return false;
		
	}
	public String addEmployee(String f, String l, String p, int i, double a, double b){
		
		
		if(count>=8){
			return "There are already 5 members on this team\nPlayer not added";
		}
		
		switch(p)
		{
		case "Manager":
			if(numMan >= 1){
				return "There is already a manager\nEmployee not added";
			}
			else{
				numMan++;
				officers.add(new Manager(f, l, p, i, a));
				}
			break;
		case "Design":
			if(numDes>=2){
				return "There are already two design persons\nEmployee not added";	
			}
			else{
				numDes++;
				officers.add(new Design(f, l, p, i, a, b));
			}
			break;
		case "Sales":
			if(numSal>=1){
				return "There is already a sales person\nEmployee not added";
				}
			else{ 
				numSal++;
				officers.add(new Sales(f, l, p, i, a));
			}
			break;
		case "Manufacturing":
			if(numManu>=4){
				return "There are already four manufacturing persons \nEmployee not added";	
			}
			else{
				numManu++;
				officers.add(new Manufacturing(f, l, p, i, a, b));
			}
			break;
		}
		count++;
		
		return null;
	}

	public static int getCount() {
		return count;
	}

	public int getNumMan() {
		return numMan;
	}

	public int getNumDes() {
		return numDes;
	}

	public int getNumSal() {
		return numSal;
	}

	public int getNumManu() {
		return numManu;
	}
	
	public String printCompany(){
		String	theCompany = name  + "\n";
		for(Employee member : officers)
		{
			theCompany += member + "\n";
		}
		return theCompany;
	}
	
	public double calculateTotalWeeklyPay() {
		double total=0;
		for (int index=0; index<officers.size();index++){
			total +=officers.get(index).calculateWeeklyPay();

		}
			
		return total;
	}
	
	//test use
	public static void main(String[] args){
		Company company;
		company = new Company("Wacky Widgets");
		company.addEmployee("John","Smith", "Manufacturing", 444,6.75, 120); //Manufacturing
		company.addEmployee("Betty","White","Manager",111,1200.00, 0); //Manager
		company.addEmployee("Stan","Slimey","Sales",332,10000.00, 0); //Sales
		company.addEmployee("Betty","Boop","Design",244,12.50, 50); //Hourly worker
		System.out.println(company.calculateTotalWeeklyPay());
		System.out.println(company.generateWeeklyReport());
	}
	
	public String generateWeeklyReport() {
		
		int[] iD = new int[8];
		String title="WEEKLY PAY REPORT FOR "+name+" COMPANY"+"\n";
		String label="\nEmployee\t";
		String label2="WEEKLY PAY \n";
		double[] payWeek= new double[8];
		double total=0.0;
		
		for(Employee d : officers){
			double value = d.calculateWeeklyPay();
			total += value;	
		}
		return title+label+"\t"+label2+"\n"+"\t"+"\n"+"Total Payroll: $"+total+"\n"+
		"Total number of managers paid:"+numMan+"\n"+
		"Total number of Design Employees paid:"+numDes+"\n"+
		"Total number of Sales Employees paid:"+numSal+"\n"+
		"Total number of Manufacturing Employees paid:"+numManu;

	}
	
	public String toString()
	{
		//Create the String to be returned and set it to the company name
		String theTeam = name + "\n";
		
		for(Employee member: officers)
		{
			theTeam += member + "\n";
		}
		//Return the complete String
		return theTeam;
	}
}
