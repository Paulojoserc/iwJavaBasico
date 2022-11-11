package programacaoEstruturada.vetor;

public class VetorOrdemAlfabetica {
public static void main(String[] args) {
	String pessoas[] = {"Zuleide", "Ana", "Bruno", "Alicia","Carlos", "Livia", "Jessica"};
	
	for (int i = 0; i < pessoas.length; i++) {
	String temp="";
	for (int j = i+1; j < pessoas.length; j++) {
		if(pessoas[j].compareTo(pessoas[i])<0) {
			temp = pessoas[i];
			pessoas[i] = pessoas[j];
			pessoas[j] = temp;
		}
		
	}
	}
	for (String pessoa : pessoas) {
		System.out.println(pessoa);
	}
}
}
