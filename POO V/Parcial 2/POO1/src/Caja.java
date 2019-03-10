
public class Caja extends Rectangulo {
	protected double alto;
	
	public Caja(double largo, double ancho, double alto) {
		super(largo,ancho);
		this.alto = alto;
	}
	
	public Caja() {
		this(10.0,5.0,12.0);
	}
	
	public double area() {
		return 2.0*super.area()+2.0*this.largo*this.alto+2.0*this.ancho*this.alto;
	}
	
	public double perimetro() {
		return 2.0*this.ancho+4.0*this.largo+8.0*this.alto;
	}
	
	public double volumen() {
		return super.area()*this.alto;
	}
	
	public String toString() {
		return "Caja con largo " + this.largo + " ancho " + this.ancho + " y alto " + this.alto;
	}
	
	public void saluda() {
		System.out.println("Hola");
	}
}
