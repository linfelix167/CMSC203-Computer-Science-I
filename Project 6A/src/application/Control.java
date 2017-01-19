package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Control {

	private ArrayList<Company> rooms;
	private Company room;
	private Position position;
	
	public Control(){
		room = new Company("Wacky Widgets");
		rooms = new ArrayList<Company>();	
	}
	
	@FXML
	private RadioButton ManagerRadio;
	
	@FXML
	private RadioButton DesignRadio;
	
	@FXML
	private RadioButton SalesRadio;
	
	@FXML
	private RadioButton ManufacturingRadio;
	
	private String getPosition(){
		if(ManagerRadio.isSelected()){
			return "Manager";
		}else if(DesignRadio.isSelected()){
			return "Design";
		}else if(SalesRadio.isSelected()){
			return "Sales";
		}else if(ManufacturingRadio.isSelected()){
			return "Manufacturing";
		}else
			return "";
	}
	
	@FXML
	private Label WeeklySaleLabel;
	@FXML
	private TextField WeeklySaleText;
	@FXML
	private Label PayrateLabel;
	@FXML
	private TextField PayrateText;
	@FXML
	private Label HoursLabel;
	@FXML
	private TextField HoursText;
	@FXML
	private Label PriceRateLabel;
	@FXML
	private TextField PriceRateText;
	@FXML
	private Label piecesLabel;
	@FXML
	private TextField piecesText;
	@FXML
	private Label SalaryLabel;
	@FXML
	private TextField SalaryText;
	
	public void radioButtonListener(ActionEvent event){
		if(SalesRadio.isSelected()){
			WeeklySaleLabel.setVisible(true);
			WeeklySaleText.setVisible(true);
			PayrateLabel.setVisible(false);
			PayrateText.setVisible(false);
			HoursLabel.setVisible(false);
			HoursText.setVisible(false);
			PriceRateLabel.setVisible(false);
			PriceRateText.setVisible(false);
			piecesLabel.setVisible(false);
			piecesText.setVisible(false);
			SalaryLabel.setVisible(false);
			SalaryText.setVisible(false);
			
		}
		else if(DesignRadio.isSelected()){
			PayrateLabel.setVisible(true);
			PayrateText.setVisible(true);
			HoursLabel.setVisible(true);
			HoursText.setVisible(true);
			WeeklySaleLabel.setVisible(false);
			WeeklySaleText.setVisible(false);
			PriceRateLabel.setVisible(false);
			PriceRateText.setVisible(false);
			piecesLabel.setVisible(false);
			piecesText.setVisible(false);
			SalaryLabel.setVisible(false);
			SalaryText.setVisible(false);
		}
		else if(ManufacturingRadio.isSelected()){
			PriceRateLabel.setVisible(true);
			PriceRateText.setVisible(true);
			piecesLabel.setVisible(true);
			piecesText.setVisible(true);
			PayrateLabel.setVisible(false);
			PayrateText.setVisible(false);
			HoursLabel.setVisible(false);
			HoursText.setVisible(false);
			WeeklySaleLabel.setVisible(false);
			WeeklySaleText.setVisible(false);
			SalaryLabel.setVisible(false);
			SalaryText.setVisible(false);
		}
		else if(ManagerRadio.isSelected()){
			SalaryLabel.setVisible(true);
			SalaryText.setVisible(true);
			PriceRateLabel.setVisible(false);
			PriceRateText.setVisible(false);
			piecesLabel.setVisible(false);
			piecesText.setVisible(false);
			PayrateLabel.setVisible(false);
			PayrateText.setVisible(false);
			HoursLabel.setVisible(false);
			HoursText.setVisible(false);
			WeeklySaleLabel.setVisible(false);
			WeeklySaleText.setVisible(false);
		}
	}
	
	@FXML
	private ToggleGroup g1;
	
	@FXML
	private TextField IdText;
	
	@FXML
	private TextField FNameText;
	
	@FXML
	private TextField LNameText;
	
	@FXML
	private Button ClearButton;
	
	public void clear(){
		IdText.clear();
		FNameText.clear();
		LNameText.clear();
		SalaryText.clear();
		WeeklySaleText.clear();
		PayrateText.clear();
		HoursText.clear();
		PriceRateText.clear();
		piecesText.clear();
	}
	
	@FXML
	private Button AddButton;
	
	public void add(){
		
		if(!FNameText.getText().equals("") && !LNameText.getText().equals("") || !IdText.getText().equals("") || !SalaryText.getText().equals("")) {
			String message = "";
			if(ManagerRadio.isSelected()) {
				message = room.addEmployee(FNameText.getText(), LNameText.getText(),getPosition(), Integer.parseInt(IdText.getText()),
						Double.parseDouble(SalaryText.getText()), 0);
				rooms.add(room);
				if(message == null){
				FNameText.setText("");
				LNameText.setText("");
				IdText.setText("");
				ManagerRadio.setSelected(false);
				DesignRadio.setSelected(false);
				SalesRadio.setSelected(false);
				ManufacturingRadio.setSelected(false);
				
				}else{
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Error");
					alert.setHeaderText(null);
					alert.setContentText(message);
					alert.showAndWait();
				}
			}else if(DesignRadio.isSelected()){
				message = room.addEmployee(FNameText.getText(), LNameText.getText(),getPosition(), Integer.parseInt(IdText.getText()),
						 Double.parseDouble(PayrateText.getText()), Double.parseDouble(HoursText.getText()));
				rooms.add(room);
				if(message == null){
					FNameText.setText("");
					LNameText.setText("");
					IdText.setText("");
					ManagerRadio.setSelected(false);
					DesignRadio.setSelected(false);
					SalesRadio.setSelected(false);
					ManufacturingRadio.setSelected(false);
					}else{
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Error");
						alert.setHeaderText(null);
						alert.setContentText(message);
						alert.showAndWait();
					}
				
			} else if(SalesRadio.isSelected()){
				
				message = room.addEmployee(FNameText.getText(), LNameText.getText(),getPosition(), Integer.parseInt(IdText.getText()),
						 Double.parseDouble(WeeklySaleText.getText()), 0);
				rooms.add(room);
				if(message == null){
					FNameText.setText("");
					LNameText.setText("");
					IdText.setText("");
					ManagerRadio.setSelected(false);
					DesignRadio.setSelected(false);
					SalesRadio.setSelected(false);
					ManufacturingRadio.setSelected(false);
					}else{
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Error");
						alert.setHeaderText(null);
						alert.setContentText(message);
						alert.showAndWait();
					}
				
			}else if(ManufacturingRadio.isSelected()){
				
				message = room.addEmployee(FNameText.getText(), LNameText.getText(),getPosition(), Integer.parseInt(IdText.getText()),
						 Double.parseDouble(PriceRateText.getText()), Double.parseDouble(piecesText.getText()));
				rooms.add(room);
				if(message == null){
					FNameText.setText("");
					LNameText.setText("");
					IdText.setText("");
					ManagerRadio.setSelected(false);
					DesignRadio.setSelected(false);
					SalesRadio.setSelected(false);
					ManufacturingRadio.setSelected(false);
					}else{
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Error");
						alert.setHeaderText(null);
						alert.setContentText(message);
						alert.showAndWait();
					}
			}
			
			else {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Error");
				alert.setHeaderText(null);
				alert.setContentText("Please select an employee title");
				alert.showAndWait();
			}
		} else {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Error");
			alert.setHeaderText(null);
			alert.setContentText("Please specify a first and last name");
			alert.showAndWait();
		}
	}
	
	@FXML
	private Button RemoveButton;
	
	public void remove(){
		
	String s= FNameText.getText(), b=LNameText.getText();
	
	for(int i = 0; i < rooms.size(); i++){
		if(s == FNameText.getText() && b == LNameText.getText()){
			rooms.remove(i);
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Remove");
			
			alert.setContentText(s + b +"has been removed!");
			alert.showAndWait();
		}
	}
	
	}
	
	@FXML
	private Button WriteButton;
	
	public void write(){
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("Employee.txt", true))) {
	        bw.write(room.printCompany());
	        bw.newLine();
	        
	    } catch (IOException e) {
	        e.printStackTrace();

	    }
	}
	@FXML
	private Button PrintCompanyButton;
	
	public void printCompany(){
		String roomDetails = room.toString();
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Employee Details");
		
		alert.setContentText(roomDetails);
		alert.showAndWait();
	}
	
	@FXML
	private Button PrintWeeklyButton;
	
	public void printWeek(){
		String message = room.generateWeeklyReport();
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Weekly Pay Report");
		
		alert.setContentText(message);
		alert.showAndWait();
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
