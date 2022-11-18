package programacaoEstruturada.manipulacaodearquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A01_ManipulacaoDeArquivos {
	public static void main(String[] args) {
		String endereco = "arquivo.txt";
		 criarArquivo(endereco);
		//escreverArquivo(endereco);
		
		lerArquivo(endereco);
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

	public static void escreverArquivo(String endereco) {
		File arquivo = new File(endereco);
		try {
			FileWriter escrevedor = new FileWriter(arquivo);

			escrevedor.write("primeia linha\n");
			escrevedor.write("segunda linha\n");
			escrevedor.write("terceira linha\n");
			escrevedor.close();

			System.out.println("Arquivo escrito com sucesso. ");
		} catch (IOException e) {
			System.out.println("Não foi possível escrever no arquivo");
			e.printStackTrace();
		}
	}

	public static void lerArquivo(String endereco) {
		File arquivo = new File(endereco);
		try {
			Scanner sc = new Scanner(arquivo);

			while (sc.hasNextLine()) {
				String resultado = sc.nextLine();
				System.out.println(resultado);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao ler o arquivo!");
			e.printStackTrace();
		}
	}

}
