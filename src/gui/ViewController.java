package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

//class that control the scene
public class ViewController {
	
	
	@FXML
	private Button btTest;
	
	@FXML
	public void onBtTestAction() {
		
		System.out.println("You have click on the button!");
		
	}

}
