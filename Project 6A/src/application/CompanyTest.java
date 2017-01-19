package application;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CompanyTest {

	Company company;
	
	@Before
	public void setUp() throws Exception {
		company = new Company("Wacky Widgets");
		company.addEmployee("John","Smith", "Manufacturing", 444,6.75, 120); //Manufacturing
		company.addEmployee("Betty","White","Manager",111,1200.00, 0); //Manager
		company.addEmployee("Stan","Slimey","Sales",332,10000.00, 0); //Sales
		company.addEmployee("Betty","Boop","Design",244,12.50, 50); //Hourly worker
	}

	@After
	public void tearDown() throws Exception {
		company = null;
	}

	@Test
	public void testAddEmployee() {
		company.addEmployee("John","Smith", "Manufacturing",444, 6.75, 120);
	}
	
	@Test
	public void testAddEmployeeSTUDENT() {
		company.addEmployee("Charles","Emory","Design",343, 7.50, 35);
	}
	
	@Test
	public void testCalculateTotalWeeklyPay() {
		assertEquals(3517.5, company.calculateTotalWeeklyPay(), .001);
		company.addEmployee("Charles","Emory","Design",343, 7.50, 35); //Design employee
		assertEquals(3780.00, company.calculateTotalWeeklyPay(), .001);
		
	}
	
	@Test
	public void testCalculateTotalWeeklyPaySTUDENT()
	{
		assertEquals(3517.5, company.calculateTotalWeeklyPay(), .001);
		company.addEmployee("Felix","Lee","Manufacturing",333, 7.50, 100); 
		assertEquals(4267.5, company.calculateTotalWeeklyPay(), .001);
	}

	@Test
	public void testPrintCompany() {
		String result = company.printCompany();
		Scanner company = new Scanner(result);
		assertEquals("Wacky Widgets",company.nextLine()); 
		//extract three Employees
		assertEquals("John", company.next());
		company.nextLine();  //Smith     Position manufacturing (rest of line)
		assertEquals("Betty", company.next());
		company.nextLine();  //White     Position manager (rest of line)
		assertEquals("Stan",company.next());
		company.nextLine();  //Slimey     Position Sales (rest of line);
		assertEquals("Betty",company.next());
	}
	
	@Test
	public void testGenerateWeeklyReport() {
		String result = company.generateWeeklyReport();
		Scanner report = new Scanner(result);
		report.nextLine(); //WEEKLY PAY REPORT FOR Wacky Widget COMPANY
		report.nextLine();  //empty line
		report.nextLine();  //EMPLOYEE        WEEKLY PAY
		assertEquals("444",report.next()); //444
		assertEquals("$810.00",report.next()); //$1,200.00
		report.nextLine();//extracts newline at end of line
		assertEquals("111",report.next()); //22222

	}
	
	@Test
	public void testGenerateWeeklyReportSTUDENT() {
		String result = company.generateWeeklyReport();
		Scanner report = new Scanner(result);
		report.nextLine(); //WEEKLY PAY REPORT FOR Wacky Widget COMPANY
		report.nextLine();  
		report.nextLine();  //EMPLOYEE        WEEKLY PAY
		
		assertEquals("Total",report.next()); 
		report.nextLine();//extracts newline at end of line
		
	}
	
	
	@Test
	public void testGetNumManager() {
		assertEquals(1, company.getNumMan());
	}

	@Test
	public void testGetNumDesign() {
		assertEquals(1, company.getNumDes());
	}

	@Test
	public void testGetNumManufacturing() {
		assertEquals(1, company.getNumManu());
	}

	@Test
	public void testGetNumSales() {
		assertEquals(1, company.getNumSal());
	}
}
