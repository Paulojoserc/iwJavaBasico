package programacaoEstruturada.enquanto;

import java.util.Scanner;

public class EstruturaDeDadosRepeticaoWhile2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int contador =1;
	double somador=0;
	
	
	while(contador<=100) {
		somador+=1/(double)contador;
		
		contador++;
		System.out.println(somador);
	}
	System.out.println(somador);
	sc.close();
}
}

