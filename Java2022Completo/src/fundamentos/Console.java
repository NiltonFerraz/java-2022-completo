package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");

		/* %d - representar inteiros
		 * %f - representa floats
		 * %2f - doubles
		 * %b - booleanos
		 * %c - char
		 * %s - string
		*/
		System.out.printf("Megasena: %d %d %d %d %d %d", 
				1, 2, 3, 4, 5, 6);
		System.out.printf("\nSal�rio: %.2f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "Jo�o");
		
		//Scanner � para entrada do mouse, teclado etc
//		Scanner entrada = new Scanner(System.in);
//		
//		System.out.print("Digite o seu nome: ");
//		String nome = entrada.nextLine();
//
//		System.out.print("Digite o seu sobrenome: ");
//		String sobrenome = entrada.nextLine();
//
//		System.out.print("Digite a sua idade: ");
//		int idade = entrada.nextInt();
//		
//		System.out.println("\n\nNome = " + nome + " " + sobrenome);
//		
//		System.out.printf("%s %s tem %d anos.",
//				nome, sobrenome, idade);
		
		//lembrar de fechar o Scanner para n�o consumir mem�ria
//		entrada.close();
		
		//Exemplo nextInt() n�o pula linha, use nextLine ap�s
		Scanner teclado = new Scanner(System.in);
		 
		System.out.println("Qual a sua idade?");
		int idade2 = teclado.nextInt();
		teclado.nextLine(); //l� o "\\n" que o teclado.nextInt() deixa para tr�s.
		System.out.println("Qual o seu nome?");
		String nome2 = teclado.nextLine();
		System.out.println("Qual o seu sobrenome?");
		String sobrenome2 = teclado.nextLine();
		 
		teclado.close();
	}
}
