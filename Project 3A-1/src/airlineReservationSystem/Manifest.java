package airlineReservationSystem;
import java.util.Scanner;

public class Manifest {
	public static void main(String[] args){
	       
		   Passenger[] passengers=new Passenger[6];

	       Scanner sc=new Scanner(System.in);
	       int option;
	       String firstName;
	       String lastName;
	       
	       System.out.println("Welcome to airline reservation booking App");
	       System.out.println("---------MENU---------");
	       
	       boolean loop=true;
	       int index = 0;

	// Loop until finishing / full filling seats
	       while(loop)
	       {

	// propting user for class
	    	   System.out.print("Which seat do you want to choose:\n" + 
	                    "1.Economy\n" + 
	                    "2.First\n");
	           option=sc.nextInt();
	           sc.nextLine();
	           
	           if(option==1)
	           {
	               if(Economy.bookedCount<4)
	               {
	            	   System.out.print("Enter passenger first name:");
	            	   firstName=sc.next();
	            	   
	            	   System.out.print("Enter passenger last name:");
	            	   lastName=sc.next();
	            	   
	            	   
	            	   Economy e=new Economy();
	            	   Passenger p=new Passenger();
	            	   p.setFirstName(firstName);
	            	   p.setLastName(lastName);
	            	   p.setSection(e);
	            	   p.generateCode();
	            	   passengers[index]=p;
	            	   index++;
	               }
	               else if(FirstClass.bookedCount<2)
	               {
	                   System.out.println("Economy is full Do you want to book in first class");
	                   System.out.print("Enter 1 if you want to book 2 to no");
	                   int conv=sc.nextInt();
	                   if(conv==1)
	                   {
	                	   System.out.print("Enter passenger first name:");
		            	   firstName=sc.next();
		            	   
		            	   System.out.print("Enter passenger last name:");
		            	   lastName=sc.next();
	                       
	                       
	                       FirstClass e=new FirstClass();
	                       Passenger p=new Passenger();
	                       p.setFirstName(firstName);
		            	   p.setLastName(lastName);
	                       p.setSection(e);
	                       p.generateCode();
	                       passengers[index]=p;
	                       index++;
	                   }
	                   else
	                       System.out.println("Thank you for visiting");
	                   		break;
	               }
	               else
	               {
	                   System.out.println("No seats in two sections");
	                   loop=false;
	               }
	           }
	           else if(option==2)
	           {

	               if(FirstClass.bookedCount<2)
	               {
	            	   System.out.print("Enter passenger first name:");
	            	   firstName=sc.next();
	            	   
	            	   System.out.print("Enter passenger last name:");
	            	   lastName=sc.next();
	                   
	                   FirstClass e=new FirstClass();
	                   Passenger p=new Passenger();
	                   p.setFirstName(firstName);
	            	   p.setLastName(lastName);
	                   p.setSection(e);
	                   p.generateCode();
	                   passengers[index]=p;
	                   index++;
	               }
	               else if(Economy.bookedCount<4)
	               {
	                   System.out.println("First Class is full Do you want to book in Economy");
	                   System.out.println("Enter 1 if you want to book 2 to no");
	                   int conv=sc.nextInt();
	                   
	                   if(conv==1)
	                   {
	                	   System.out.print("Enter passenger first name:");
		            	   firstName=sc.next();
		            	   
		            	   System.out.print("Enter passenger last name:");
		            	   lastName=sc.next();
	                       
	                       Economy e = new Economy();
	                       Passenger p = new Passenger();
	                       p.setFirstName(firstName);
		            	   p.setLastName(lastName);
	                       p.setSection(e);
	                       p.generateCode();
	                       passengers[index]=p;
	                       index++;
	                   }
	                   else
	                       System.out.println("Thank you for visiting");
	                   		break;
	               }
	               else
	               {
	                   System.out.println("No seats in two sections");
	                   loop=false;
	               }
	           }
	       }
	       
	       System.out.println("\nThe list of passengers who booked tickets");
	       for(int i=0;i<passengers.length;i++)
	       {
	           System.out.println(passengers[i]);
	       }
	   }
}
