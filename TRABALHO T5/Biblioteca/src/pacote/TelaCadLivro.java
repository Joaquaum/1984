package pacote;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadLivro {
	public void TelaLivro(){
		   JFrame frm = new JFrame();
		   Livros livro = new Livros();
		   CadasLivros cad_livro = new CadasLivros();
		   TelaPrincipal home = new TelaPrincipal();
		   
	       
	       JLabel lblTitulo = new JLabel("Titulo:", JLabel.LEFT);	       
	       lblTitulo.setBounds(75, 20, 60, 20);
	       frm.add(lblTitulo);
	       JTextField txtTitulo = new JTextField();
	       txtTitulo.setBounds(115, 20, 110, 20);
	       frm.add(txtTitulo);
	       
	       JLabel lblAutor = new JLabel("Autor:", JLabel.LEFT);	       
	       lblAutor.setBounds(75, 50, 60, 20);
	       frm.add(lblAutor);
	       JTextField txtAutor = new JTextField();
	       txtAutor.setBounds(115, 50, 110, 20);
	       frm.add(txtAutor);
	       
	       JLabel lblISBN = new JLabel("ISBN:", JLabel.LEFT);
	       lblISBN.setBounds(75, 80, 60, 20);
	       frm.add(lblISBN);
	       JTextField txtISBN = new JTextField();
	       txtISBN.setBounds(115, 80, 110, 20);
	       frm.add(txtISBN);
	       
	       JButton btnLogar = new JButton("Cadastrar");
	       btnLogar.setBounds(50, 110, 80, 20);
	       frm.add(btnLogar);
	  
	       JButton btnHome = new JButton("Home");
	       btnHome.setBounds(150, 110, 80, 20);
	       frm.add(btnHome);
	       
	       frm.setSize(300, 200);
	       frm.setLayout(null);
	       frm.setTitle("Cadastro de livros");
	       frm.setLocationRelativeTo(null);
	  
	       frm.setVisible(true);
	      
	       btnLogar.addActionListener(new ActionListener() {
	           @Override
	           public void actionPerformed(ActionEvent e) {
	        	   livro.setTitulo(txtTitulo.getText());
	        	   livro.setAutor(txtAutor.getText());    
	        	   livro.setIsbn(txtISBN.getText());  
	               cad_livro.CadLivro(livro);
	               home.Menu();
	               frm.dispose();
	              
	           }
	          
	       });
	       btnHome.addActionListener(new ActionListener() {
	           @Override
	           public void actionPerformed(ActionEvent e) {
	               home.Menu();
	               frm.dispose();
	              
	           }
	          
	       });
	}

}
