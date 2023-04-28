package view;
import javax.swing.JOptionPane;

import controller.Controller;

public class Principal {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número "));
		if (num <= 12) {
			System.out.println(Controller.fat(num)); 
		} else {
			System.out.println("Número maior do que 12!!!");
		}
		
	}
}