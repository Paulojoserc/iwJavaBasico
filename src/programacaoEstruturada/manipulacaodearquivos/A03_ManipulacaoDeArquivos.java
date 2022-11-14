package programacaoEstruturada.manipulacaodearquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A03_ManipulacaoDeArquivos {
	public static void main(String[] args) {
		String endereco = "arquivo.txt";
		Map<String, Double> produtos = new HashMap<String, Double>();
		
		produtos.put("chocolate", 5.0);
		produtos.put("Frango", 15.0);
		
		escreverArquivo(endereco, produtos);
	}

	public static void criarArquivo(String endereco) {

		File arquivo = new File(endereco);
		try {
			if (arquivo.createNewFile()) {
				System.out.println("Arquivo criado com sucesso!");
			} else {
				System.out.println("o arquivo já existe");
			}
		} catch (IOException e) {
			System.out.println("Deu ruim");
			e.printStackTrace();
		}
	}

	public static void escreverArquivo(String endereco, Map<String, Double> produtos) {
		String resposta = lerArquivo(endereco);

		File arquivo = new File(endereco);
		try {
			FileWriter escrevedor = new FileWriter(arquivo);

			for (String chave : produtos.keySet()) {
				escrevedor.write(resposta + " " + chave + " " + produtos.get(chave));
			}

			escrevedor.close();

			System.out.println("Arquivo escrito com sucesso. ");
		} catch (IOException e) {
			System.out.println("Não foi possível escrever no arquivo");
			e.printStackTrace();
		}
	}

	public static String lerArquivo(String endereco) {
		String resposta = "";
		File arquivo = new File(endereco);
		try {
			Scanner sc = new Scanner(arquivo);

			while (sc.hasNextLine()) {
				String linha = sc.nextLine();
				resposta += linha + "\n";
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao ler o arquivo!");
			e.printStackTrace();
		}
		return resposta;
	}
}
