package pacote;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CadasLivros {
	public void CadLivro(Livros livro) {
		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String user = "root";
		String password = "";
		Connection conn = null;
		PreparedStatement p = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			
			p = conn.prepareStatement("INSERT INTO livro (titulo, autor, isbn) VALUES(?,?,?)");
			p.setString(1, livro.getTitulo());
			p.setString(2, livro.getAutor());
			p.setString(3,  livro.getIsbn());
			p.executeUpdate();
			
		}
        catch(Exception e){
        	e.printStackTrace();
        }
	}

}
