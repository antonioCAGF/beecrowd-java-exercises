package exercicios_beecrowd;

import java.util.Scanner;

public class BeeCrowd1018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int notas, quociente, resto;

		int N = sc.nextInt();
		resto = N;

		System.out.println(N);

		notas = 100;
		quociente = resto / notas;
		System.out.println(quociente + " nota(s) de R$ " + notas + ",00");
		resto = resto % notas;

		notas = 50;
		quociente = resto / notas;
		System.out.println(quociente + " nota(s) de R$ " + notas + ",00");
		resto = resto % notas;

		notas = 20;
		quociente = resto / notas;
		System.out.println(quociente + " nota(s) de R$ " + notas + ",00");
		resto = resto % notas;

		notas = 10;
		quociente = resto / notas;
		System.out.println(quociente + " nota(s) de R$ " + notas + ",00");
		resto = resto % notas;

		notas = 5;
		quociente = resto / notas;
		System.out.println(quociente + " nota(s) de R$ " + notas + ",00");
		resto = resto % notas;

		notas = 2;
		quociente = resto / notas;
		System.out.println(quociente + " nota(s) de R$ " + notas + ",00");
		resto = resto % notas;

		notas = 1;
		quociente = resto / notas;
		System.out.println(quociente + " nota(s) de R$ " + notas + ",00");
		resto = resto % notas;

		sc.close();
	}
}