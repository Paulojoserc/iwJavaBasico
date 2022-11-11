package programacaoEstruturada.colecoes;

import java.util.LinkedList;
import java.util.Scanner;

public class ExFila {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	LinkedList<Integer> listaSequencial = new LinkedList<>();
	
	listaSequencial.addLast(10);
	listaSequencial.addLast(20);
	listaSequencial.addLast(30);
	listaSequencial.addLast(40);
	listaSequencial.addLast(50);
	
	for(Integer numero : listaSequencial) {
		System.out.println(numero);
	}
	
	listaSequencial.addLast(14);
	System.out.println("Digite um número");
	int numero = sc.nextInt();
	listaSequencial.addFirst(numero);
	
	for(Integer numero1 : listaSequencial) {
		System.out.println(numero1);
	}
	
	System.out.println("Digite um número");
	numero = sc.nextInt();
	
	if(listaSequencial.contains(numero)) {
		System.out.println(listaSequencial.indexOf(numero));
	}else {
		System.err.println("O número não costa na lista");
	}
	sc.close();
}
}
