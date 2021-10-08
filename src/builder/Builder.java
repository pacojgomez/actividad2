package builder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Builder extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader(Builder.class.getResource("Builder.fxml"));
		GridPane root = (GridPane) loader.load();
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Builder");
		stage.show();
	}

}
