package ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		double temperatura = 0;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite a temperatura desejada");
		temperatura = leitor.nextDouble();
		
		if (temperatura > 35) {
			System.out.println(temperatura + "ºC - É praticamente estágio pro inferno. Está muito quente!!!");
		}else if (temperatura > 24) {
			System.out.println(temperatura + "ºC - Pra quem curte praia, esse é a melhor temperatura! Está quente.");
		}else if (temperatura > 19) {
			System.out.println(temperatura + "ºC - A temperatura está agradável, ninguém pode reclamar!");
		}else if (temperatura > 18) {
			System.out.println(temperatura + "ºC - Pra gente é frio, mas nessa temperatura os russos estão indo pra praia");
		}else if (temperatura > 10){
			System.out.println(temperatura + "ºC - Tá feliz agora, amante do inveno???");
		}
		leitor.close();
	}
}
