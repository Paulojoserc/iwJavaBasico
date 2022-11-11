package programacaoEstruturada.vetor;

public class VetorUniaoString {
	public static void main(String[] args) {
		String palavra01[] = { "julia", "lucas", "sara", "amanda", "pedro" };
		String palavra02[] = { "julia", "jose", "adriano", "alberto", "pedro" };
		String palavra03[] = new String[10];
		

		for (int i = 0; i < palavra01.length; i++) {
			for (int j = 0; j < palavra02.length; j++) {
				if (palavra01[i].compareTo(palavra02[j]) != 0) {
					palavra03[i] = palavra01[i];
				
					if (palavra03[i].compareTo(palavra02[j]) != 0) {
						palavra03[i] = palavra02[i];
						
					}
				}

			}
		}
		for (String nome : palavra03) {
			if(nome!=null) {
				System.out.println(nome);
			}

		}

	}
}
