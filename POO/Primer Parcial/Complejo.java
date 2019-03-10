//Daniel Lepe Vega
//A01633986

public class Complejo{
	private double real, 
			imaginario;

	public Complejo(){
		this(1,1);
	}
	
	public Complejo(double real, double imaginario){
		this.establecer(real, imaginario);
	}

	public void establecer(double real, double imaginario){
		this.real=real;
		this.imaginario=imaginario;
	}

	public void imprimir(){
		System.out.print(this.real + ",");
		System.out.println(this.imaginario + "i");
	}

	public void agregar(double real, double imaginario){
		this.real+=real;
		this.imaginario+=imaginario;
	}

	public void agregar(Complejo comp){
		this.real+=comp.real;
		this.imaginario+=comp.imaginario;
	}

	public Complejo suma(Complejo comp){
		return new Complejo(this.real+=comp.real,this.imaginario+=comp.imaginario);
	}	

	public Complejo resta(Complejo comp){
		return new Complejo(this.real-=comp.real,this.imaginario-=comp.imaginario);
	}	

	public Complejo multiplicacion(Complejo comp){
		return new Complejo(this.real*=comp.real,this.imaginario*=comp.imaginario);
	}	
	
	public Complejo multiplicacion(double x){
		return new Complejo(this.real*x,this.imaginario*x);
	}

	public Complejo conjugado(){
		return new Complejo(this.real,this.imaginario*-1);
	}
}