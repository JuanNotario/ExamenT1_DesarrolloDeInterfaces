package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

/**
 * 
 * @author Juan Notario
 * @version 1.0
 * @see application.Control
 *
 */


public class Main extends Application {
private AnchorPane mypane;
	
	@Override
	public void start(Stage stage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("view.fxml"));
			mypane = (AnchorPane) loader.load();
			
			Scene scene = new Scene(mypane);
			
			scene.getStylesheets().add(
					"https://fonts.googleapis.com/css?family=Poiret+One");
			
			stage.setScene(scene);
			stage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
