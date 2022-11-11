package programacaoEstruturada.para;



public class ForMelhorado {
public static void main(String[] args) {
	String pizza[] = {"pedaço1","pedaço2","pedaço3","pedaço4","pedaço5"};
	
	for (String pedaco : pizza) {
		System.out.println(pedaco);
	}
	System.out.println();
	for (int i = 0; i < pizza.length; i++) {
		System.out.println(pizza[i]);
	}
}
}
