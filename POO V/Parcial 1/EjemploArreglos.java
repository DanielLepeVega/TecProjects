//Daniel Lepe Vega
//A01633986
//Programación Orientada a objetos
//1 de junio de 2018

public class EjemploArreglos{
	private int[] arreglo;

	public EjemploArreglos(int[] arreglo){
		this.arreglo = arreglo;
	}

	public int suma(){
		int res=0;
		for(int i=0;i<this.arreglo.length;i++){
			res += this.arreglo[i];	
		}
		return res;		
	}

	public int maximo(){
		int comp = this.arreglo[0];
		for(int i=1;i<this.arreglo.length;i++){
			if(this.arreglo[i]>comp){
				comp=this.arreglo[i];
			}
		}
		return comp;
	}
	
	public int minimo(){
		int comp = this.arreglo[0];
		for(int i=1;i<this.arreglo.length;i++){
			if(this.arreglo[i]<comp){
				comp=this.arreglo[i];
			}
		}
		return comp;
	}	
	
	public double promedio(){
		
		return ((double)this.suma())/this.arreglo.length;
	}

	public void imprime(String[][] x){
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				System.out.print(x[i][j] + ", ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args){
		int[] valores = {1,5,8,10,15,20,34};
		EjemploArreglos ea = new EjemploArreglos(valores);
		System.out.println("La suma es: " + ea.suma());	
		System.out.println("El valor máximo es: " + ea.maximo());
		System.out.println("El valor mínimo es: " + ea.minimo());
		System.out.println("El promedio es: " + ea.promedio());	

		String[][] palabras = {{"cat","dog","lizard"},{"bear","shark","snake"}};
		ea.imprime(palabras);


		//Main
		int x,
			y;
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);
		String[][] pp = new String[x][y];
		int k = 2;
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				pp[i][j] = args[k];
				k++;
			}
		}
		ea.imprime(pp);
	} 
	
}