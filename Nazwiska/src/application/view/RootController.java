package application.view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import application.Main;


public class RootController {
	
	private Main main;
	
	
	@FXML
    private void handleAbout() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Nazwiska");
        alert.setHeaderText("Aplikacja służy do odmiany nazwisk. Wpisz nazwisko w mianowniku rodzaju męskiego, np. Kowalski."
        		);
        alert.setContentText("Autor: Sandra Lewandowska");

        alert.showAndWait();
    }
	
	 @FXML
	    private void handleExit() {
	        System.exit(0);
	    }
	 
	 public void setMain(Main main) {
	        this.main = main;
	    }

}
