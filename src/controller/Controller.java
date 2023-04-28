package controller;

public class Controller {

	public static int fat(int num) {
		// Condição de parada, se o número chegar no zero
		if (num == 0) {
			return 1;
		} else {
			// Função para o termo n em função do termo anterior:
			return num * fat(num - 1);
		}
	}
}