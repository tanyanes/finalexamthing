package pkgApp;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import pkgApp.RetirementApp;
import pkgCore.Retirement;
import javafx.scene.*;

public class RetirementController implements Initializable{
	
	private RetirementApp mainApp = null;
	
	@FXML
	private Label lblSaveEachMonth;
		
	@FXML
	private TextField txtYearsToWork;
	
	@FXML
	private TextField txtAnnualReturn1;
	
	@FXML
	private Label lblWhatYouNeedSaved;
	
	@FXML
	private TextField txtYearsRetired;
	
	@FXML
	private TextField txtAnnualReturn2;
	
	@FXML
	private TextField txtRequiredIncome;
	
	@FXML
	private TextField txtMonthlySSI;
	
	private Retirement n = Retirement(Integer.parseInt(txtYearsToWork.getText()), Double.parseDouble(txtAnnualReturn1.getText()), Integer.parseInt(txtYearsRetired.getText()), Double.parseDouble(txtAnnualReturn2.getText()), Double.parseDouble(txtRequiredIncome.getText()), Double.parseDouble(txtMonthlySSI.getText()));

	public RetirementApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(RetirementApp mainApp) {
		this.mainApp = mainApp;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
	
	//clear all
	@FXML
	public void btnClear(ActionEvent event) {
		System.out.println("Clear pressed");
		lblSaveEachMonth.setText(" ");
		lblWhatYouNeedSaved.setText(" ");
		txtYearsToWork.setText(" ");
		txtAnnualReturn1.setText(" ");
		txtYearsRetired.setText(" ");
		txtAnnualReturn2.setText(" ");
		txtRequiredIncome.setText(" ");
		txtMonthlySSI.setText(" ");
		
		//	TODO: Clear all the text inputs
	}
	
	@FXML
	public void btnCalculate(ActionEvent event) {
		lblSaveEachMonth.setText(String.format("%d", n.AmountToSave()));
		lblWhatYouNeedSaved.setText(String.format("%d", -1*n.TotalAmountSaved()));
		
		//	TODO: Call AmountToSave and TotalAmountSaved and populate 
		
	}
	
}
