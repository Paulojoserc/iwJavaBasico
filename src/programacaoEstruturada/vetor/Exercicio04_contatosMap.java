package programacaoEstruturada.vetor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio04_contatosMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * 1- incluir pessoa 2- pesquiser pessoas -mostra uma lista de pessoas
		 * cadastradas 3- deletar pessoa 4- modificar registro 5- finalizar
		 */
		Map<String, String> agenda = new HashMap<String, String>();
		boolean continua = true;
		int indice = 0, opcao = 0;
		String contato = "", telefone="";

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
				System.out.println("Digite o número do contato");
				telefone = sc.next();
				agenda.put(contato, telefone);
				break;

			case 2:
				for (String registro : agenda.keySet()) {
					String tel = agenda.get(registro);
					System.out.println("nº: " +tel +" name: "+ registro);
				}
				break;
			case 3:
				System.out.print("Digite o nº do contato a ser deletado: ");
				indice = sc.nextInt();
				agenda.remove(contato);
				System.out.println("Número deletado com sucesso");
				break;
			case 4:
				System.out.println("Digite o nome do novo registro. ");
				contato = sc.next();
				System.out.println("Digite o nº de telefone");
				telefone = sc.next();
				agenda.replace(contato, telefone);
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
