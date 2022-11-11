package programacaoEstruturada.vetor;

public class Vetor {
public static void main(String[] args) {
	int pares[] = {2,4,6,8,10,12,14};
	
	for (int i = 0; i < pares.length; i++) {
		System.out.print(pares[i]+" ");
	}
	
	int impares[] = new int[7];
	System.out.println();
	impares[0] =1 ;
	impares[1] =3 ;
	impares[2] =5 ;
	impares[3] =7 ;
	impares[4] =9 ;
	impares[5] =11 ;
	impares[6] =13 ;
	
	System.out.println(impares[2]);
	System.out.println(pares.length);
	int clonePares[] = pares.clone();
	System.out.println(pares.equals(clonePares));
	for (int numero : clonePares) {
		System.out.print(numero+" ");
	}
	
}
}
