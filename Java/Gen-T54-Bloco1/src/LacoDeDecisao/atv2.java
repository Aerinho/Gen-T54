package LacoDeDecisao;

import javax.swing.JOptionPane;

public class atv2 {

	public static void main(String[] args) {
		
		int num1, num2, num3, temp;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1� n�mero inteiro: "));
		
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2� n�mero inteiro: "));
		
		num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3� n�mero inteiro: "));
		
		if(num2 > num1){
	        temp = num1;
	        num1 = num2;
	        num2 = temp;
	    }

	    if(num3 > num1){
	        temp = num1;
	        num1 = num3;
	        num3 = temp;
	    }

	    if(num3 > num2){
	        temp = num2;
	        num2 = num3;
	        num3 = temp;
	    }
		
			JOptionPane.showMessageDialog(null, "A ordem crescente dos n�meros � " + num3 + num2 + num1 + "...");
		
	}

}