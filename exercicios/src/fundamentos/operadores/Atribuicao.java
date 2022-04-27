package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 18;
		int b = a;
		int c = a + b; //36
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		c += b;// c = c + b;
		System.out.println(c);//54
		c -= a;// c = c - a;
		System.out.println(c);//36
		c *= b;// c = c * b;
		System.out.println(c);//648
		c /= a;// c = c / a;
		System.out.println(c);//36
		c %= a;// c = c % a; 0 ou 1 (zero é par, 1 é ímpar)
		System.out.println(c);//0 par
		
		
	}
}
