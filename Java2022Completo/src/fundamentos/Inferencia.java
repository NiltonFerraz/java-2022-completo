package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "texto";
		System.out.println(c);
		
		var d = 1;
		System.out.println(d);
		
		//inferencia do java 10
		var e = 123.45;//s� consegue declarar e inicializar a variavel do java 10 na mesma linha, n�o � poss�vel declarar e inicializar na pr�x. linha
		
		var f = 12.2;
		f = 12;
		System.out.println(f);
		
		double x = 3.2;
	}
}
