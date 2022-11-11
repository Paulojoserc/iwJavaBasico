package programacaoEstruturada;

import java.util.Scanner;

public class A01_Revisao02 {
public static void main(String[] args) {
	//elevar um numero ao quadrado
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um número qualquer");
	int numero = sc.nextInt();
	
	//int quadrado = (int) Math.pow(numero, 2);
	int raizQuadrada = (int) Math.sqrt(numero);
	int raizCubica = (int) Math.cbrt(numero);
	
	
	System.out.println(raizQuadrada);
	System.out.println(raizCubica);
	
	sc.close();
}
}
