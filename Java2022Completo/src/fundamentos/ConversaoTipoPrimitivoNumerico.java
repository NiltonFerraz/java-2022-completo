package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; // implicita
		System.out.println(a);
		
		float b = 1.0F;
		float bb = (float) 1.345345; // explicita (CAST)
		System.out.println(b);
		System.out.println(bb);
		
		int c = 4;
		byte d = (byte) c; // explicita (CAST)
		System.out.println(d);
		
		double e = 1;
		int f = (int) e;
		System.out.println(f);
	}

}
