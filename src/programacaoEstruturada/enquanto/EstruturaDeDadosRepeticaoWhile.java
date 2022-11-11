package programacaoEstruturada.enquanto;

import java.util.Scanner;

public class EstruturaDeDadosRepeticaoWhile {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite uma senha ");
	String chaveDeAcesso = sc.nextLine();
	int contador=1;
	String senha = "";
	while(contador<=3) {
	System.out.println("Digite a senha");
	senha = sc.nextLine();
	
	if(senha.equals(chaveDeAcesso)){
		return;
	}else  {
		System.out.println("Senha incorreta. Você tem mais " +(3 - contador)+ " tentativas");
	}
		contador++;
	}
	System.out.println("Procure sua agencia");
	sc.close();
}
}

