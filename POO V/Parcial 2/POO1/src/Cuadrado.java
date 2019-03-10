
public class Cuadrado extends Rectangulo {
	public Cuadrado() {
		this(7.0);
	}
	
	public Cuadrado(double lado) {
		super(lado,lado);
	}
	
	public String toString() {
		return "Cuadrado con lado " + this.largo;
	}
	
}