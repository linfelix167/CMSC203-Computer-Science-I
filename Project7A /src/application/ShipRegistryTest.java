package application;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

import javax.swing.SwingUtilities;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;

import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShipRegistryTest {

	//ShipRegistry object for testing
	ShipRegistry test;
	
	@Before
	public void setUp() throws Exception {
		test = new ShipRegistry();
		test.addShip("AAA", "Cargo", "2016", 2000, 0, 0, 0, 0);
		test.addShip("BBB", "Cruise", "2015", 0, 1000, 0, 0, 0);
		test.addShip("CCC", "Warship", "2014", 0, 0, 10, 10, 10);
		
	}

	@After
	public void tearDown() throws Exception {
		test = null;
	}

	@Test
	public void testAddShip() {
		test.addShip("DDD", "Submarine", "2013", 0, 0, 0, 30, 0);
		test.addShip("EEE", "Carrier", "2012", 0, 0, 0, 0, 20);
		assertEquals(5, test.getCount());
	}

	@Test
	public void testReadFile() {
		File testFile = new File("testFile.csv");
		try {
			test.readFile(testFile);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	@Test
	public void testWriteFile() {
		File testFile = new File("testFile.csv");
		try {
			test.writeFile(testFile);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
