package programacaoEstruturada;

public class a01_revisao {
	public static void main(String[] args) {
		
		double numeroMegaSena[] = new double[5];
		numeroMegaSena[0] = Math.round(Math.random()*59.0)+1;
		numeroMegaSena[1] = Math.round(Math.random()*59.0)+1;
		numeroMegaSena[2] = Math.round(Math.random()*59.0)+1;
		numeroMegaSena[3] = Math.round(Math.random()*59.0)+1;
		numeroMegaSena[4] = Math.round(Math.random()*59.0)+1;
		numeroMegaSena[5] = Math.round(Math.random()*59.0)+1;
		
		System.out.println(numeroMegaSena[0]);
		System.out.println(numeroMegaSena[1]);
		System.out.println(numeroMegaSena[2]);
		System.out.println(numeroMegaSena[3]);
		System.out.println(numeroMegaSena[4]);
		System.out.println(numeroMegaSena[5]);
	}
}
