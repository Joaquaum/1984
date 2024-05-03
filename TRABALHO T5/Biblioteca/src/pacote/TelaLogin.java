package pacote;
import javax.swing.*;
import java.awt.event.*;
public class TelaLogin {
	public void Telalogin() {
       Funcionario funcionario = new Funcionario();
       FuncionarioRN val = new FuncionarioRN();
       TelaCadLivro tela_livro = new TelaCadLivro();
       TelaPrincipal home = new TelaPrincipal();
       
       JFrame frm = new JFrame();
       
       
       JLabel lblEmail = new JLabel("Email:", JLabel.LEFT);
       lblEmail.setBounds(80, 20, 60, 20);
       frm.add(lblEmail);
      
       JTextField txtEmail = new JTextField();
       txtEmail.setBounds(120, 20, 110, 20);
       frm.add(txtEmail);
       JLabel lblSenha = new JLabel("Senha:", JLabel.LEFT);
       lblSenha.setBounds(80, 50, 60, 20);
       frm.add(lblSenha);
    
       JPasswordField txtSenha = new JPasswordField();
       txtSenha.setBounds(120, 50, 110, 20);
       frm.add(txtSenha);
       JButton btnLogar = new JButton("Logar");
       btnLogar.setBounds(50, 80, 80, 20);
       frm.add(btnLogar);
  
       JButton btnHome = new JButton("Home");
       btnHome.setBounds(150, 80, 80, 20);
       frm.add(btnHome);
       frm.setSize(300, 150);
       frm.setLayout(null);
       frm.setTitle("Tela login");
       frm.setLocationRelativeTo(null);
  
       frm.setVisible(true);
      
       btnLogar.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {    
               String email = txtEmail.getText();           
               String senha = new String(txtSenha.getPassword());              
               frm.dispose();
               funcionario.setEmail(email);
               funcionario.setSenha(senha);
               if(val.validar(funcionario)==true) {
            	   tela_livro.TelaLivro();
               }
               else {
            	   JOptionPane.showMessageDialog(frm, "Email ou senha incorretos!", "Erro de Login", JOptionPane.ERROR_MESSAGE);
            	   home.Menu();
               }
              
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
