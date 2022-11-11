package programacaoEstruturada.para;

public class Fibonnacci {
public static void main(String[] args) {
	int a=1, b=0, c=0;
	
	for (int i = 0; i <=20 ; i++) {
		c =a+b;
		a=b;
		b=c;
		System.out.println(c);
	}
}
}
