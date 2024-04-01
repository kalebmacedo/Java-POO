package Aula02;

import javax.swing.JOptionPane;

public class Ex03 {

	public static void main(String[] args) {
		String popA = JOptionPane.showInputDialog("Digite o valor de a: ");
		int a = Integer.parseInt(popA);
		
		String popB = JOptionPane.showInputDialog("Digite o valor de b: ");
		int b = Integer.parseInt(popB);
		
		String popC = JOptionPane.showInputDialog("Digite o valor de c: ");
		int c = Integer.parseInt(popC);
		
		//
		boolean valor = a * a == (b * b + c * c);
		
		JOptionPane.showMessageDialog(null, valor);
	}

}
