package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {

		double media = 4.9;
		String resultadoRecuperacao = media >= 5.0 ?
				"em recuperação." : "reprovado.";
		String resultado = media >= 7.0 ? 
				"aprovado." : resultadoRecuperacao;
		System.out.println("O aluno está " + resultado);
		
		double media2 = 7.9;
		String result = media2 >= 7.0 ? "aprovado." : media2 >= 5.0 ? "em recuperação." : "reprovado.";
		System.out.println("O aluno está " + result);

		
		double nota = 9.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;		
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resul = temDesconto ? "Sim." : "Não.";
		
		System.out.printf("Tem desconto? %s", resul);

	}
}
