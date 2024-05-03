package pacote;
import java.sql.*;

public class FuncionarioRN {
	public boolean validar(Funcionario funcionario) {
		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String user = "root";
		String password = "";
		
		Connection conn = null;
		PreparedStatement p = null;
        ResultSet rs = null;
		
		try {
			 conn = DriverManager.getConnection(url , user, password);
			 String sql = "select * from funcionario";
	         p = conn.prepareStatement(sql);
	         rs = p.executeQuery();
	         while (rs.next()) {	        	 
	                String email = rs.getString("email");
	                String senha = rs.getString("senha");
	                
	                if(email.equals(funcionario.getEmail()) && senha.equals(funcionario.getSenha())) {
	                	return true;
	                }
	            }
	         return false;
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
		return false;
	}
}
