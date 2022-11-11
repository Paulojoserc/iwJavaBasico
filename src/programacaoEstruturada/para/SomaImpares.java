package programacaoEstruturada.para;

public class SomaImpares {
public static void main(String[] args) {
	int somador =0;
	
	for (int i = 1; i < 100; i++) {
		if(i%2!=0) {
		somador+=i;	
		}
	}
	System.out.println(somador);
}
}
