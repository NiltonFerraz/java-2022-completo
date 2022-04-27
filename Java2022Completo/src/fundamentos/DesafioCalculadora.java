package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// + - * / %

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		double valor1 = entrada.nextDouble();
		System.out.println("Digite o segundo valor: ");
		double valor2 = entrada.nextDouble();
		System.out.println("Digite o operador: ");
		String op = entrada.next();

		double calc = "+".equals(op) ? valor1 + valor2 : 0;
		calc = "-".equals(op) ? valor1 - valor2 : calc;
		calc = "*".equals(op) ? valor1 * valor2 : calc;
		calc = "/".equals(op) ? valor1 / valor2 : calc;
		calc = "%".equals(op) ? valor1 % valor2 : calc;
		
		System.out.printf("%.2f %s %.2f = %.2f", valor1, op, valor2, calc);
		
		entrada.close();
	}
}
