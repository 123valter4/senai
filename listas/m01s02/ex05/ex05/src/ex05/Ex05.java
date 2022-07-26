package ex05;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		/* 
		 * Usando a estrutura condicional Switch Case para fazer um menu 
		 * para que o usuário escolha se deseja somar, subtrair, multiplicar,
		 * dividir ou ver o resto de uma divisão. Peça para o usuário informar
		 * dois números (duas variáveis inteiras) e depois escolha através de um 
		 * menu qual a operação que ele deseja realizar. 
		 * Imprima todas as instruções e resultados no terminal de maneira clara
		 */
		
		Scanner leitor = new Scanner (System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		char operacao = '0';
		
		System.out.println("Informe o primeiro número");
		numero1 = leitor.nextInt();
		
		System.out.println("Digite o símbolo da operação que você deseja fazer: "
				+ "\n + para soma"
				+ "\n - para subtração"
				+ "\n * para multiplicação"
				+ "\n / para divisão"
				+ "\n % para resto da divisão ");
		operacao = leitor.next().charAt(0);
		System.out.println("Informe o segundo número");
		numero2 = leitor.nextInt();
		
		switch (operacao) {
		case '+':
			System.out.println(numero1 + "+" + numero2 + " = " + (numero1 + numero2));
			break;
		case '-':
			System.out.println(numero1 + "-" + numero2 + " = " + (numero1 - numero2));
			break;
		case '*':
			System.out.println(numero1 + "*" + numero2 + " = " + (numero1 * numero2));
			break;
		case '/':
			System.out.println(numero1 + "/" + numero2 + " = " + (numero1 / numero2));
			break;
		case '%':
			System.out.println(numero1 + "%" + numero2 + " = " + (numero1 % numero2));
			break;
		default:
		       System.out.println("Operação Inválida!!!"
		       		+ "\n Você deve digitar somente :"
		       		+ "\n + para soma"
					+ "\n - para subtração"
					+ "\n * para multiplicação"
					+ "\n / para divisão"
					+ "\n % para resto da divisão");

			
		}
		
				
	}

}
