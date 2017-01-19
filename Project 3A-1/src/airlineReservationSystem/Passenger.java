package airlineReservationSystem;
import java.util.Random;

public class Passenger {	
		
	   /** Passenger choose which section*/
	   private Section section;
	   /**Passenger's first name*/
	   private String firstName;
	   /**Passenger's last name*/
	   private String lastName;
	   /**Generate a random code*/
	   private String code;
	   
	   /**
	    * Get which section passenger choose
	    * @return
	    */
	   public Section getSection() 
	   {
		return section;
	   }
	   
	   /**
	    * Set the section passenger choose
	    * @param section first class or economy
	    */
	   public void setSection(Section section) 
	   {
		this.section = section;
	   }
	   
	   /**
	    * Get each passenger's first name
	    * @return passenger's first name
	    */
	   public String getFirstName() 
	   {
		return firstName;
	   }
	   
	   /**
	    * Set passenger's first name
	    * @param first name
	    */
	   public void setFirstName(String firstName) 
	   {
		this.firstName = firstName;
	   }
	   
	   /**
	    * Get passenger's last name
	    * @return last name
	    */
	   public String getLastName() 
	   {
		return lastName;
	   }
	   
	  /**
	   * Set passenger's last name
	   * @param lastName
	   */
	   public void setLastName(String lastName) 
	   {
		this.lastName = lastName;
	   }

        /**
	    * Get a random code
	    * @return random code
	    */
	   public String getCode() 
	   {
		return code;
	   }
	   
	   /**
	    * This method will generate a random code for each passenger
	    */
	   public void generateCode() 
	   {
	       Random rm=new Random();
	       StringBuffer sb=new StringBuffer();
	       String codeLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	       for(int i=0;i<6;i++)
	       {
	           sb.append(codeLetters.charAt(rm.nextInt(codeLetters.length())));
	       }
	       
	       this.code = sb.toString();
	   }
	   
	   /**
	    * This method prints the information of each passenger
	    */
	   public String toString()
	   {

	       if(section instanceof Economy)
	    	   		return "\nPassenger name: "+firstName+" "+lastName+" \nSection: Economy Class \tCode: "+code;
	       else
	           return "\nPassenger name: "+firstName+" "+lastName+" \nSection: First Class \tCode: "+code;
	   }
}
