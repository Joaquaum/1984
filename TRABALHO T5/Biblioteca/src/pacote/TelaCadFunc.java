package pacote;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class TelaCadFunc {
	public void TeladoCadastro() {
		   Funcionario funcionario = new Funcionario();
	       CadasFunc cadastro = new CadasFunc();
	       TelaPrincipal home = new TelaPrincipal();
		   JFrame frm = new JFrame();
	       
	       
	       JLabel lblNome = new JLabel("Nome:", JLabel.LEFT);	       
	       lblNome.setBounds(75, 20, 60, 20);
	       frm.add(lblNome);
	       JTextField txtNome = new JTextField();
	       txtNome.setBounds(115, 20, 110, 20);
	       frm.add(txtNome);
	       
	       JLabel lblEmail = new JLabel("Email:", JLabel.LEFT);	       
	       lblEmail.setBounds(75, 50, 60, 20);
	       frm.add(lblEmail);
	       JTextField txtEmail = new JTextField();
	       txtEmail.setBounds(115, 50, 110, 20);
	       frm.add(txtEmail);
	       
	       JLabel lblSenha = new JLabel("Senha:", JLabel.LEFT);
	       lblSenha.setBounds(75, 80, 60, 20);
	       frm.add(lblSenha);
	       JPasswordField txtSenha = new JPasswordField();
	       txtSenha.setBounds(115, 80, 110, 20);
	       frm.add(txtSenha);
	       
	       JButton btnLogar = new JButton("Cadastrar");
	       btnLogar.setBounds(50, 110, 80, 20);
	       frm.add(btnLogar);
	  
	       JButton btnHome = new JButton("Home");
	       btnHome.setBounds(150, 110, 80, 20);
	       frm.add(btnHome);
	       
	       frm.setSize(300, 200);
	       frm.setLayout(null);
	       frm.setTitle("Tela cadastro");
	       frm.setLocationRelativeTo(null);
	  
	       frm.setVisible(true);
	      
	       btnLogar.addActionListener(new ActionListener() {
	           @Override
	           public void actionPerformed(ActionEvent e) {   
	        	   funcionario.setNome(txtNome.getText());
	               funcionario.setEmail(txtEmail.getText());           
	               String senha = new String(txtSenha.getPassword());
	               funcionario.setSenha(senha);
	               cadastro.cadastro(funcionario);
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
	

