package programacaoEstruturada.para;



public class ForMelhorado {
public static void main(String[] args) {
	String pizza[] = {"peda�o1","peda�o2","peda�o3","peda�o4","peda�o5"};
	
	for (String pedaco : pizza) {
		System.out.println(pedaco);
	}
	System.out.println();
	for (int i = 0; i < pizza.length; i++) {
		System.out.println(pizza[i]);
	}
}
}
