package paquete;
import java.io.*;

public class IOdeDatos {

	public static void main(String[] args) throws Exception {
		String texto;
		
		//Clase BufferedReader
		InputStreamReader flujo= new InputStreamReader(System.in);
		BufferedReader caracteres= new BufferedReader(flujo);
		
		System.out.println("Ingrese una palabra");
		texto=caracteres.readLine();
		
		System.out.println(texto);
		
		//Clase PrintStrem
         PrintStream salida= new PrintStream(System.out);
         salida.println("Esta es la clase PrintStream");

	}

}
