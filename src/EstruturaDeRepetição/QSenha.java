package Repeticao;
import javax.swing.JOptionPane;

public class QSenha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String user, senha;
		
		user=JOptionPane.showInputDialog(null,"informe o usuario");
		senha=JOptionPane.showInputDialog(null,"informe a senha");
		
		int tentativas = 0;
		for(int tentativva=1; user.equals(senha); tentativas++) {
			JOptionPane.showConfirmDialog(null,  "nao pode ser usuario igual a senha e voce ja tentou isso 2 vezes");
			

		}
	}

}
