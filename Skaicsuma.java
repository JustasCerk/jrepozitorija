package Skaiciusuma;

import java.util.Scanner;

public class Skaicsuma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //12345444444
		System.out.print("Iveskite skaiciu: ");
		int n;
		if ( scanner.hasNextInt()) {
			 n = scanner.nextInt();
			 int sum = 0;
			for (int i = 1; i < n; i++) {
				System.out.print(i + "+"); //aassas
				sum += i;
			}
			sum += n;
			System.out.print(n + "=" + sum);
		} else {
			System.out.print("Netinkamas ivedimascccc");
		}
	}
}
