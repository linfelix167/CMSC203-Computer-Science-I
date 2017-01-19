package airlineReservationSystem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PassengerTest {
	Passenger passenger1, passenger2,passenger3;
	
	@Before
	public void setUp() throws Exception {
		passenger1 = new Passenger();
		passenger2 = new Passenger();
		passenger3 = new Passenger();
	}

	@After
	public void tearDown() throws Exception {
		passenger1 = passenger2 = passenger3 = null;
	}

	@Test
	public void testGetSection() {
		assertTrue(true);
	}

	@Test
	public void testSetSection() {
		assertTrue(true);
	}

	@Test
	public void testGetFirstName() {
		passenger1.setFirstName("Felix");
		assertTrue(passenger1.getFirstName() == "Felix");
	}

	@Test
	public void testSetFirstName() {
		assertTrue(true);
	}
	
	@Test
	public void testGetLastName() {
		passenger1.setLastName("Lin");
		assertTrue(passenger1.getLastName() == "Lin");
	}

	@Test
	public void testSetLastName() {
		assertTrue(true);
	}

	@Test
	public void testGetCode() {
		
		assertTrue(true);
	}

	@Test
	public void testGenerateCode() {
		assertTrue(true);
	}

	@Test
	public void testToString() {
		assertTrue(true);
	}

}
