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
	private Button eight;

	@FXML
	private Button nine;

	@FXML
	private Button div;

	@FXML
	private Button four;

	@FXML
	private Button five;

	@FXML
	private Button six;

	@FXML
	private Button mul;

	@FXML
	private Button one;

	@FXML
	private Button two;

	@FXML
	private Button three;

	@FXML
	private Button sub;

	@FXML
	private Button reset;

	@FXML
	private Button zero;

	@FXML
	private Button equal;

	@FXML
	private Button add;

	@FXML
	void doOperation() {
		switch (operation) {
		case 1: // Addition
			data = Float.parseFloat(display.getText());
			ans += data;
			display.setText(String.valueOf(ans));
			break;
		case 2: // Subtraction
			data = Float.parseFloat(display.getText());
			ans -= data;
			display.setText(String.valueOf(ans));
			break;
		case 3: // Mul
			data = Float.parseFloat(display.getText());
			ans *= data;
			display.setText(String.valueOf(ans));
			break;
		case 4: // Div
			data = Float.parseFloat(display.getText());
			try {
				ans /= data;
			} catch (Exception e) {
				display.setText("Error");
			}
			display.setText(String.valueOf(ans));
			break;
		}
	}

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
		else if (event.getSource() == eight) {
			if (lastEvent == 1 || lastEvent == 2 || lastEvent == 3 || lastEvent == 4 || lastEvent == 5) {
				display.setText("");
			}
			display.setText(display.getText() + "8");
			lastEvent = -1;
		} 
		else if (event.getSource() == nine) {
			if (lastEvent == 1 || lastEvent == 2 || lastEvent == 3 || lastEvent == 4 || lastEvent == 5) {
				display.setText("");
			}
			display.setText(display.getText() + "9");
			lastEvent = -1;
		} 
		else if (event.getSource() == four) {
			if (lastEvent == 1 || lastEvent == 2 || lastEvent == 3 || lastEvent == 4 || lastEvent == 5) {
				display.setText("");
			}
			display.setText(display.getText() + "4");
			lastEvent = -1;
		} 
		else if (event.getSource() == five) {
			if (lastEvent == 1 || lastEvent == 2 || lastEvent == 3 || lastEvent == 4 || lastEvent == 5) {
				display.setText("");
			}
			display.setText(display.getText() + "5");
			lastEvent = -1;
		} 
		else if (event.getSource() == six) {
			if (lastEvent == 1 || lastEvent == 2 || lastEvent == 3 || lastEvent == 4 || lastEvent == 5) {
				display.setText("");
			}
			display.setText(display.getText() + "6");
			lastEvent = -1;
		} 
		else if (event.getSource() == one) {
			if (lastEvent == 1 || lastEvent == 2 || lastEvent == 3 || lastEvent == 4 || lastEvent == 5) {
				display.setText("");
			}
			display.setText(display.getText() + "1");
			lastEvent = -1;
		} 
		else if (event.getSource() == two) {
			if (lastEvent == 1 || lastEvent == 2 || lastEvent == 3 || lastEvent == 4 || lastEvent == 5) {
				display.setText("");
			}
			display.setText(display.getText() + "2");
			lastEvent = -1;
		} 
		else if (event.getSource() == three) {
			if (lastEvent == 1 || lastEvent == 2 || lastEvent == 3 || lastEvent == 4 || lastEvent == 5) {
				display.setText("");
			}
			display.setText(display.getText() + "3");
			lastEvent = -1;
		} 
		else if (event.getSource() == zero) {
			if (lastEvent == 1 || lastEvent == 2 || lastEvent == 3 || lastEvent == 4 || lastEvent == 5) {
				display.setText("");
			}
			display.setText(display.getText() + "0");
			lastEvent = -1;
		} 
		else if (event.getSource() == reset) {
			display.setText("0");
			//System.out.println("reset");
			lastEvent = -1;
			ans = 0f;
			data = 0f;
			operation = 1;
		} 
		else if (event.getSource() == add) {
			doOperation();
			lastEvent = 1;
			operation = 1;
		} 
		else if (event.getSource() == sub) {
			doOperation();
			lastEvent = 2;
			operation = 2;
		} 
		else if (event.getSource() == mul) {
			doOperation();
			lastEvent = 3;
			operation = 3;
		} 
		else if (event.getSource() == div) {
			doOperation();
			lastEvent = 4;
			operation = 4;
		} 
		else if (event.getSource() == equal) {
			doOperation();
			lastEvent = 5;
			ans = 0f;
			data = 0f;
			operation = 1;
		}

	}
}
