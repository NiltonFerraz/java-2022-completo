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
		System.out.printf("\nSalário: %.2f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "João");
		
		//Scanner é para entrada do mouse, teclado etc
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
		
		//lembrar de fechar o Scanner para não consumir memória
//		entrada.close();
		
		//Exemplo nextInt() não pula linha, use nextLine após
		Scanner teclado = new Scanner(System.in);
		 
		System.out.println("Qual a sua idade?");
		int idade2 = teclado.nextInt();
		teclado.nextLine(); //lê o "\\n" que o teclado.nextInt() deixa para trás.
		System.out.println("Qual o seu nome?");
		String nome2 = teclado.nextLine();
		System.out.println("Qual o seu sobrenome?");
		String sobrenome2 = teclado.nextLine();
		 
		teclado.close();
	}
}
