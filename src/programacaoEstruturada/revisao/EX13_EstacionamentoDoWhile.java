package programacaoEstruturada.revisao;

import java.util.Scanner;

public class EX13_EstacionamentoDoWhile {
	public static void main(String[] args) {
		int he=0, hs=0, me=0, ms=0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Digite a hora de entrada");
			he = sc.nextInt();
			if(he >=0 && he<24) {
				break;
			}
		}
		
		do {
			System.out.println("Digite a minuto de entrada");
			me = sc.nextInt();
			if(me>=0 && me<60) {
				break;
			}
		}while(true);
		
		do {
			System.out.println("Digite a hora de saida");
			 hs = sc.nextInt();
			if(hs >=0 && hs<24) {
				break;
			}
		}while(true);
		
		do {
			System.out.println("Digite a minuto de saida");
			ms = sc.nextInt();
			if(ms>=0 && ms<60) {
				break;
			}
		}while(true);
		
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
		int horasDePermanencia = (int)tempoDePermanencia/60;
		
		int minutosDePermanencia = (int)tempoDePermanencia % 60;
		
		System.out.println( "Tempo total "+horasDePermanencia+"h"+minutosDePermanencia+"m");
		System.out.println("Valor a ser pago: "+precoTotal);
		
		sc.close();
	}
}
