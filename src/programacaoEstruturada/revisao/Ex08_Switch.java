package programacaoEstruturada.revisao;

import java.util.Scanner;

public class Ex08_Switch {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int parcela;
	System.out.println("Entre com o valor do produto que vai compra");
	double produto = sc.nextDouble();
	double pagamento = 0;
	System.out.println("Entre com a forma de pagamento");
	int codigo = sc.nextInt();
	System.out.println("1 - ? vista");
	System.out.println("2 - ? vista no cart?o");
	System.out.println("3 - parcelado em 2x");
	System.out.println("4 - parcelado em 4x");
	
	switch (codigo) {
	case 1: {
		parcela = 1;
		
		pagamento =  produto * (1-0.08 ) -pagamento;
		System.out.printf("Valor inicial do produto: R$: %.2f\n",produto);
		System.out.printf("Valor total pago foi R$: %.2f\n",pagamento);
		System.out.printf("Voc? economizou R$: %.2f",(produto - pagamento));
		break;
	}
	case 2: {
		pagamento =  produto * (1-0.04 ) - pagamento ;
		System.out.printf("Valor inicial do produto: R$: %.2f\n",produto);
		System.out.printf("Valor pago foi R$: %.2f\n",pagamento);
		System.out.printf("Voc? economizou R$: %.2f",(produto - pagamento));
		break;
	}
	case 3: {
		pagamento = produto;
		System.out.printf("Valor inicial do produto: R$: %.2f\n",produto);
		System.out.printf("O valor das 2 parcela ? R$: %.2f\n",pagamento/2);
		System.out.printf("O valor total R$: %.2f\n",pagamento);
		System.out.printf("Voc? economizou R$: %.2f",(produto - pagamento));
		break;
	}
	case 4: {
		pagamento = produto * (1 + 0.08 );
		System.out.printf("Valor inicial do produto: R$: %.2f\n",produto);
		System.out.printf("O valor total com juros parcelado em 4x foi R$: %.2f\n",pagamento/4);
		System.out.printf("O valor total %.2f\n R$:",pagamento);
		System.out.printf("O Seu juros foi R$: %.2f",((produto - pagamento)));
		break;
	}
	default:
		System.out.println("Op??o invalida");
	}
	sc.close();
	
	
}
}
