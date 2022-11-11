package programacaoEstruturada.enquanto;

import java.util.Scanner;

public class E02_Tabuada {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int cont = 0;
	
	System.out.println("Digite um número");
	int num = sc.nextInt();
	
	while(cont<=10) {
		System.out.println(num+ " x "+cont+" = "+ (num*cont));
		cont++;
	}
	
	sc.close();
}
}
