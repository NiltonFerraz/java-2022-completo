package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		// byte
		Byte b = 100;
		Short s = 1000;
//		Integer i = 10000; //tipo primitivo é o int 
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		
//		Integer ii = Integer.parseInt("1000");
		System.out.println(s.toString());
		Integer ii = Integer.parseInt(entrada.next());
		System.out.println(ii * 3);
		System.out.println(l * 3);
		
		entrada.close();
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Character c = '#'; //char
		System.out.println(c + "...");
	}

}
