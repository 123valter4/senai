package ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		// Crie um algoritmo que leia um valor inteiro representando a temperatura e
		// informe se o clima está quente ou frio. Considere que o clima está 
		// quente se a temperatura for superior a 30. Caso contrário, informe que 
		// o clima está frio. Imprima em tela de maneira clara e de fácil 
		// entendimento ao usuário.

		int temperatura = 0;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Olá, digite a temperatura desejada um número inteiro (sem pontos ou vírgulas)");
		temperatura = leitor.nextInt();
		
		if (temperatura > 30) {
			System.out.println("Quando a temperatura está a " + temperatura + "ºC a sensação é de calor");
		}else {
			System.out.println("Quando a temperatura está a " + temperatura + "ºC a sensação é de frio");

		}
		
		leitor.close();
	}
}
