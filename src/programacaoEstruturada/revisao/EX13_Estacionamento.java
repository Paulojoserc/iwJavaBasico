package programacaoEstruturada.revisao;

import java.util.Scanner;

public class EX13_Estacionamento {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora de entrada");
		int he = sc.nextInt();
		
		System.out.println("Digite a minuto de entrada");
		int me = sc.nextInt();

		System.out.println("Digite a hora de saida");
		int hs = sc.nextInt();
		
		System.out.println("Digite a minuto de saida");
		int ms = sc.nextInt();
		
		
		double tempoDePermanencia = (hs - he)*60;
		
		tempoDePermanencia += ( ms - me);
		
		int horasCobradas = (int) tempoDePermanencia/60;
		
		if(tempoDePermanencia % 60 !=0) {
			horasCobradas++;
		}
		double precoTotal = 0;
		
		if(horasCobradas <=1) {
			precoTotal =4;
			System.out.println("Valor a ser pago é R$: "+precoTotal);
		}else if(horasCobradas >1 && horasCobradas <= 2) {
			precoTotal =6;
			System.out.println("Valor a ser pago é R$: "+precoTotal);
		}else {
			precoTotal = 6 + (1*(horasCobradas-2));
			System.out.println("Valor a ser pago é R$: "+precoTotal);
		}
		
		sc.close();
	}
}
