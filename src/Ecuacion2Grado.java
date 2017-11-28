import daw.com.Pantalla;
import daw.com.Teclado;

public class Ecuacion2Grado {
	private double a,b,c;

	public Ecuacion2Grado() {
		a = 1; //EVITAMOS LA DIVISION ENTRE CERO
		b = 0;
		c = 0;
	}

	public Ecuacion2Grado(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Ecuacion2Grado(Ecuacion2Grado e){
		this.a = e.a;
		this.b = e.b;
		this.c = e.c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	public double calcularSolucion1(){
		double solucion;
		return solucion = (-b + Math.sqrt(Math.pow(b,2) - (4 * a * c))) / 2 * a;
	}
	
	public double calcularSolucion2(){
		double solucion;
		return solucion =  (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / 2 * a;
	}
	
	public static void main(String[] args) {
		
		Ecuacion2Grado e = new Ecuacion2Grado();
		
		try{
			e.setA(Teclado.leerInt("Dime a:"));
			e.setB(Teclado.leerInt("Dime b:"));
			e.setC(Teclado.leerInt("Dime c:"));
		}
		catch(Exception excepcion1){//EXCEPCION GENERICA, PUES NO SE EL TIPO
			Pantalla.escribirString("Valores no válidos");
		}

		try{
		Pantalla.escribirString("Las soluciones a la ecuación son: " + String.valueOf(e.calcularSolucion1()) + " y " + String.valueOf(e.calcularSolucion2()));
		}
		catch(ArithmeticException excepcion2){
			Pantalla.escribirString("No intentes dividir entre 0, gañán");		
		}
	}

}
