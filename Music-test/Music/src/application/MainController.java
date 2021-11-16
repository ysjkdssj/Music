package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MainController {
	
	@FXML
	private Circle test;
	
	public void blue() {

		try {
			Parent login = FXMLLoader.load(getClass().getResource("/Ui/Drum.fxml"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
