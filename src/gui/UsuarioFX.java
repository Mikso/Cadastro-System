/**
 * 
 */
package gui;


import javax.swing.JOptionPane;
import dao.UsuarioDAO;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import modelo.Usuario;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/**
 * @author Bruno
 *
 */
public class UsuarioFX extends Application{

	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Group root = new Group();
		Scene scene = new Scene(root, 400, 400, Color.SILVER);
		
		Label lblNome = new Label();
		lblNome.setText("Nome");
		lblNome.setLayoutX(30);
		lblNome.setLayoutY(50);
		
		Label lblCPF = new Label();
		lblCPF.setText("CPF");
		lblCPF.setLayoutX(30);
		lblCPF.setLayoutY(100);
		
		Label lblEmail = new Label();
		lblEmail.setText("Email");
		lblEmail.setLayoutX(30);
		lblEmail.setLayoutY(150);
		
		Label lblTelefone = new Label();
		lblTelefone.setText("Telefone");
		lblTelefone.setLayoutX(30);
		lblTelefone.setLayoutY(200);
		
		TextField txtNome = new TextField();
		txtNome.setLayoutX(30);
		txtNome.setLayoutY(70);
		txtNome.setPrefWidth(250);
		
		TextField txtCPF = new TextField();
		txtCPF.setLayoutX(30);
		txtCPF.setLayoutY(120);
		
		TextField txtEmail = new TextField();
		txtEmail.setLayoutX(30);
		txtEmail.setLayoutY(170);
		txtEmail.setPrefWidth(250);
		
		TextField txtTelefone = new TextField();
		txtTelefone.setLayoutX(30);
		txtTelefone.setLayoutY(220);
		
		Button btnEnviar = new Button("Enviar");
		btnEnviar.setLayoutX(90);
		btnEnviar.setLayoutY(300);
		btnEnviar.setPrefWidth(100);
		btnEnviar.setStyle("-fx-padding: 15px");
		btnEnviar.setStyle("-fx-border-color: black");
		
		
		Button btnLimpar = new Button("Limpar");
		btnLimpar.setLayoutX(210);
		btnLimpar.setLayoutY(300);
		btnLimpar.setPrefWidth(100);
		btnLimpar.setStyle("-fx-padding: 15px");
		btnLimpar.setStyle("-fx-border-color: black");
		
		Button btnSair = new Button("Sair");
		btnSair.setLayoutX(150);
		btnSair.setLayoutY(350);
		btnSair.setPrefWidth(100);
		btnSair.setStyle("-fx-padding: 15px");
		btnSair.setStyle("-fx-border-color: black");
		
		
		btnEnviar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				Usuario usuarios = new Usuario();
				usuarios.setNome(txtNome.getText());
				usuarios.setCpf(txtCPF.getText());
				usuarios.setEmail(txtEmail.getText());
				usuarios.setTelefone(txtTelefone.getText());
				
				if(txtNome.getText().isEmpty() || txtCPF.getText().isEmpty()
						|| txtEmail.getText().isEmpty() || txtTelefone.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Os campos não podem estar vazios");
				}else{
					UsuarioDAO dao = new UsuarioDAO();
				dao.adiciona(usuarios);
				JOptionPane.showMessageDialog(null, "Usuário " + txtNome.getText() + " cadastrado com sucesso!");
			}
				
				txtNome.setText("");
				txtCPF.setText("");
				txtEmail.setText("");
				txtTelefone.setText("");
				
				
			}
		});
		
		btnLimpar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				txtNome.setText("");
				txtCPF.setText("");
				txtEmail.setText("");
				txtTelefone.setText("");
			}
		});
		
		
		btnSair.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		
		
		
		
		
		
		root.getChildren().addAll(lblNome,lblCPF,lblEmail,lblTelefone,txtNome,txtCPF,txtEmail,txtTelefone,
				btnEnviar,btnLimpar,btnSair);
		
		
		
		Image imagem = new Image("/imagens/novouser.ico");
		primaryStage.getIcons().add(imagem);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Novo Usuário");
		primaryStage.show();
		
		
		
	}
	
	public static void main(String[]args){
		launch(args);
	}

}
