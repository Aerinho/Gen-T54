package LacoDeDecisao;

import javax.swing.JOptionPane;

public class atv1 {

	public static void main(String[] args) {
		
		int a, b, c, maior;
		
		maior = 0;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1� n�mero inteiro: "));
		
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2� n�mero inteiro: "));
		
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3� n�mero inteiro: "));
		
		if (a > b) {
			maior = a;
		}
		else {
			maior = b;
		}
		
		if (c > maior) {
			maior = c;
			JOptionPane.showMessageDialog(null, "O maior n�mero � " + maior + "...");
		}
		else {
			JOptionPane.showMessageDialog(null, "O maior n�mero � " + maior + "...");
		}
	}

}
