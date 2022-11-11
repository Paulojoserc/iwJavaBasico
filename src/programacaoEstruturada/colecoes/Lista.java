package programacaoEstruturada.colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
public static void main(String[] args) {
	List<Integer> numeros =  new ArrayList<>();
	
	numeros.add(5);
	numeros.add(2);
	numeros.add(9);
	numeros.add(4);
	numeros.sort((a,b) -> a-b);
	for (Integer numero : numeros) {
		System.out.println(numero);
	}
	System.out.println();
}
}
