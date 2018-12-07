package application;

import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Control {
	private AnchorPane mypane;
	
	@FXML
	ImageView ImagenProfile;
	
	@FXML
	AnchorPane panel1;
	
	@FXML
	public void CloseStage() {
		System.exit(0);
	}
	
	@FXML
	public void abrirPanel() {
		
		Stage stage = new Stage();
		mypane = new AnchorPane();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ventana2.fxml"));
		try {
			mypane = (AnchorPane) loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		stage.setTitle("Cita Medica Sanitas");
		stage.setScene(new Scene(mypane));
		stage.show();
			
	}
	
	@FXML
	public void initialize() {
		
		FadeTransition fadeTransition = new FadeTransition(
				Duration.seconds(3), ImagenProfile);
		fadeTransition.setFromValue(0);
		fadeTransition.setToValue(1);
		fadeTransition.play();
			
	}
	
	@FXML
	public void cerrarVentan() {
		
		Stage stage = (Stage) panel1.getScene().getWindow();
		stage.close();
			
	}
}
