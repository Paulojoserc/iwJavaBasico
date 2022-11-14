package programacaoEstruturada.manipulacaodearquivos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Projeto {

public static void main(String[] args) {
		
		Map<String,Double> precos = new HashMap<String, Double>();
		Map<Integer,String> produtos = new HashMap<Integer,String>();
		int opcao = 0, codigo = 1, codigoProduto = 0;
		double precoProduto = 0;
		String nome = "";
		
		while(true) {
		
			Scanner leitor = new Scanner(System.in);
			System.out.println("1-adicionar produto");
			System.out.println("2-listar produtos");
			System.out.println("3-alterar produtos");
			System.out.println("4-alterar pre�o");
			System.out.println("5-deletar produtos");
			opcao = leitor.nextInt();
					leitor.nextLine();
			
			switch(opcao) {
			
				case 1: System.out.println("digite o nome do produto");
				        nome = leitor.nextLine();
				        
				        System.out.println("Informe o pre�o do produto");
				        precoProduto = leitor.nextDouble();
				        
				        inserirProduto(codigo, produtos,precos, nome,precoProduto);
				        codigo++  ;
				        break;
				case 2: 
					for(Integer chave : produtos.keySet()) {
						
						String nomeProduto = produtos.get(chave);
						
						System.out.println(chave +" "+ nomeProduto+ " "+ precos.get(nomeProduto));
					}
					break;
				
				case 3 : 
						if(produtos.size() == 0) {
							System.err.println("n�o h� nenhum produto para alterar");
							break;
				 		 }
					
						 System.out.println("Digite o c�digo do produto");
						 codigoProduto = leitor.nextInt();
						                 leitor.nextLine();
						                 
						 if(codigoProduto<=0 || codigoProduto > codigo) {
							 System.err.println("c�digo inv�lido");
							 break;
						 }
							 
						 System.out.println("Digite o novo nome do produto");
						 nome = leitor.nextLine();
						 
						 alterarProdutoNome(codigoProduto, produtos,precos, nome);
						 break;
						 
				case 4 : 
					if(produtos.size() == 0) {
						System.err.println("n�o h� nenhum produto para alterar");
						break;
			 		 }
				
					 System.out.println("Digite o c�digo do produto");
					 codigoProduto = leitor.nextInt();
					                 leitor.nextLine();
					                 
					 if(codigoProduto<=0 || codigoProduto > codigo) {
						 System.err.println("c�digo inv�lido");
						 break;
					 }
						 
					 String nomeProduto = produtos.get(codigoProduto); 
					 
					 System.out.println("Digite o novo pre�o do " +nomeProduto);
					 precoProduto = leitor.nextDouble();
					 
					 alterarProdutoPreco(codigoProduto,produtos, precos, precoProduto);
					 break;		 
				
				case 5: System.out.println("Digite o c�digo do produto a ser deletado");
						codigoProduto = leitor.nextInt();
										leitor.nextLine();
						deletarProduto(codigoProduto, produtos);
										
						break;
				default: System.out.println("op��o inv�lida.");
			}
		}	
	}
	
	public static void inserirProduto(Integer codigo,Map<Integer,String>
								produtos,Map<String,Double> precos,String nome,Double preco) {
		produtos.put(codigo, nome);	
		precos.put(nome, preco);
	}
	
	public static void alterarProdutoNome(Integer codigo,Map<Integer,String> produtos,
											Map<String,Double> precos,String nome) {

		
		String auxiliarNome = produtos.get(codigo);
		
		Double auxiliarPreco = precos.get(auxiliarNome);
		
		produtos.put(codigo, nome);	

		precos.remove(auxiliarNome);
		
		precos.put(nome, auxiliarPreco);
	}
	
	public static void alterarProdutoPreco(Integer codigo,Map<Integer,String> produtos,Map<String,Double> precos,Double preco) {
		String nome = produtos.get(codigo);
		precos.put(nome, preco);
	}

	public static void deletarProduto(Integer codigo,Map<Integer,String> produtos) {
		produtos.remove(codigo);
	}

}