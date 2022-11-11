package programacaoEstruturada.vetor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio04_contatos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * 1- incluir pessoa 2- pesquiser pessoas -mostra uma lista de pessoas
		 * cadastradas 3- deletar pessoa 4- modificar registro 5- finalizar
		 */
		List<String> agenda = new ArrayList<>();
		boolean continua = true;
		int indice = 0, opcao = 0;
		String contato = "";

		while (continua) {
			System.out.println("Digite uma opção");
			System.out.println("1-Adicionar contato");
			System.out.println("2-Pesquiser contato -mostra uma lista de pessoas cadastradas");
			System.out.println("3-Deletar conato");
			System.out.println("4-Modificar registro");
			System.out.println("5-Finalizar");

			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o número e  nome da pessoa");
				contato = sc.next();
				agenda.add(contato);
				break;

			case 2:
				for (String resistro : agenda) {
					System.out.println("nº: " + (agenda.indexOf(resistro)+1)+" name: "+resistro );
				}
				break;
			case 3:
				System.out.print("Digite o nº do contato a ser deletado: ");
				indice = sc.nextInt();
				agenda.remove(indice-1);
				break;
			case 4:
				System.out.println("Digite o nº do contato a ser deletado ");
				indice = sc.nextInt();
				System.out.println("Digite o valor novo registro");
				contato = sc.next();
				agenda.set(indice-1, contato);
				break;
			case 5:
				continua = false;
				break;
			default:
				System.out.println("Opção inválida");
				sc.close();
				break;
			}
		}
	}
}
