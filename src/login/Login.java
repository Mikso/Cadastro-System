/**
 * 
 */
package login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;

/**
 * @author Bruno
 *
 */
public class Login extends Application{

	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		GridPane mainPane = (GridPane)FXMLLoader.load(Login.class.getResource("Login.fxml"));
		
		
		primaryStage.setScene(new Scene(mainPane));
		primaryStage.setTitle("Login");
		primaryStage.show();
		
	}
	
	
	
}
