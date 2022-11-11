package programacaoEstruturada.vetor;

public class Matriz {
public static void main(String[] args) {
	String  sala[][] = {
			{"José", "da silva","bezerra da memezes","fortaleza"},
			{"larissa", "dias","aldeota","fortaleza"},
			{"jessica", "moura","meireles","fortaleza"},
			{"Lucas", "castro","bairro de fátima","fortaleza"}
			};
	 for (int i = 0; i < sala.length ; i++) {
         for (int j = 0; j < sala[i].length ; j++) {
             System.out.print(sala[i][j] + " ");
         }
         System.out.println();
     }
	 
	 for (String[] linha  : sala) {
		 for (String coluna : linha) {
			System.out.println(coluna);
		}
		 System.out.println();
	}

	String matriz[][] = new String[4][2];
	
	matriz[0][0]="Alicia";
	matriz[0][1]="Duarte";
	
	
}
}
