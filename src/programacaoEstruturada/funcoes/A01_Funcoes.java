package programacaoEstruturada.funcoes;

public class A01_Funcoes {
	public static void main(String[] args) {
		System.out.println(quadrado(14));
		quadradoSemRetorno(21);
		oiMundo();
		System.out.println();
		
		System.out.println(fatorial(6));
		System.out.println(fatRecursivo(6));
	}

	public static double quadrado(int numero) {
		return Math.pow(numero, 2);
	}
	public static void quadradoSemRetorno(int numero) {
		System.out.println(Math.pow(numero, 2));
	}
	public static void oiMundo() {
		System.out.println("Olá Mundo");
	}
	
	public static int fatorial(int numero) {
		int fat = 1;
		
		while(numero>=1) {
			fat*= numero;
			numero--;
		}
		return fat;
	}
	public static int fatRecursivo( int numero) {
		if (numero == 1) return 1;
		else return numero * fatRecursivo(numero-1);
	}
}
