package pacote;

import java.sql.*;



public class CadasFunc {
	public void cadastro(Funcionario funcionario) {
		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String user = "root";
		String password = "";
		
		Connection conn = null;
		PreparedStatement p = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			
			p = conn.prepareStatement("INSERT INTO funcionario (email, senha, nome) VALUES(?,?,?)");
			p.setString(1, funcionario.getEmail());
			p.setString(2, funcionario.getSenha());
			p.setString(3,  funcionario.getNome());
			p.executeUpdate();
			
		}
        catch(Exception e){
        	e.printStackTrace();
        }
	}

}
