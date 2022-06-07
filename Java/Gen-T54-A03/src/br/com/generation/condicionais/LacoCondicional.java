package br.com.generation.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class LacoCondicional {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a 1� nota do aluno: ");
		nota1 = entrada.nextDouble();
		
		System.out.println("Digite a 2� nota do aluno: ");
		nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if (media >= 9.0) {
			System.out.println("Aluno aprovado com perfei��o!\n M�dia: " + media);
		}
		else if (media >= 6.0 && media < 9.0) {
			System.out.println("Aluno aprovado!\n M�dia: " + media);
		}
		else if (media > 3.0 && media < 6.0) {
			System.out.println("Aluno de recupera��o!\n M�dia: " + media);
		}
		else {
			System.out.println("Aluno reprovado!\n M�dia: " + media);
		}

	}

}
