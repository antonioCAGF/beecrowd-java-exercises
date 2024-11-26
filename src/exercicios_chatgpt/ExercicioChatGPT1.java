package exercicios_chatgpt;

import java.util.Scanner;

public class ExercicioChatGPT1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int quociente, resto;

		System.out.println("Digite um número: ");
		int N = sc.nextInt();
		System.out.println();

		quociente = N / 2;
		resto = N % 2;

		System.out.println("Divisão por 2:");
		System.out.println();
		System.out.println("Quociente: " + quociente);
		System.out.println();
		System.out.println("Resto: " + resto);
		System.out.println();

		quociente = N / 3;
		resto = N % 3;

		System.out.println("Divisão por 3:");
		System.out.println();
		System.out.println("Quociente: " + quociente);
		System.out.println();
		System.out.println("Resto: " + resto);

		sc.close();
	}
}
