package programacaoEstruturada.revisao;

import java.util.Scanner;

public class Ex14_If {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	final double gasolina = 1.80;
	final double alcool = 1.00;
	System.out.println("Digite o tipo de combust�vel A para �lcool e G para gasolina");
	char tipoDeCombustivel = sc.next().charAt(0);
	
	System.out.println("Capacidade do tanque");
	int capacidadeDoTanque = sc.nextInt();
	
	if (tipoDeCombustivel == 'g' || tipoDeCombustivel == 'G') {
		System.out.printf("O valor total gasto para encher o tanque � R$: %.2f", (capacidadeDoTanque * gasolina), "de gasolina");
	}else if(tipoDeCombustivel == 'a' || tipoDeCombustivel == 'A') {
		System.out.printf("O valor total gasto para encher o tanque � R$: %.2f", (capacidadeDoTanque * alcool)," de �lcool");
	}else {
		System.out.println("Op��o invalida!");
	}
	
	
	sc.close();
}
}
