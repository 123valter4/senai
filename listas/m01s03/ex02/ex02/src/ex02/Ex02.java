package ex02;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/* Escreva um código que gere um número aleatório entre 0 e 10,
		 * e peça para um usuário tentar acertar o número até que ele acerte.
		 */
		
		int numeroAleatorio =0;
		int numeroDigitado = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		
		Random aleatorio = new Random();
		
		numeroAleatorio = aleatorio.nextInt(11);
		
		do {
			System.out.println("Adivinhe um número de 1 a 10");
			numeroDigitado = leitor.nextInt();	
			
		}while (numeroDigitado != numeroAleatorio);
		
		System.out.println("Acertou! o número aleatório era " + numeroAleatorio);
		
		;
	}
}
