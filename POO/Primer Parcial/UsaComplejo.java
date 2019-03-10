public class UsaComplejo{
	public static void main(String[] args){
		Complejo a=new Complejo();
		Complejo b=new Complejo(5,-7);
		Complejo c=new Complejo();
		Complejo d=new Complejo();
		Complejo e=new Complejo(0,0);	
		Complejo f=new Complejo();

		a.establecer(-8,7);
		a.imprimir();
		b.imprimir();
		a.agregar(10,4);
		a.imprimir();
		a.agregar(b);
		a.imprimir();
		c=a.suma(b);
		d=a.resta(b);
		c.imprimir();
		d.imprimir();
		d=a.multiplicacion(e);
		d.imprimir();
		f=b.multiplicacion(1.0);
		f.imprimir();
		f=b.conjugado();
		f.imprimir();
	}
}