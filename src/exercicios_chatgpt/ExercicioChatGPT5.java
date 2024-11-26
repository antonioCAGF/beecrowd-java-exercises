package exercicios_chatgpt;

import java.util.Scanner;

public class ExercicioChatGPT5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int reais, centavos;

		System.out.println("Digite o total de centavos: ");
		int totalCentavos = sc.nextInt();

		reais = totalCentavos / 100; // quantos reais inteiros cabem

		centavos = totalCentavos % 100;

		System.out.println(reais + " reais e " + centavos + " centavos");

		sc.close();
	}
}
