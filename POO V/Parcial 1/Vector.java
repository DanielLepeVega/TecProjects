//Daniel Lepe Vega
//A01633986
//Programación Orientada a Objetos
//4 de junio de 2018

public class Vector{

	private double i,
			j,
			k;

	public Vector(){
		this.i=0;
		this.j=0;
		this.k=0;
	}

	public Vector(double X, double Y, double Z){
		this.i=X;
		this.j=Y;
		this.k=Z;
	}

	public double magnitud(){
		return Math.pow(Math.pow(this.i,2) + Math.pow(this.j,2) + Math.pow(this.k,2),.5);
	}

	public Vector suma(Vector A){
		return new Vector(this.i + A.i, this.j + A.j, this.k + A.k);
	}

	public Vector resta(Vector A){
		return new Vector(this.i - A.i, this.j - A.j, this.k - A.k);
	}

	public double productoPunto(Vector A){
		return (this.i * A.i) + (this.j * A.j) + (this.k * A.k);
	}

	public Vector productoCruz(Vector A){
		return new Vector(this.j*A.k - this.k*A.j,this.k*A.i - this.i*A.k,this.i*A.j - this.j*A.i);
	}

	public void agregar(Vector A){
		this.i += A.i;
		this.j += A.j;
		this.k += A.k;		
	}	

	public void ImprimeVector(){
		System.out.println("(" + this.i + "i , " + this.j + " j, " + this.k + " k )"); 
	}

	public static void main(String[] args){
		Vector B=new Vector(1,2,3);
		Vector C=new Vector(1,1,1);
		B.suma(C).ImprimeVector();
		B.resta(C).ImprimeVector();
		System.out.println("Producto Punto: " + B.productoPunto(C));
		B.productoCruz(C).ImprimeVector();
		B.agregar(C);
		B.ImprimeVector();
	}
}