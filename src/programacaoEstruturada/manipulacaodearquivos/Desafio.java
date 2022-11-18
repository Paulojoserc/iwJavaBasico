package programacaoEstruturada.manipulacaodearquivos;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Map<String, Double> produtosQuantidadesprodutos = new HashMap<String, Double>();
		Map<String, Integer> produtosQuantidades = new HashMap<String, Integer>();
		String enderecoProduto = "arquivoProduto.txt";
		criarArquivoProduto(enderecoProduto);
		String enderecoCompra = "arquivoCompra.txt";
		criarArquivoProduto(enderecoCompra);

		int opcao = 0, codigo = 1, quantidadeProduto = 0;
		double precoProduto = 0;
		String nome = "";

		while (true) {

			Scanner sc = new Scanner(System.in);
			System.out.println("1-adicionar produto e quantidade de produtosQuantidades");
			System.out.println("2-listar produtosQuantidades");
			System.out.println("3-alterar produtosQuantidades");
			System.out.println("4-alterar preço");
			System.out.println("5-deletar produtosQuantidades");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {

			case 1:
				System.out.println("digite o nome do produto");
				nome = sc.nextLine();
				System.out.println("Informe o preço do produto");
				precoProduto = sc.nextDouble();
				System.out.println("Informe o preço do produto");
				quantidadeProduto = sc.nextInt();
				produtosQuantidadesprodutos.put(nome, precoProduto);
				produtosQuantidades.put(nome,quantidadeProduto);
				inserirProduto(produtosQuantidades, produtosQuantidadesprodutos);;
				codigo++;
				break;
			case 2:
				for (String nomes : produtosQuantidades.keySet()) {

					Integer nomeProduto = produtosQuantidades.get(nome);

					System.out.println(nomes + " " + nomeProduto + " " + produtosQuantidadesPrecos.get(nomeProduto));
				}
				break;

			case 3:
				if (produtosQuantidades(nome)) {
					System.err.println("não há nenhum produto para alterar");
					break;
				}

				System.out.println("Digite o código do produto");
				codigoProduto = sc.nextInt();
				sc.nextLine();

				if (codigoProduto <= 0 || codigoProduto > codigo) {
					System.err.println("código inválido");
					break;
				}

				System.out.println("Digite o novo nome do produto");
				nome = sc.nextLine();

				alterarProdutoNome(codigoProduto, produtosQuantidades, produtosQuantidadesPrecos, nome);
				break;

			case 4:
				if (produtosQuantidades.size() == 0) {
					System.err.println("não há nenhum produto para alterar");
					break;
				}

				System.out.println("Digite o código do produto");
				codigoProduto = sc.nextInt();
				sc.nextLine();

				if (codigoProduto <= 0 || codigoProduto > codigo) {
					System.err.println("código inválido");
					break;
				}

				String nomeProduto = produtosQuantidades.get(codigoProduto);

				System.out.println("Digite o novo preço do " + nomeProduto);
				precoProduto = sc.nextDouble();

				alterarProdutoPreco(codigoProduto, produtosQuantidades, produtosQuantidadesPrecos, precoProduto);
				break;

			case 5:
				System.out.println("Digite o código do produto a ser deletado");
				codigoProduto = sc.nextInt();
				sc.nextLine();
				deletarProduto(codigoProduto, produtosQuantidades);

				break;
			default:
				System.out.println("opção inválida.");
			}
		}
	}

	public static void criarArquivoCompra(String enderecoCompra) {
		File arquivoCompra = new File(enderecoCompra);
		try {
			if (arquivoCompra.createNewFile()) {
				System.out.println("Arquivo criado com sucesso!");
			} else {
				System.out.println("o arquivo já existe");
			}
		} catch (IOException e) {
			System.out.println("Deu ruim");
			e.printStackTrace();
		}
	}

	public static void criarArquivoProduto(String enderecoProduto) {
		File arquivoProduto = new File(enderecoProduto);
		try {
			if (arquivoProduto.createNewFile()) {
				System.out.println("Arquivo criado com sucesso!");
			} else {
				System.out.println("o arquivo já existe");
			}
		} catch (IOException e) {
			System.out.println("Deu ruim");
			e.printStackTrace();
		}
	}

	public static void inserirProduto( Map<String, Integer> produtosQuantidadesQuantidades, Map<String, Double> produtosQuantidadesprodutosQuantidadesPrecos) {
		String nome = null; 
		Integer quantidade = null;
		Double preco = null;
		produtosQuantidadesprodutosQuantidadesPrecos.put(nome, preco);
		produtosQuantidadesQuantidades.put(nome, quantidade);
	}

	public static void alterarProdutoNome(Integer quantidade, Map<String, Integer> produtosQuantidadesQuantidades, Map<String, Double> produtosQuantidadesprodutosQuantidadesPrecos,
			String nome) {

		Integer auxiliarNome = produtosQuantidadesQuantidades.get(quantidade);

		Double auxiliarPreco = produtosQuantidadesPrecos.get(auxiliarNome);

		produtosQuantidades.put(codigo, nome);

		produtosQuantidadesPrecos.remove(auxiliarNome);

		produtosQuantidadesPrecos.put(nome, auxiliarPreco);
	}

	public static void alterarProdutoPreco(Integer codigo, Map<String, Integer> produtosQuantidades, Map<String, Double> produtosQuantidadesPrecos,
			Double preco) {
		String nome = produtosQuantidades.get(codigo);
		produtosQuantidadesPrecos.put(nome, preco);
	}

	public static void deletarProduto(Integer codigo, Map<String, Integer> produtosQuantidades) {
		produtosQuantidades.remove(codigo);
	}
}
