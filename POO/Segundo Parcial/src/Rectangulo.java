
public class Rectangulo implements Figura{
	protected double ancho,
					largo;
	
	public Rectangulo() {
		this(1.0,2.0);
	}
	
	public Rectangulo(double ancho, double largo) {
		this.ancho=ancho;
		this.largo=largo;
	}
	
	public double perimetro() {
		return 2.0*(this.ancho+this.largo);
	}
	
	public double area() {
		return (this.ancho*this.largo);
	}
	
	public double volumen() {
		return 0.0;
	}
	
	public String toString() {
		return ("Rectangulo con ancho " + this.ancho + " y largo " + this.largo);
	}
	
	public static void main (String[] agrs) {
		Figura[] figuras= {new Rectangulo(7,9),
				new Cuadrado(10), new Caja(5,6,7)};
		Figura a;
		for(int i=0;i<figuras.length;i++) {
			a=figuras[i];
			System.out.println(a);
			System.out.println("Perimetro: " + a.perimetro());
			System.out.println("Area: " + a.area());
			System.out.println("Volumen: " + a.volumen());
			System.out.println("-----------------------------------");
			if(i==2) {
				((Caja)a).saluda();
			}
		}
	}
}
