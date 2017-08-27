/**
 * 
 */
package login;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/**
 * @author Bruno
 *
 */
public class LoginController {

	@FXML
	Button btnLogar;
	@FXML
	Button btnSair;
	@FXML
	Hyperlink hlkSenha;
	@FXML
	Label lblNome;
	@FXML
	Label lblSenha;
	@FXML
	TextField txtNome;
	@FXML
	PasswordField txtSenha;
	@FXML
	final String uri = "https://www.google.com";
	
	@FXML
	public void Logar(ActionEvent eventLogar){
		if(txtNome.getText().equals("Bruno") & txtSenha.getText().equals("12345")){
			JOptionPane.showMessageDialog(null, "Bem vindo " + "Bruno!");
			
			// FECHAR A TELA ATUAL
			// Obtendo a tela
			Stage stage = (Stage)btnLogar.getScene().getWindow();
			stage.close(); // Fechand o Stage
			
		}else
			JOptionPane.showMessageDialog(null, "Usuário ou senha errados!");
	}
	
	@FXML
	public void Sair(ActionEvent eventSair){
		System.exit(0);
	}
	
	@FXML
	public void EsqueciSenha(ActionEvent eventEsqueci){
		try {
			Desktop.getDesktop().browse(new URI(uri));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void 

}