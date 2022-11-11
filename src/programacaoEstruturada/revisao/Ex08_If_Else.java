package programacaoEstruturada.revisao;

import java.util.Scanner;

public class Ex08_If_Else {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Entre com o valor do produto que vai compra");
	double produto = sc.nextDouble();
	double pagamento = 0;
	System.out.println("Entre com a forma de pagamento");
	int codigo = sc.nextInt();
	System.out.println("1 - à vista");
	System.out.println("2 - à vista no cartão");
	System.out.println("3 - parcelado em 2x");
	System.out.println("4 - parcelado em 4x");
	
	if(codigo ==1) {
		pagamento =  produto * (1-0.08 ) -pagamento;
		System.out.println();
		System.out.printf("Valor inicial do produto: R$: %.2f\n",produto);
		System.out.printf("Valor total pago foi R$: %.2f\n",pagamento);
		System.out.printf("Você economizou R$: %.2f",(produto - pagamento));
	}else if(codigo ==2) {
		System.out.println();
		pagamento =  produto * (1-0.04 ) - pagamento ;
		System.out.printf("Valor inicial do produto: R$: %.2f\n",produto);
		System.out.printf("Valor pago foi R$: %.2f\n",pagamento);
		System.out.printf("Você economizou R$: %.2f",(produto - pagamento));
	}else if(codigo == 3) {
		System.out.println();
		pagamento = produto;
		System.out.printf("Valor inicial do produto: R$: %.2f\n",produto);
		System.out.printf("O valor das 2 parcela é R$: %.2f\n",pagamento/2);
		System.out.printf("O valor total %.2f\n ",pagamento);
		System.out.printf("Você economizou R$: %.2f",(produto - pagamento));
	}else if(codigo == 4) {
		System.out.println();
		pagamento = produto * (1 + 0.08 );
		System.out.printf("Valor inicial do produto: R$: %.2f\n",produto);
		System.out.printf("O valor total com juros parcelado em 4x foi R$: %.2f\n",pagamento/4);
		System.out.printf("O valor total %.2f\n R$:",pagamento);
		System.out.printf("O Seu juros foi R$: %.2f",((produto - pagamento)));
	}else {
		System.out.println();
		System.out.println("Opção invalida");
	}
	
	
	sc.close();
}
}
