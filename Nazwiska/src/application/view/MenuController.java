package application.view;

import application.Main;
import application.model.Connection;
import application.model.Lastname;
import application.model.PatternVariety;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class MenuController {
	
    
	@FXML
    private Label mian;
    @FXML
    private Label dop;
    @FXML
    private Label cel;
    @FXML
    private Label bie;
    @FXML
    private Label narz;
    @FXML
    private Label mie;
    @FXML
    private Label wol;
    @FXML
    private TextField lastname;
    @FXML
    private Button ok;
    @FXML
    private RadioButton woman;
    @FXML
    private RadioButton man;
    @FXML
    private RadioButton lmn;
 
    
    private Main main;
    
    @FXML
    private void handleOk() {
    	
    	String type = "";
        String lastn = lastname.getText().trim();
        String name = (String) lastn.toUpperCase().subSequence(0, 1) 
        		+ (String) lastn.toLowerCase().subSequence(1, lastn.length());
        if(woman.isSelected())
        	type = "K";
        if(man.isSelected())
        	type = "M";
        if(lmn.isSelected())
        	type = "P";
        String suffixes [];
        Lastname lastname;
        	
        PatternVariety patternVariety = new PatternVariety();
        suffixes = patternVariety.findPattern(name, type);
        Connection connection = new Connection();
        lastname = connection.connect(name, suffixes, type);
        fillLabels(lastname);
    }
    
    private void fillLabels(Lastname lastname) {
        
            mian.setText(lastname.getMianownik());
            dop.setText(lastname.getDopelniacz());
            cel.setText(lastname.getCelownik());
            bie.setText(lastname.getBiernik());
            narz.setText(lastname.getNarzednik());
            mie.setText(lastname.getMiejscownik());
            wol.setText(lastname.getWolacz());
           
    }

    @FXML
    private void handleMan() {
    	RadioButton women = new RadioButton();
    	women.setSelected(false);
    	RadioButton lmn = new RadioButton();
    	lmn.setSelected(false);
    	
    }
    
    @FXML
    private void handleWoman() {
    	RadioButton men = new RadioButton();
    	men.setSelected(false);
    	RadioButton lmn = new RadioButton();
    	lmn.setSelected(false);
    	
    }
    
    @FXML
    private void handleLmn() {
    	RadioButton women = new RadioButton();
    	women.setSelected(false);
    	RadioButton man = new RadioButton();
    	man.setSelected(false);
    	
    }
    public void setMain(Main main) {
        this.main = main;
    }
}
