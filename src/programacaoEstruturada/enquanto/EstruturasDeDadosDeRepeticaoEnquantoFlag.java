package programacaoEstruturada.enquanto;

import java.util.Scanner;

public class EstruturasDeDadosDeRepeticaoEnquantoFlag {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int opcao =0;
	double saldo = 1000;
	boolean continua = true;
	
	while(continua) {
		System.out.println();
		System.out.println("Que operação deseja realizar?");
		System.out.println("1-saldo");
		System.out.println("2-saque");
		System.out.println("3-deposito");
		System.out.println("4-encerrar atendimento");
		opcao = sc.nextInt();
		
		switch (opcao) {
		case 1: {
			System.out.println(saldo);
			System.out.println();
			break;
		}
		case 2: {
			System.out.println("Qual valor do saque");
			double saque = sc.nextDouble();
			saldo-=saque;
			System.out.println();
			break;
		}
		case 3: {
			System.out.println("Qual valor do deposito");
			double deposito = sc.nextDouble();
			saldo += deposito;
			System.out.println();
			break;
		}
		case 4: {
			continua = false;
			System.out.println();
			break;
		}
		default: 
			System.out.println("Opção invalida");
			System.out.println();
		}
		System.out.println("Valor em conta é "+ saldo);
	}
	
	sc.close();
}
}
