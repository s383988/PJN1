package application;
	
import java.io.File;
import java.io.IOException;

import application.view.MenuController;
import application.view.RootController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	

    private Stage primaryStage;
    private BorderPane root;
    
    public Main() {
    	
    }
    
    public void initRoot() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/Root.fxml"));
            root = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);

            // Give the controller access to the main .
            RootController controller = loader.getController();
            controller.setMain(this);

            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
//
//        // Try to load last opened person file.
//        File file = getPersonFilePath();
//        if (file != null) {
//            loadPersonDataFromFile(file);
//        }
    }
    
	@Override
	public void start(Stage primaryStage) {
		try {
			 this.primaryStage = primaryStage;
		     this.primaryStage.setTitle("Nazwiska");
		     initRoot();
		     initMenu();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void initMenu() {

		try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/Menu.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            root.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	  public Stage getPrimaryStage() {
	        return primaryStage;
	    }

	public static void main(String[] args) {
		launch(args);
	}
}
