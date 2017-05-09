package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ShipRegistry {

	private ArrayList<Ship> ship;
	private int count = 0;
	
	public ShipRegistry(){
		ship = new ArrayList<Ship>();
	}

	/**
	 * The addShip method adds ships to the ShipRegistry's ArrayList, distinguishing by type, 
	 * creating a ship instance of the correct type, and specifying the correct parameters according to its type. 
	 * This method does not add in any sorted order - the ships are held in the order they are added
	 * @param name A string representing the name of the ship
	 * @param type A string representing one of "Cargo", "Cruise", "Warship", "Carrier", "Cruiser","Destroyer","Mine Sweeper",or "Submarine"
	 * @param year A string representing the year launched
	 * @param tons A string representing the number of tons of cargo (net register tonnage (NRT)) the ship can carry
	 * @param pax A string representing the number of passengers a cruise ship can carry
	 * @param guns A string representing the number of guns a warship can carry.  "Guns" is loosely defined, not according to naval jargon
	 * @param torpedoes A string representing the number of torpedoes a warship can carry.
	 * @param aircraft A string representing the number of aircraft a warship can nominally carry.
	 */
	public void addShip(String name, String type, String year, int tons, int pax, int guns, int torpedoes,
			int aircraft) {
		switch(type){
		case "Cargo":
			ship.add(new CargoShip(name, year, type, (double)tons));
			count++;
			break;
		case "Cruise":
			ship.add(new CruiseShip(name, year, type, pax));
			count++;
			break;
		case "Warship":
			ship.add(new WarShip(name, year, type, guns, aircraft, torpedoes));
			count++;
			break;
		case "Carrier":
			ship.add(new Carrier(name, year, type, 0, aircraft, 0));
			count++;
			break;
		case "Cruiser":
			ship.add(new Cruiser(name, year, type, guns, 0, 0));
			count++;
			break;
		case "Destroyer":
			ship.add(new Destroyer(name, year, type, guns, 0, 0));
			count++;
			break;
		case "Mine Sweeper":
			ship.add(new Mine_Sweeper(name, year, type, guns, 0, 0));
			count++;
			break;
		case "Submarine":
			ship.add(new Submarine(name, year, type, 0, 0, torpedoes));
			count++;
			break;
		}
		
	}

	/**
	 * Select a file to read
	 * @param file Selected file
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void readFile(File file) throws FileNotFoundException, IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			   String line = null;
			   while ((line = br.readLine()) != null) {
				   System.out.println(line);
				   
				   Alert alert = new Alert(AlertType.INFORMATION);
				   alert.setTitle("File Contents");
				   alert.setHeaderText(null);
				   alert.setContentText(line+"\n");
				   alert.showAndWait();
			   }
			}
		
	}

	/**
	 * Write ships' information to .csv file
	 * @param file
	 * @throws FileNotFoundException
	 */
	public void writeFile(File file) throws FileNotFoundException  {
		
		PrintWriter pw = new PrintWriter(file);
        StringBuilder sb = new StringBuilder();
        sb.append(writeMode());
        pw.write(sb.toString());
        pw.close();
        
        Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Done!");
		alert.setHeaderText(null);
		alert.setContentText("Write ships' information to the file!");
		alert.showAndWait();
	}
	
	/**
	 * This method will return String to file
	 * @return string to file
	 */
	public String writeMode(){
		String result = "";
		for(Ship a: ship){
			result += a.writeString()+"\n";
		}
		return result;
	}
	
	/**
	 * Display the ships' information
	 * @return
	 */
	public String printShip(){
		String message = "";
		for(Ship member: ship){
			message += member + "\n";
		}
		return message;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	

}
