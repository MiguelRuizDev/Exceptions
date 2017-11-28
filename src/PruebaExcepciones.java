import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import daw.com.Pantalla;
import daw.com.Teclado;

public class PruebaExcepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena;
		int array[];
		
		cadena = null;
		
		array = new int[4];
		
		array[0] = 1;
		array[1] = 1;
		array[2] = 1;
		array[3] = 1;
		
		Date fecha = new Date();
		try
		{
			//array[4] = 1;
			saludaAlCampeon("Mesi cabrón");
			/*
			if (cadena.equals("buenos días"))
				Pantalla.escribirString("good morning");
			else
				Pantalla.escribirString("bye");
			
			SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
			String fechaNacimiento = Teclado.leerString("Fecha de nacimento (dd/MM/yyyy)");
		
			 fecha = sdf.parse(fechaNacimiento);
			
			Pantalla.escribirString(fecha.toString());
			*/
		}

		catch (ArrayIndexOutOfBoundsException e)
		{
			Pantalla.escribirString("Te has pasaó de listo...");
		}
/*
		catch (ParseException error)
		{
			Pantalla.escribirString("Vaya mierda de fecha");
			Pantalla.escribirString("Vuelve a la escuela");
			fecha = new Date();
		}
*/
		catch (MiguelException e)
		{
			Pantalla.escribirString(e.getMessage());
		}
		
		finally
		{
			Pantalla.escribirString("\n En finally"+ fecha.toString());
		}
		
		Pantalla.escribirString("\fin");
		
		
		

	}
	
	public static void saludaAlCampeon(String saludo) throws MiguelException
	{
		if (saludo.contains("Mesi"))
			throw new MiguelException ();
		
		
		Pantalla.escribirString("\n"+ saludo + " saluda al campeón");
	}

}
