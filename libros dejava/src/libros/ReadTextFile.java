package libros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadTextFile {
	public static void main(String[] args)
	{
		
		Scanner stdIn = new Scanner(System.in);
		PrintWriter fileOut;
		String text = "¡Hola, mundo!";
		try
		{
		System.out.print("Introduzca el nombre del archivo: ");
		fileOut =
		new PrintWriter(new FileWriter(stdIn.nextLine(), true));
		fileOut.println(text);
		fileOut.close();
		}
		catch (IOException e)
		{
		System.out.println("IO: " + e.getMessage());
		}
		} // end main
		} // end WriteTextFile2 class
