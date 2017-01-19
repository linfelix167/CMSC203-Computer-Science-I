package airlineReservationSystem;

public class FirstClass extends Section{
	
	public static final int TOTAL_SEATS=2;
	public static int bookedCount=0;
	   
	/**
	 * This method will check first class is full or not
	 */
	public boolean checkAvailability()
	{
	       if(bookedCount>=TOTAL_SEATS)
	           return false;
	       else
	           return true;
	}
	
	/**
	 * Count the seat in first is booked
	 */
	public FirstClass()
	{
	       bookedCount++;
	}
}
