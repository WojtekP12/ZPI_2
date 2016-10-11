package zad1;

import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] parameters = new String[3];
		Scanner input = new Scanner(System.in);
		
		System.out.println("Prosze podac nazwe pliku");
		parameters[0] = input.next();
		System.out.println("Prosze podac tresc 'poprawnego' ciagu znakow");
		parameters[1] = input.next();
		System.out.println("Prosze podac tresc 'niepoprawnego' ciagu znakow");
		parameters[2] = input.next();
	}

}
