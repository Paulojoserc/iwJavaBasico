package programacaoEstruturada.colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterseccaoDeLista {
	public static void main(String[] args) {

		List<String> palavra01 = Arrays.asList("julia", "lucas", "sara", "amanda", "pedro");

		List<String> palavra02 = Arrays.asList("julia", "jose", "adriano", "alberto", "pedro");

		List<String> palavra03 = new ArrayList<>();
		List<String> palavra04 = new ArrayList<>();

		// palavra03 = Stream.concat(palavra01.stream(), palavra02.stream()).collect(Collectors.toList());

		for (String interseccao : palavra02) {
			if (!palavra01.contains(interseccao))
				palavra03.add(interseccao);
		}
		
		
		for (String uniao : palavra01) {
			if (!palavra04.contains(uniao)) {
				palavra04.add(uniao);
			}
		}
		for (String uniao : palavra02) {
			if (!palavra01.contains(uniao)) {
				palavra04.add(uniao);
			}
		}
		palavra03.sort(null);
		System.out.println(palavra03);
		palavra04.sort(null);
		System.out.println(palavra04);
	}
}