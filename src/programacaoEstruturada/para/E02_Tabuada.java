package programacaoEstruturada.para;


import java.util.Scanner;

public class E02_Tabuada {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	for (int i = 1; i <=10 ; i++) {
		int cont=0, num =i;
		
		while(cont<=10) {
			System.out.println(num +" x "+cont+" = "+(num*cont));
			cont++;
		}
		
		System.out.println("-------------");
	}
	
	for (int i = 1; i <=10 ; i++) {
		int cont=0, num =i;
		
		while(cont<=10) {
			System.out.println((num*cont) +" / "+num+" = "+cont);
			cont++;
		}
		
		System.out.println("-------------");
	}
	sc.close();
}
}
