//Daniel Lepe Vega
//A01633986

public class EjemploArreglos{
	public int suma(int [] arreglo){
		int res=0;
		for(int i=0;i<arreglo.length;i++){
			res+=arreglo[i];
		}
		return res;
	}

	public int maximo(int [] arreglo){
		int max=arreglo[0];
		for(int i=0;i<arreglo.length;i++){
			if(arreglo[i]>max){
				max=arreglo[i];
			}
		}
		return max;	
	}

	public int minimo(int [] arreglo){
		int min=arreglo[0];
		for(int i=0;i<arreglo.length;i++){
			if(arreglo[i]<min){
				min=arreglo[i];
			}
		}
		return min;	
	}

	public void imprime(String[][] palabras){
		for(int i=0; i<palabras.length; i++){
			for(int j=0; j<palabras[i].length; j++){
				System.out.print(palabras[i][j] + "\t");
			}
		System.out.println();
		}
	}

	public double promedio(int[] arreglo){
		double prom=arreglo[0];
		for(int i=0; i<arreglo.length; i++){
			prom+=arreglo[i];
		}
		return prom/arreglo.length;
	}
	
	public static void main(String [] args){
		EjemploArreglos ea=new EjemploArreglos();
		int[] numeros={-7,-10,-30,-4,-8};
		String[][] palabras={{"Hola","que","tal"},{"Adios","chido","man"}};
		System.out.println(ea.suma(numeros));
		System.out.println(ea.maximo(numeros));
		System.out.println(ea.minimo(numeros));
		ea.imprime(palabras);
		System.out.println(ea.promedio(numeros));

		for(int i=0;i<args.length;i++){
			args[i]=args[i];
		}

		String strx=args[0];
		int x=Integer.parseInt(strx);
		String stry=args[1];
		int y=Integer.parseInt(stry);

		String[][] nuevoa;
		nuevoa= new String[x][y];
		int k=2;
		for(int i=0; i<x; i++){
			for(int j=0; j<y; j++){
				nuevoa[i][j]=args[k];
				k++;
			}
		}
		ea.imprime(nuevoa);	
	}
}