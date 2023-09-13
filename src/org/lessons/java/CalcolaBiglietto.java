package org.lessons.java;

import java.util.Scanner;


public class CalcolaBiglietto {

	public static void main(String[] args) {

		System.out.println("Calcolo tariffa biglietto del treno");

		Scanner scanner = new Scanner(System.in);

		System.out.print("Inserisci la tua età: ");
		int userAge = scanner.nextInt();

		System.out.print("Inserisci il numero di KM che percorrerai: ");
		int userKm = scanner.nextInt();
		
		scanner.close();

		String fare = "Base";
		double priceForKm = 0.21;
		double ticketPrice = userKm * priceForKm;
		double youngDiscount = 0.20;
		double seniorDiscount = 0.40;

		boolean young = userAge < 18;
		boolean senior = userAge > 65;



		if (young) {
			fare = "Young";
			ticketPrice = ticketPrice - (ticketPrice * youngDiscount);
		}
		else if (senior) {
			fare = "Senior";
			ticketPrice = ticketPrice - (ticketPrice * seniorDiscount);
		}

		String priceFormatted = String.format("%.2f", ticketPrice);

		 System.out.println("Il costo del tuo biglietto è: " + priceFormatted  + "€ e ricadi nella tariffa: " + fare);





	}

}
