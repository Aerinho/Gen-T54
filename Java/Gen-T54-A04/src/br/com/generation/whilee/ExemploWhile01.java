package br.com.generation.whilee;

public class ExemploWhile01 {

	public static void main(String[] args) throws InterruptedException {

		/*int contador = 10;
		
		while (contador >= 0) {
			
			System.out.println("Lan�ando foguete em: " + contador);
			
			contador --;
			Thread.sleep(1000);
		}*/
		
		int contador = 0;

		while (contador <= 10) {
			
			System.out.println("Repeti��o: " + contador);
			
			contador ++;
			Thread.sleep(1000);
		}

	}

}
