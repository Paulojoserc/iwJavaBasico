package programacaoEstruturada.manipulacaodearquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A02_ManipulacaoDeArquivos {
	public static void main(String[] args) {
		String endereco = "arquivo.txt";
		// criarArquivo(endereco);
		escreverArquivo(endereco, "melancia,1.25\n");
		escreverArquivo(endereco, "laranja,5.0\n");
		System.out.println(lerArquivo(endereco));
		
		String resultado = lerArquivo(endereco);
		String linha[] = resultado.split("\n");
		String produto[] = linha[0].split(",");
		
		System.out.println("Nome: "+produto[0]+" Preço: "+produto[1]);
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

	public static void escreverArquivo(String endereco, String texto) {
		String resposta = lerArquivo(endereco);
		
		File arquivo = new File(endereco);
		try {
			FileWriter escrevedor = new FileWriter(arquivo);

			escrevedor.write(resposta+texto);
			
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
				resposta+=linha+"\n";
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao ler o arquivo!");
			e.printStackTrace();
		}
		return resposta;
	}
}
