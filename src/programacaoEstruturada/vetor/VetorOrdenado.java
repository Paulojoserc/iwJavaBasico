package programacaoEstruturada.vetor;

public class VetorOrdenado {
	public static void main(String[] args) {
		int numeros[] = { 10, 5, 10, 89, 54, 10, 5, 36, 65, 47, 36, 10 };

		System.out.println("Crescente");
		for (int i = 0; i < numeros.length - 1; i++) {
			int temp = 0;
			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[j] < numeros[i]) {
					temp = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = temp;
				}
			}
		}
		for (int crescente : numeros) {
			
			System.out.println(crescente);
		}
		System.out.println("Decrescente");
		for (int i = 0; i < numeros.length - 1; i++) {
			int temp = 0;
			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[j] > numeros[i]) {
					temp = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = temp;
				}
			}
		}
		for (int decrescente : numeros) {
		
			System.out.println(decrescente);
		}
	}
}
