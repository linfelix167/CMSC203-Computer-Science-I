package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JFileChooser;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Control {
	
	private ArrayList<ShipRegistry> ships;
	private ShipRegistry ship;
	
	public Control(){
		ships = new ArrayList<ShipRegistry>(); 
		ship = new ShipRegistry();
	}
	@FXML
	private RadioButton CargoRadio;
	
	@FXML
	private RadioButton CruiseRadio;
	
	@FXML
	private RadioButton WarshipRadio;
	
	@FXML
	private TextField NameText;
	
	@FXML
	private TextField YearText;
	
	@FXML
	private TextField TypeText;
	
	@FXML
	private ToggleGroup group1;
	
	@FXML
	private ToggleGroup group2;
	
	@FXML
	private RadioButton CarrierRadio;
	
	@FXML
	private RadioButton CruiserRadio;
	
	@FXML
	private RadioButton DestroyerRadio;
	
	@FXML
	private RadioButton MineRadio;
	
	@FXML
	private RadioButton SubmarineRadio;
	
	@FXML
	private Label TonnageLabel;
	
	@FXML
	private TextField TonnageText;
	
	@FXML
	private Label PassengersLabel;
	
	@FXML
	private TextField PassengersText;
	
	@FXML
	private Label GunsLabel;
	
	@FXML
	private TextField GunsText;
	
	@FXML
	private Label AircraftLabel;
	
	@FXML
	private TextField AirCraftText;
	
	@FXML
	private Label TorpedoesLabel;
	
	@FXML
	private TextField TorpedoesText;
	
	public void radioAction(){
		
		if(CargoRadio.isSelected()){
			TypeText.setText("Cargo");
			TonnageLabel.setVisible(true);
			TonnageText.setVisible(true);
			CarrierRadio.setVisible(false);
			CruiserRadio.setVisible(false);
			DestroyerRadio.setVisible(false);
			MineRadio.setVisible(false);
			SubmarineRadio.setVisible(false);
			PassengersLabel.setVisible(false);
			PassengersText.setVisible(false);
			GunsLabel.setVisible(false);
			GunsText.setVisible(false);
			AircraftLabel.setVisible(false);
			AirCraftText.setVisible(false);
			TorpedoesLabel.setVisible(false);
			TorpedoesText.setVisible(false);
		}else if(CruiseRadio.isSelected()){
			TypeText.setText("Cruise");
			TonnageLabel.setVisible(false);
			TonnageText.setVisible(false);
			CarrierRadio.setVisible(false);
			CruiserRadio.setVisible(false);
			DestroyerRadio.setVisible(false);
			MineRadio.setVisible(false);
			SubmarineRadio.setVisible(false);
			PassengersLabel.setVisible(true);
			PassengersText.setVisible(true);
			GunsLabel.setVisible(false);
			GunsText.setVisible(false);
			AircraftLabel.setVisible(false);
			AirCraftText.setVisible(false);
			TorpedoesLabel.setVisible(false);
			TorpedoesText.setVisible(false);
		}else if(WarshipRadio.isSelected()){
			TypeText.setText("Warship");
			TonnageLabel.setVisible(false);
			TonnageText.setVisible(false);
			CarrierRadio.setVisible(true);
			CruiserRadio.setVisible(true);
			DestroyerRadio.setVisible(true);
			MineRadio.setVisible(true);
			SubmarineRadio.setVisible(true);
			PassengersLabel.setVisible(false);
			PassengersText.setVisible(false);
			GunsLabel.setVisible(true);
			GunsText.setVisible(true);
			AircraftLabel.setVisible(true);
			AirCraftText.setVisible(true);
			TorpedoesLabel.setVisible(true);
			TorpedoesText.setVisible(true);
		}else if(CarrierRadio.isSelected()){
			TypeText.setText("Carrier");
			TonnageLabel.setVisible(false);
			TonnageText.setVisible(false);
			CarrierRadio.setVisible(true);
			CruiserRadio.setVisible(true);
			DestroyerRadio.setVisible(true);
			MineRadio.setVisible(true);
			SubmarineRadio.setVisible(true);
			PassengersLabel.setVisible(false);
			PassengersText.setVisible(false);
			GunsLabel.setVisible(false);
			GunsText.setVisible(false);
			AircraftLabel.setVisible(true);
			AirCraftText.setVisible(true);
			TorpedoesLabel.setVisible(false);
			TorpedoesText.setVisible(false);
		}else if(CruiserRadio.isSelected()){
			TypeText.setText("Cruiser");
			TonnageLabel.setVisible(false);
			TonnageText.setVisible(false);
			CarrierRadio.setVisible(true);
			CruiserRadio.setVisible(true);
			DestroyerRadio.setVisible(true);
			MineRadio.setVisible(true);
			SubmarineRadio.setVisible(true);
			PassengersLabel.setVisible(false);
			PassengersText.setVisible(false);
			GunsLabel.setVisible(true);
			GunsText.setVisible(true);
			AircraftLabel.setVisible(false);
			AirCraftText.setVisible(false);
			TorpedoesLabel.setVisible(false);
			TorpedoesText.setVisible(false);
		}else if(DestroyerRadio.isSelected()){
			TypeText.setText("Destroyer");
			TonnageLabel.setVisible(false);
			TonnageText.setVisible(false);
			CarrierRadio.setVisible(true);
			CruiserRadio.setVisible(true);
			DestroyerRadio.setVisible(true);
			MineRadio.setVisible(true);
			SubmarineRadio.setVisible(true);
			PassengersLabel.setVisible(false);
			PassengersText.setVisible(false);
			GunsLabel.setVisible(true);
			GunsText.setVisible(true);
			AircraftLabel.setVisible(false);
			AirCraftText.setVisible(false);
			TorpedoesLabel.setVisible(false);
			TorpedoesText.setVisible(false);
		}else if(MineRadio.isSelected()){
			TypeText.setText("Mine Sweeper");
			TonnageLabel.setVisible(false);
			TonnageText.setVisible(false);
			CarrierRadio.setVisible(true);
			CruiserRadio.setVisible(true);
			DestroyerRadio.setVisible(true);
			MineRadio.setVisible(true);
			SubmarineRadio.setVisible(true);
			PassengersLabel.setVisible(false);
			PassengersText.setVisible(false);
			GunsLabel.setVisible(true);
			GunsText.setVisible(true);
			AircraftLabel.setVisible(false);
			AirCraftText.setVisible(false);
			TorpedoesLabel.setVisible(false);
			TorpedoesText.setVisible(false);
		}else if(SubmarineRadio.isSelected()){
			TypeText.setText("Submarine");
			TonnageLabel.setVisible(false);
			TonnageText.setVisible(false);
			CarrierRadio.setVisible(true);
			CruiserRadio.setVisible(true);
			DestroyerRadio.setVisible(true);
			MineRadio.setVisible(true);
			SubmarineRadio.setVisible(true);
			PassengersLabel.setVisible(false);
			PassengersText.setVisible(false);
			GunsLabel.setVisible(false);
			GunsText.setVisible(false);
			AircraftLabel.setVisible(false);
			AirCraftText.setVisible(false);
			TorpedoesLabel.setVisible(true);
			TorpedoesText.setVisible(true);
		}
	}
	
	private boolean validate(String text)
    {
        return text.matches("[0-9]*");
    }
	
	@FXML
	private Button AddButton;
	
	public void add(){
		if(!NameText.getText().equals("") && !YearText.getText().equals("") && !TypeText.getText().equals("") && validate(YearText.getText())){
			if(CargoRadio.isSelected()){
				if(validate(TonnageText.getText())){
				ship.addShip(NameText.getText(), "Cargo", YearText.getText(), Integer.parseInt(TonnageText.getText()), 0, 0, 0, 0);
				ships.add(ship);
				NameText.clear();
				YearText.clear();
				TonnageText.clear();
				}else{
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Error");
					alert.setHeaderText(null);
					alert.setContentText("Invalid input!\nYou must input numeric value in tonnage field.");
					alert.showAndWait();
				}
			}else if(CruiseRadio.isSelected()){
				if(validate(PassengersText.getText())){
				ship.addShip(NameText.getText(), "Cruise", YearText.getText(), 0, Integer.parseInt(PassengersText.getText()), 0, 0, 0);
				ships.add(ship);
				NameText.clear();
				YearText.clear();
				PassengersText.clear();
				}else{
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Error");
					alert.setHeaderText(null);
					alert.setContentText("Invalid input!\nYou must input numeric value in passenger field.");
					alert.showAndWait();
				}
			}else if(WarshipRadio.isSelected()){
				if(validate(GunsText.getText()) && validate(AirCraftText.getText()) && validate(TorpedoesText.getText())){
				ship.addShip(NameText.getText(), "Warship", YearText.getText(), 0, 0, Integer.parseInt(GunsText.getText()), Integer.parseInt(AirCraftText.getText()), Integer.parseInt(TorpedoesText.getText()));
				ships.add(ship);
				NameText.clear();
				YearText.clear();
				GunsText.clear();
				AirCraftText.clear();
				TorpedoesText.clear();
				}else{
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Error");
					alert.setHeaderText(null);
					alert.setContentText("Invalid input!\nYou must input numeric value in gun field, aircraft field and torpedoes field.");
					alert.showAndWait();
				}
			}else if(CarrierRadio.isSelected()){
				if(validate(AirCraftText.getText())){
				ship.addShip(NameText.getText(), "Carrier", YearText.getText(), 0, 0, 0, 0, Integer.parseInt(AirCraftText.getText()));
				ships.add(ship);
				NameText.clear();
				YearText.clear();
				AirCraftText.clear();
				}else{
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Error");
					alert.setHeaderText(null);
					alert.setContentText("Invalid input!\nYou must input numeric value in aircraft field.");
					alert.showAndWait();
				}
			}else if(CruiserRadio.isSelected()){
				if(validate(GunsText.getText())){
				ship.addShip(NameText.getText(), "Cruiser", YearText.getText(), 0, 0, Integer.parseInt(GunsText.getText()), 0, 0);
				ships.add(ship);
				NameText.clear();
				YearText.clear();
				GunsText.clear();
				}else{
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Error");
					alert.setHeaderText(null);
					alert.setContentText("Invalid input!\nYou must input numeric value in gun field.");
					alert.showAndWait();
				}
			}else if(DestroyerRadio.isSelected()){
				if(validate(GunsText.getText())){
				ship.addShip(NameText.getText(), "Destroyer", YearText.getText(), 0, 0, Integer.parseInt(GunsText.getText()), 0, 0);
				ships.add(ship);
				NameText.clear();
				YearText.clear();
				GunsText.clear();
				}else{
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Error");
					alert.setHeaderText(null);
					alert.setContentText("Invalid input!\nYou must input numeric value in gun field.");
					alert.showAndWait();
				}
			}else if(MineRadio.isSelected()){
				if(validate(GunsText.getText())){
				ship.addShip(NameText.getText(), "Mine Sweeper", YearText.getText(), 0, 0, Integer.parseInt(GunsText.getText()), 0, 0);
				ships.add(ship);
				NameText.clear();
				YearText.clear();
				GunsText.clear();
				}else{
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Error");
					alert.setHeaderText(null);
					alert.setContentText("Invalid input!\nYou must input numeric value in gun field.");
					alert.showAndWait();
				}
			}else if(SubmarineRadio.isSelected()){
				if(validate(TorpedoesText.getText())){
				ship.addShip(NameText.getText(), "Submarine", YearText.getText(), 0, 0, 0, Integer.parseInt(TorpedoesText.getText()), 0);
				ships.add(ship);
				NameText.clear();
				YearText.clear();
				TorpedoesText.clear();
				}else{
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Error");
					alert.setHeaderText(null);
					alert.setContentText("Invalid input!\nYou must input numeric value in torpedoe field.");
					alert.showAndWait();
				}
			}else {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Error");
				alert.setHeaderText(null);
				alert.setContentText("Please select an ship type");
				alert.showAndWait();
			}
		}else if(!validate(YearText.getText())){
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Error");
			alert.setHeaderText(null);
			alert.setContentText("Invalid input!\nYou must input numeric valu in year field.");
			alert.showAndWait();
		}else{
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Error");
			alert.setHeaderText(null);
			alert.setContentText("Please specify name and year");
			alert.showAndWait();
		}
	}
	@FXML
	private Button ResetButton;
	
	public void resetButton(){
		NameText.clear();
		YearText.clear();
		TypeText.clear();
		TonnageText.clear();
		PassengersText.clear();
		GunsText.clear();
		AirCraftText.clear();
		TorpedoesText.clear();
		CargoRadio.setSelected(false);
		CruiseRadio.setSelected(false);
		WarshipRadio.setSelected(false);
		CarrierRadio.setSelected(false);
		CruiserRadio.setSelected(false);
		DestroyerRadio.setSelected(false);
		MineRadio.setSelected(false);
		SubmarineRadio.setSelected(false);
		TonnageLabel.setVisible(false);
		TonnageText.setVisible(false);
		CarrierRadio.setVisible(false);
		CruiserRadio.setVisible(false);
		DestroyerRadio.setVisible(false);
		MineRadio.setVisible(false);
		SubmarineRadio.setVisible(false);
		PassengersLabel.setVisible(false);
		PassengersText.setVisible(false);
		GunsLabel.setVisible(false);
		GunsText.setVisible(false);
		AircraftLabel.setVisible(false);
		AirCraftText.setVisible(false);
		TorpedoesLabel.setVisible(false);
		TorpedoesText.setVisible(false);
	}
	
	@FXML
	private Button DisplayButton;
	
	public void display(){
		String message = ship.printShip();
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Ship Information");
		alert.setHeaderText(null);
		alert.setContentText(message);
		alert.showAndWait();
	}
	
	
	
	public void writeFile() throws Exception  {
		File file;
		FileChooser chooser = new FileChooser();
		chooser.setTitle("Choose a *.csv file to write to");
		file = chooser.showOpenDialog(null);
		if(file != null){
		ship.writeFile(file);
		}
	}
	
	public void readFile() throws FileNotFoundException, IOException{
		 	File file;
		   FileChooser chooser = new FileChooser();
		   file = chooser.showOpenDialog(null);
		   if(file != null) 
			   ship.readFile(file);	
	}
	
	@FXML
	private Button ExitButton;
	
	public void closeButtonAction(){
	    // get a handle to the stage
	    Stage stage = (Stage) ExitButton.getScene().getWindow();
	    // do what you have to do
	    stage.close();
	}
}
