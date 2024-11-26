package exercicios_chatgpt;

import java.util.Scanner;

public class ExercicioChatGPT6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int semana, dias, horasRestantes;

		System.out.println("Digite o total de horas: ");
		int horasTotais = sc.nextInt();

		semana = horasTotais / 168;

		dias = horasTotais % 168 / 24;

		horasRestantes = horasTotais % 24;

		System.out.println(semana + " semana(s), " + dias + " dia(s) " + horasRestantes + " hora(s)");

		sc.close();
	}
}
