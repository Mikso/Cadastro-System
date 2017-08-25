/**
 * 
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import factory.ConnectionFactory;
import modelo.Usuario;

/**
 * @author Bruno
 *
 */
public class UsuarioDAO {
	private Connection connection;
	Long id;
	String nome;
	String cpf;
	String email;
	String telefone;
	
	public UsuarioDAO(){
		this.connection = new ConnectionFactory().getConnection();
	}
		
	public void adiciona(Usuario usuario){
		String sql = "INSERT INTO usuario(nome,cpf,email,telefone) VALUES(?,?,?,?)";
		
		try{
			PreparedStatement stm = connection.prepareStatement(sql);
			stm.setString(1, usuario.getNome());
			stm.setString(2, usuario.getCpf());
			stm.setString(3, usuario.getEmail());
			stm.setString(4, usuario.getTelefone());
			stm.execute();
			stm.close();
		}catch(SQLException u){
			throw new RuntimeException(u);
		}
		
	}
}
