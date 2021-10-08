package builder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class BuilderContreller {
	
	@FXML
	private TextField inputText;
	
	@FXML
	private Text outputText;
	
	@FXML
	private void handlerBuilder(ActionEvent event) {
		outputText.setText ("Bienvenido: " + inputText.getText() + "!\n");
	}

}
