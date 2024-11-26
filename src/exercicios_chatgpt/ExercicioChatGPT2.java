package exercicios_chatgpt;

import java.util.Scanner;

public class ExercicioChatGPT2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horas, minutos;

		System.out.println("Digite um valor em minutos: ");

		int N = sc.nextInt(); // pegamos os minutos

		horas = N / 60; // minutos N para horas / 60

		minutos = N % 60; // minuto é o resto da divisao de horas por 60

		System.out.println(horas + " horas e " + minutos + " minutos");

		sc.close();
	}
}
