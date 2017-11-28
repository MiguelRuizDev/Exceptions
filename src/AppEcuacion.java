import daw.com.Pantalla;

public class AppEcuacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EcuacionSegundoGrado eq = new EcuacionSegundoGrado(0,0,0);
		
		eq.leerDatos();

		try{
			Pantalla.escribirFloat("solucion 1 = ", eq.getSolucionPositiva());
		
			Pantalla.escribirFloat("solucion 2 = ", eq.getSolucionNegativa());
		}
		catch (MiguelException e)
		{
			if (e.getCode()== 3)
				Pantalla.escribirFloat("solucion  = ", -eq.getC()/eq.getB());
			else
			{
				Pantalla.escribirString("Error en el cálculo de la solución");
				Pantalla.escribirString("\n"+ e.getMessage());
			}
		}
		
		try{
			Pantalla.escribirFloat("solucion 1 = ", eq.getSolucionPositiva());
		
			//Pantalla.escribirFloat("solucion 2 = ", eq.getSolucionNegativa());
		}
		catch (MiguelException e)
		{
			if (e.getCode()== 3)
				Pantalla.escribirFloat("solucion  = ", -eq.getC()/eq.getB());
			else
			{
				Pantalla.escribirString("Error en el cálculo de la solución");
				Pantalla.escribirString("\n"+ e.getMessage());
			}
		}
	}

}
