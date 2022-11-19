package programacaoEstruturada.manipulacaodearquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Map<String, Double> produtos = new HashMap<String, Double>();
		Map<String, Integer> compras = new HashMap<String, Integer>();
		String enderecoProduto = "arquivoProduto.txt";
		criarArquivo(enderecoProduto);
		lerArquivo(enderecoProduto, produtos);
		String enderecoCompra = "arquivoCompra.txt";
		criarArquivo(enderecoCompra);
		// lerArquivo(enderecoCompra, compras);

		int opcao = 0, conte = 0, quantidadeProduto = 0;
		double precoProduto = 0;
		String nome = "";

		while (true) {

			Scanner sc = new Scanner(System.in);

			System.out.println("===== Bem vindo ao sistema ======");
			System.out.println();
			System.out.println("1-adicionar produto ");
			System.out.println("2-listar produtos ");
			System.out.println("3-alterar produtos");
			System.out.println("4-alterar preço");
			System.out.println("5-deletar produtos");
			System.out.print("Escolha uma opção:");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {

			case 1:
				System.out.println();
				System.out.println("Cadastro de produto");
				System.out.println();
				System.out.println("digite o nome do produto");
				nome = sc.nextLine().toLowerCase();
				System.out.println("Informe o preço do produto");
				precoProduto = sc.nextDouble();
				inserirProduto(nome, precoProduto);
				lerArquivo(enderecoProduto, produtos);
				conte++;
				break;
			case 2:
				lerArquivo(enderecoProduto, produtos);
				listarProdutos(produtos);
				break;
			case 3:
				if (produtos.size() == 0) {
					System.err.println("não há nenhum produto para alterar");
					break;
				}
				listarProdutos(produtos);
				System.out.println("Digite o nome do produto para ser alterado ");
				nome = sc.next();
				precoProduto = produtos.get(nome);
				System.out.print("Digite o nome para alteração: ");
				produtos.remove(nome);
				produtos.put(sc.next(), precoProduto);
				System.out.println("Produto alterado com sucesso!");
				listarProdutos(produtos);
				alterarArquivo(enderecoProduto, produtos);
			}
		}

	}

	private static void listarProdutos(Map<String, Double> produtos) {
		System.out.println();
		System.out.println("Lista de Produtos");
		for (Map.Entry<String, Double> produto : produtos.entrySet()) {
			String key = produto.getKey();
			Double val = produto.getValue();
			System.out.println("Produto: " + key + " R$:" + val);
		}

	}

	public static void criarArquivoCompra(String enderecoCompra) {
		File arquivoCompra = new File(enderecoCompra);
		try {
			if (arquivoCompra.createNewFile()) {
				System.out.println("Arquivo compra criado com sucesso!");
			} else {
				System.out.println("Base de dados do Compras carregada");
			}
		} catch (IOException e) {
			System.out.println("Deu ruim");
			e.printStackTrace();
		}
	}

	public static void criarArquivo(String enderecoProduto) {
		File arquivoProduto = new File(enderecoProduto);
		try {
			if (arquivoProduto.createNewFile()) {
				System.out.println("Arquivo produto criado com sucesso!");
			} else {
				System.out.println("Base de dados do Produto carregada");
			}
		} catch (IOException e) {
			System.out.println("Deu ruim");
			e.printStackTrace();
		}
	}

	public static void inserirProduto(String nome, Double preco) {

		String produto = nome + "," + preco;
		escreverArquivo("arquivoProduto.txt", produto);
	}

	public static void escreverArquivo(String endereco, String texto) {
		// String resposta = lerArquivo(endereco);

		File arquivo = new File(endereco);
		try {
			Scanner sc = new Scanner(arquivo);
			String resposta = "";
			while (sc.hasNextLine()) {
				String linha = sc.nextLine();
				resposta += linha + "\n";
			}
			FileWriter escrevedor = new FileWriter(arquivo);

			escrevedor.write(resposta + texto);

			escrevedor.close();

			sc.close();

			System.out.println("Arquivo escrito com sucesso. ");
		} catch (IOException e) {
			System.out.println("Não foi possível escrever no arquivo");
			e.printStackTrace();
		}
	}

	public static void lerArquivo(String endereco, Map<String, Double> produtos) {
	//	String resposta = "";
		File arquivo = new File(endereco);
		try {
			Scanner sc = new Scanner(arquivo);

			while (sc.hasNextLine()) {
				String linha = sc.nextLine();
				// resposta += linha + "\n";
				String[] coluna = linha.split(",");
				produtos.put(coluna[0], Double.parseDouble(coluna[1]));
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao ler o arquivo!");
			e.printStackTrace();
		}
		// System.out.println(resposta);
		// return resposta;
	}

	public static void alterarArquivo(String endereco, Map<String, Double> lista) {

		File arquivo = new File(endereco);
		try {

			FileWriter escrevedor = new FileWriter(arquivo);

			escrevedor.write("");
			escrevedor.close();

			for (Map.Entry<String, Double> produto : lista.entrySet()) {
				String key = produto.getKey();
				Double val = produto.getValue();
				inserirProduto(key, val);
			}
			lerArquivo(endereco, lista);
		} catch (IOException e) {
			System.out.println("Não foi possível escrever no arquivo");
			e.printStackTrace();
		}
	}

}
