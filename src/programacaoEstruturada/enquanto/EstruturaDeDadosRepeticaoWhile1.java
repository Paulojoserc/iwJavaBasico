package programacaoEstruturada.enquanto;

import java.util.Scanner;

public class EstruturaDeDadosRepeticaoWhile1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int contador =1, somador=0;
	
	
	while(contador<=100) {
		somador+=contador;
		
		contador++;
	}
	System.out.println(somador);
	sc.close();
}
}

