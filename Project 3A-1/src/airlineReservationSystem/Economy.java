package airlineReservationSystem;

public class Economy extends Section{
	 
	public static final int TOTAL_SEATS=4;
	 public static int bookedCount=0;
	   
	 /**
	  * This method will check economy section is full or not
	  */
	 public boolean checkAvailability()
	 {
	       if(bookedCount>=TOTAL_SEATS)
	           return false;
	       else
	           return true;
	 }
	 	
	 /**
	  * Count seats in economy section is booked
	  */
	   public Economy()
	   {
	       bookedCount++;
	   }
	}

