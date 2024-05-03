package pacote;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class TelaPrincipal {
	public void Menu() {
		TelaLogin telalogin = new TelaLogin();
		TelaCadFunc telafun = new TelaCadFunc();
		JFrame frm = new JFrame();
		
		JButton btnCad_Func = new JButton("Cadastrar Funcionario");
	    btnCad_Func.setBounds(42, 20, 200, 20);
	    frm.add(btnCad_Func);
		
	    JButton btnCad_Livro = new JButton("Cadastrar Livros");
	    btnCad_Livro.setBounds(42, 50, 200, 20);
	    frm.add(btnCad_Livro);
	  	    
	    JButton btnExit = new JButton("Exit");
	    btnExit.setBounds(42, 80, 200, 20);
	    frm.add(btnExit);
	    
	    frm.setSize(300, 150);
	    frm.setLayout(null);
	    frm.setTitle("Biblioteca");
	    frm.setLocationRelativeTo(null);
	  
	    frm.setVisible(true);
	      
	    btnCad_Livro.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	telalogin.Telalogin();            
	            frm.dispose();
	        }
	          
	    });
	    btnCad_Func.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	telafun.TeladoCadastro();            
	            frm.dispose();
	        }
	          
	    });
	    btnExit.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {           
	            frm.dispose();
	        } 
	    });
}
}
