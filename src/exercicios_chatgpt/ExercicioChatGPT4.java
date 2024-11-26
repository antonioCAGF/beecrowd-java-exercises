package exercicios_chatgpt;

import java.util.Scanner;

public class ExercicioChatGPT4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int semanas, restoDeDias;

		System.out.println("Digite o total de dias: ");
		int dias = sc.nextInt();

		semanas = dias / 7;

		restoDeDias = dias % 7;

		System.out.println(semanas + " semana(s) e " + restoDeDias + " dia(s)");

		sc.close();
	}
}