package programacaoEstruturada.para;

public class EstruturaDeRepeticaoFor {
public static void main(String[] args) {
	int contador = 0, somador=0, somadorFor=0;
	
	while(contador<100) {
		somador+=100;
		contador++;
	}
	for(int cont =0;cont<100; cont++) {
		somadorFor+=cont;
	}
}
}
