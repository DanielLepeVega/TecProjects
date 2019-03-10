
public class Caja extends Rectangulo {
	protected double alto;
	
	public Caja(double ancho, double largo, double alto) {
		super(ancho,largo);
		this.alto=alto;
	}
	
	public Caja() {
		this(5.0,6.0,7.0);
	}
	
	public double perimetro() {
		return 2.0*this.ancho+4.0*this.largo+8.0*this.alto;
	}
	
	public double area() {
		return 2.0*super.area()+2.0*this.largo*this.alto+2.0*this.ancho*this.alto;
	}
	
	public double volumen() {
		return super.area()*this.alto;
	}
	
	public void saluda() {
		System.out.println("HOLA"); 
	}
	
	public String toString() {
		return "Caja con ancho " + this.ancho + ", largo " + this.largo + " y alto " + this.alto ;
	}
}
