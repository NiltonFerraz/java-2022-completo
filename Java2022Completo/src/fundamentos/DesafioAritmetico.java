package fundamentos;

public class DesafioAritmetico {

	public static void main(String[] args) {
		
		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3); //pow eleva a potência
		
		System.out.println(b);
		
		// Desafio
		int num1 = 6 * (3 + 2);
		int numA = (int) Math.pow(num1, 2);
		int denA = 3 * 2;
		int supA = numA / denA;
		System.out.println(supA);
		
		int num2 = (1 - 5) * (2 - 7);
		int numB = (int) Math.pow(num2, 2);
		int denB = (int) Math.pow(2, 2);
		int supB = numB / denB;
		System.out.println(supB);
		
		int sup1 = supA - supB;
		int sup2 = (int) Math.pow(sup1, 3);
		int inf = (int) Math.pow(10, 3);
		
		int result = sup2 / inf;
		
		System.out.println(result);
		
		
		
		
	}
}
