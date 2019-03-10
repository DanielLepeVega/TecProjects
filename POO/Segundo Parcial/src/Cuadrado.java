
public class Cuadrado extends Rectangulo{
	public Cuadrado() {
		this(1.0);
	}
	
	public Cuadrado(double lado) {
		super(lado,lado);
	}
	
	public String toString() {
		return "Cuadrado de lado " + this.ancho;
	}
}
