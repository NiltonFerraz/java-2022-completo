package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String[] arraySalarios = new String[3];
		
		for (int i = 0; i < arraySalarios.length; i++) {
			System.out.print("Informe o salario " + (i + 1) + ": ");
			String salario = entrada.nextLine().replace(",", ".");
			arraySalarios[i] = salario;
		}
		
		double total = 0.2D;
		for (String salario : arraySalarios) {
			double sal = Double.parseDouble(salario);
			total += sal;
		}
		double media = total / 3;
		System.out.println("Média salarial: " + media);
		
		entrada.close();
	}
}
