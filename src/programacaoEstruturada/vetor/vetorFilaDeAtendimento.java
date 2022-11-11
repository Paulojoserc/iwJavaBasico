package programacaoEstruturada.vetor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class vetorFilaDeAtendimento {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean continua = true;
		int contadorPrioridade = 0;
		List<String> fila = new ArrayList<>();
		String pessoa = "";
		while (true) {
			System.out.println("Digite uma opção");
			System.out.println("1-Adicionar pessoa");
			System.out.println("2-Adicionar prioridade");
			System.out.println("3-chamar pessoa");
			System.out.println("4-verificar a fila");
			System.out.println("5-Imprimir usuarios");
			System.out.println("6-finalizar");

			int opcao = sc.nextInt();
		

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome da pessoa");
				pessoa = sc.next();
				fila.add(pessoa);
				break;

			case 2:
				System.out.println("Digite o nome da Prioridade");
				pessoa = "p-" + sc.next();
				fila.add(contadorPrioridade, pessoa);
				contadorPrioridade++;
				break;
			case 3:System.out.println(fila.remove(0));
				
				break;
			case 4:
				System.out.print("Numero de pessoas: ");
				System.out.println(fila.size() >= 0 ? fila.size() : "A fila esta vaziaS");
				break;
			case 5:
				for (String usuario : fila) {
					System.out.println("Os usuarios são " + usuario);
				}
				break;
			case 6:
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
