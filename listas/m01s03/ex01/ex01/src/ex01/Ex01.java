package ex01;

public class Ex01 {
	
	public static void main(String[] args) {
		/* Escreva um código que realize a contagem de todos os 
		 * números que são múltiplos de 3 entre 0 e 300. 
		 * Exiba quantos números foram contados ao final do programa.
		 */
		
		int multiplos = 0;
				
		for (int i = 3; i <= 300; i = i+3) {
			multiplos = multiplos +1;
		}
		System.out.println("entre 0 e 300 existem " + multiplos + " múltiplos de 3");
	}

}
