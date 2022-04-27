package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		/* se os dois trabalhos derem certo irá ao shopping
		 * comprar tv de 50 pol
		 * se apenas um der certo, tv 32
		 * comprando uma tv ou outra
		 * irá tomar sorvete
		 * não irá acontecer se nenhum dos trabalhos derem certo
		 */
		
		boolean trab1 = !true;
		boolean trab2 = false;
		
		boolean comprouTV50 = trab1 && trab2;
		boolean comprouTV32 = trab1 ^ trab2;
		boolean comprouSorvete = trab1 || trab2;
		
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou TV 32\"? " + comprouTV32);
		System.out.println("Tomou sorvete\"? " + comprouSorvete);
	
		// Operador Unário!
		System.out.println("Mais saudável? " + !comprouSorvete);
	}
}
