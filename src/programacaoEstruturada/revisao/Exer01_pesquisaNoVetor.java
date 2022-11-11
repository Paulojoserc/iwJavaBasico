package programacaoEstruturada.revisao;

import java.util.Scanner;

public class Exer01_pesquisaNoVetor {
	public static void main(String[] args) {
		int numeros[] = { 10, 5, 10, 89, 54, 10, 5, 36, 65, 47, 36, 10 };
		int maior=0, menor=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número");
		int numero = sc.nextInt();

		sc.close();

		int quantidade = 0;

		for (int i = 0; i < numeros.length; i++) {
			
			if(i== 0) {
				menor = numeros[i];
			}else {
				if(numeros[i]<menor) {
					menor = numeros[i];
				}
			}
			if(numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] == numero) {
				quantidade++;
			}
			
		}
		System.out.println("O número " + numero + " apareceu " + quantidade + " vez(es");
		System.out.println("O maior número é: "+maior);
		System.out.println("O menor número é: "+menor);
	}
}
