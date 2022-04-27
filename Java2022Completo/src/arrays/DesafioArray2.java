package arrays;

import java.util.Arrays;
import java.util.Scanner;

import fundamentos.NotacaoPonto;

public class DesafioArray2 {

	public static void main(String[] args) {
//		int Array[] = {1,2,3,4,5};
//        System.out.println(Arrays.toString(Array));
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite quanta notas irá precisar: ");
		int tamanhoArray = entrada.nextInt();
		
		double[] arrayNotas = new double[tamanhoArray];
		
		int j = 1;
		for (int i = 0; i < arrayNotas.length; i++) {
			System.out.println("Digite a nota " + j);
			double nota = entrada.nextDouble();
			arrayNotas[i] = nota;
			j++;
		}
		//Imprime o array [7.0, 8.0, 9.0]
		System.out.println(Arrays.toString(arrayNotas));
		
		double total = 0;
		double media = 0;
		for (double notas : arrayNotas) {
			total += notas;	
			media = total / arrayNotas.length;
		}
		System.out.println("Média: " + media );
		entrada.close();
	}
	
}
