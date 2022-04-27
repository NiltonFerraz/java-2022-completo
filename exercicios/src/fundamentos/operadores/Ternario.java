package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {

		double media = 4.9;
		String resultadoRecuperacao = media >= 5.0 ?
				"em recupera��o." : "reprovado.";
		String resultado = media >= 7.0 ? 
				"aprovado." : resultadoRecuperacao;
		System.out.println("O aluno est� " + resultado);
		
		double media2 = 7.9;
		String result = media2 >= 7.0 ? "aprovado." : media2 >= 5.0 ? "em recupera��o." : "reprovado.";
		System.out.println("O aluno est� " + result);

		
		double nota = 9.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;		
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resul = temDesconto ? "Sim." : "N�o.";
		
		System.out.printf("Tem desconto? %s", resul);

	}
}
