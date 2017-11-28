import daw.com.Teclado;

public class EcuacionSegundoGrado { //es el ejemplo del profesor
	
	private int a,b,c;

	public EcuacionSegundoGrado(int a, int b, int c) 
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "EcuacionSegundoGrado [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	public void leerDatos ()
	{
		a = Teclado.leerInt("a:");
		b = Teclado.leerInt("b:");
		c = Teclado.leerInt("c:");
	}
	
	public float getSolucionPositiva() throws MiguelException
	{
		float solucion;
		
		double discriminante = (b * b) - (4 * a *c);

		if ( discriminante < 0 || a == 0)
			throw new MiguelException ();
		
		solucion =(float) (-b + Math.sqrt(discriminante))/(2*a);

			
		return solucion;
	}
	
	public float getSolucionNegativa() throws MiguelException
	{
		float solucion;
		
		double discriminante = (b * b) - (4 * a *c);
	
		if ( a == 0)
			throw new MiguelException(3); 
		//esta excepción tenía procedimientos personalizados en función del parámetro introducido
		
		if ( discriminante < 0 )	
			throw new MiguelException(4); //same

		 
		
				
		
		solucion =(float) (-b - Math.sqrt(discriminante))/(2*a);
			
		return solucion;
	}
	
}
