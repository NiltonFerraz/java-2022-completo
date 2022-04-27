package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		final double Ajuste = 32;
		final double Fator = (5.0/9.0);
		
		double fahrenheit = 86;		
		double celsius = (fahrenheit - Ajuste) * Fator;
		System.out.println("O resultado é : " + celsius + "°C.");
		
		fahrenheit = 0;		
		celsius = (fahrenheit - Ajuste) * Fator;
		System.out.println("O resultado é : " + celsius + "°C.");
		
		
//		System.out.println(5/9.0);
	}
}
