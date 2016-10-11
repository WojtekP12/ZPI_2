package zad1;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zad1 {
	
	public static void saveToFile(String[] parameters, Callback callback)
	{
		File file = new File(parameters[0]);
		PrintWriter zapis = null;
		try
		{
			zapis = new PrintWriter(parameters[0]);
			zapis.println("Hello world");
			zapis.close();
		}
		catch(Exception e)
		{
			System.out.println(parameters[2]);
			callback.setFlag(false);
		}
		
		
		System.out.println(parameters[1]);
		
		callback.setFlag(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] parameters = new String[3];
		Scanner input = new Scanner(System.in);
		Callback callback = new Callback();
		
		System.out.println("Prosze podac nazwe pliku");
		parameters[0] = input.next();
		System.out.println("Prosze podac tresc 'poprawnego' ciagu znakow");
		parameters[1] = input.next();
		System.out.println("Prosze podac tresc 'niepoprawnego' ciagu znakow");
		parameters[2] = input.next();
		
		saveToFile(parameters, callback);
		
		if(callback.getPath())
		{
			System.out.println("Prosze podac inna nazwe pliku");
			parameters[0] = input.next();
			
			saveToFile(parameters, callback);
		}
		input.close();
	}

}

//TEST GITA
