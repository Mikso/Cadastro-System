/**
 * 
 */
package factory;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Bruno
 *
 */
public class TestaConexao {
	public static void main(String[]args) throws SQLException{
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conex�o Aberta!");
		connection.close();
	}
}
