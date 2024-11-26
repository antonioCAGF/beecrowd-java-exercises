package exercicios_chatgpt;

import java.util.Scanner;

public class ExercicioChatGPT3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horas, minutos, segundos, resto;

		System.out.println("Digite o total de segundos:");
		int N = sc.nextInt();

		horas = N / 3600;

		resto = N % 3600;

		minutos = resto / 60;

		segundos = resto % 60;

		System.out.println(horas + " hora(s), " + minutos + " minutos e " + segundos + " segundos");

		sc.close();
	}
}
