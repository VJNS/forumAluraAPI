import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComParametros {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory cf = new ConnectionFactory();
		Connection connection = cf.recuperaConexao();
		connection.setAutoCommit(false);

		try {
			PreparedStatement stm = connection.prepareStatement("INSERT INTO PRODUTO(NOME, DESCRICAO) VALUES (?, ?)",
					Statement.RETURN_GENERATED_KEYS);

			adicionarVariavel("Smart TV Samsung 43", "Smart TV 4K Full HD", stm);
			adicionarVariavel("Fone de Ouvido", "Fone de Ouvido Beats By Dre", stm);
			
			connection.commit();
			
			stm.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Rollback executado!");
			connection.rollback();
		}

		connection.close();

	}

	private static void adicionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
		
		stm.setString(1, nome);
		stm.setString(2, descricao);
		
		stm.execute();

		if(nome.equals("Fone de Ouvido")) {
			throw new RuntimeException("Fone de Ouvido não é mais vendido neste site!");		
		}
		
		ResultSet rst = stm.getGeneratedKeys();

		while (rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("O id gerado é o " + id);
		}
	}

}
