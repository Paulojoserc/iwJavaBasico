package programacaoEstruturada.manipulacaodearquivos;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Desafio {
	public static void main(String[] args) {
		Map<String,Double> precos = new HashMap<String, Double>();
		Map<Integer,String> produtos = new HashMap<Integer,String>();
		String enderecoProduto = "arquivoProduto.txt";
		 criarArquivoProduto(enderecoProduto);
		 String enderecoCompra = "arquivoCompra.txt";
		 criarArquivoProduto(enderecoCompra);
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
}