package programacaoEstruturada;

import javax.swing.JOptionPane;

public class A01_Revisap02GUI {
public static void main(String[] args) {
	int numero = Integer.parseInt( JOptionPane.showInputDialog("Digite um n�mero"));
	int raizQuadrada = (int) Math.sqrt(numero);
	
	JOptionPane.showMessageDialog(null, raizQuadrada);
}
}
