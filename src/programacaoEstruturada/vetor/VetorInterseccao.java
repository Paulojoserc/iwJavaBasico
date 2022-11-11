package programacaoEstruturada.vetor;

public class VetorInterseccao {
public static void main(String[] args) {
	int conjuntoA[] = {1, 2, 3, 4, 5,};
	int conjuntoB[] = {2,4,6,8,10};
	int conjuntoC[] = new int[5];	
	int contador =0;
	
	for (int A : conjuntoA) {
		for (int B : conjuntoB) {
			if (B==A) {
				conjuntoC[contador]=A;
				contador++;
			}
		}
	}
	for (int numeros : conjuntoC) {
		if(numeros>0) {
		System.out.println("conjuntoC: tem " + (numeros));	
	}
	}
}
}
