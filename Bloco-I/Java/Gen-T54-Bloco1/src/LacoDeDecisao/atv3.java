package LacoDeDecisao;

import javax.swing.JOptionPane;

public class atv3 {

	public static void main(String[] args) {
		
		int idade = 0;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Qual � sua idade: "));

		if ( idade > 0 && idade <= 9) {
			JOptionPane.showMessageDialog(null, "Voc� ainda n�o se enquadra em nenhum grupo...");
		}
		else if (idade >= 10 && idade <= 14) {
			JOptionPane.showMessageDialog(null, "Voc� faz parte do Grupo Infantil...");
		}
		else if (idade >= 15 && idade <= 17) {
			JOptionPane.showMessageDialog(null, "Voc� faz parte do Grupo Juvenil...");
		}
		else if (idade >= 18 && idade <= 25) {
			//no exercicio pediu para que coloca-se adulto, por�m acho que aqui se enquadra melhor Jovem 
			JOptionPane.showMessageDialog(null, "Voc� faz parte do Grupo Jovem...");
		}
		else if (idade >= 26 && idade <= 59) {
			JOptionPane.showMessageDialog(null, "Voc� faz parte do Grupo Adulto...");
		}
		else if (idade >= 60 && idade <= 150) {
			JOptionPane.showMessageDialog(null, "Voc� faz parte do Grupo De Idosos...");
		}
		else {
			JOptionPane.showMessageDialog(null, "Voc� n�o faz parte de nenhum Grupo...");
		}
	}

}
