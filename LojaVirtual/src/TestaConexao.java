import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection connection = criaConexao.recuperaConexao();
		
		System.out.println("Fechando a Conex�o");
		
		connection.close();
		
	}
}
