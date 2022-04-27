package arrays;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		System.out.println("Quantas notas você quer informar: ");		
		Scanner tamanhoArray = new Scanner(System.in);
		int a = tamanhoArray.nextInt();
		double[] array = new double [a];
		
		int j = 1;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Diga a nota " + j + ":");
			Scanner nota = new Scanner(System.in);
			array[i] = nota.nextDouble();
			j++;
		} 
			
//		for (double d : array) {
//			System.out.println(d);
//		}		
		
		double total = 0;
		for (double d : array) {
			total += d;
			
		}
		System.out.println("Média do Aluno: " + total / array.length);
	}

	
}
