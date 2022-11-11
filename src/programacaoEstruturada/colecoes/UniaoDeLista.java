package programacaoEstruturada.colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniaoDeLista {
	public static void main(String[] args) {
		
	
	List<String> palavra01 = Arrays.asList("julia", "lucas", "sara", "amanda", "pedro");

	List<String> palavra02 = Arrays.asList("julia", "jose", "adriano", "alberto", "pedro");

	List<String> palavra03 = new ArrayList<>();

	for(
	String pessoa:palavra01) {
	
		for (String pessoa02 : palavra02) {
			if (pessoa.contains(pessoa02)) {
				palavra03.add(pessoa);
			}
		}
	}

	System.out.println(palavra03);
}}