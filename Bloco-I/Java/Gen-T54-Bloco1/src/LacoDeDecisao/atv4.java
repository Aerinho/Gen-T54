package LacoDeDecisao;

import javax.swing.JOptionPane;

import java.lang.Math;

public class atv4 {

	public static void main(String[] args) {
		
		int num = 0;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));

		if (num % 2 == 0) {
			JOptionPane.showMessageDialog(null, + num + " � Par, e sua Raiz quadrada �: " + Math.sqrt(num));
		}
		else {
			JOptionPane.showMessageDialog(null, +num + " � �mpar, e Sua eleva��o ao quadrado �: " + Math.pow(num, num));
		}
	}

}
