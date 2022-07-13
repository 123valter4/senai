import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
        //	[M1S01] Ex 6 - Calcule a idade com base no ano
		//	Crie um programa em Java que faça 2 perguntas ao usuário: 
		//	primeiro, pergunte o ano de nascimento. 
		//	Depois, pergunte o ano atual. 
		//	Em seguida, exiba na tela o texto “Sua idade é x ou y”, 
		//	onde x é a idade do usuário caso ele já tenha feito aniversário neste ano,
		//	e y é a idade caso ele ainda não tenha aniversariado no ano corrente.

		int anoAtual;
		int anoNascimento;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual é seu ano de nascimento?");
		anoNascimento = leitor.nextInt();
		
		System.out.println("Qual o ano atual?");
		anoAtual = leitor.nextInt();
		
		System.out.println("Sua idade é " + (anoAtual - anoNascimento) + " ou " + (anoAtual - anoNascimento -1));
		leitor.close();
	}
}
