package model;

import java.util.Scanner;


public class Test {

	public static void main(String[] args) {

		Etudiant E1 = new Etudiant();
		Etudiant E2 = new Etudiant("Mohamed", 21, 16.29, "Tunis");

		E1.info();
		E2.info();

		System.out.println("************************************** ");

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Tapez votre nom : ");
			E1.setNom(scanner.nextLine());
			E1.info();

			System.out.println("Tapez votre age : ");
			E1.setAge(scanner.nextInt());
			E1.info();

			System.out.println("Tapez votre moyenne : ");
			E1.setMoyenne(scanner.nextDouble());
			E1.info();

			scanner.nextLine();

			System.out.println("Tapez votre adresse : ");
			E1.setAdresse(scanner.nextLine());
		}
		E1.info();

	}

}
