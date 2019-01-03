package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> fisica = new HashSet<>();
		Set<Integer> matematica = new HashSet<>();
		Set<Integer> ingles = new HashSet<>();

		System.out.print("Alunos curso de fisica:");
		int a = sc.nextInt();
		for (int v = 0; v < a; v++) {
			int id = sc.nextInt();
			fisica.add(id);
		}
		System.out.println();
		System.out.print("Alunos curso de fisica:");
		int b = sc.nextInt();
		for (int v = 0; v < b; v++) {
			int id = sc.nextInt();
			matematica.add(id);
		}
		System.out.println();
		System.out.print("Alunos curso de fisica:");
		int c = sc.nextInt();
		for (int v = 0; v < c; v++) {
			int id = sc.nextInt();
			ingles.add(id);
		}

		Set<Integer> total = new HashSet<Integer>();
		total.addAll(fisica);
		total.addAll(matematica);
		total.addAll(ingles);

		System.out.println("\n" + "Total de alunos: " + total.size());
		sc.close();
	}

}
