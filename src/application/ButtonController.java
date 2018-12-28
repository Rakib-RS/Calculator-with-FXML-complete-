package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ButtonController {
	Float data = 0f;
	Float ans = 0f;
	int operation = 1;
	int lastEvent = -1;
	@FXML
	private TextField display;

	@FXML
	private Button seven;

	@FXML
	void handleButtonAction(ActionEvent event) {
		// System.out.println("ok1");
		if (event.getSource() == seven) {
			if (lastEvent == 1 || lastEvent == 2 || lastEvent == 3 || lastEvent == 4 || lastEvent == 5) {
				display.setText("");
			}
			display.setText(display.getText() + "7");
			lastEvent = -1;
		}

	}
}
