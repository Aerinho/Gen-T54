package LacoDeRepeticao;

import javax.swing.JOptionPane;

public class atv2 {

	public static void main(String[] args) {

		int par = 0, impar = 0;
		
		 for (int contador = 1; contador <= 10; contador++) {
			 
			 int num = Integer.parseInt(JOptionPane.showInputDialog("Digite " + contador + "� n�mero: "));
			 
			 if (num % 2 == 0) {
				 
				 par++;
				 System.out.println(num + ": � Par!");
			 }
			 else {
				 
				 impar++;
				 System.out.println(num + ": � �mpar!");
			 }
			 
		 }
		 
		 System.out.println("Total de " + par + " Pares, e " + impar + " �mpares...");
		
	}

}
