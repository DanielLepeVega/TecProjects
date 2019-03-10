
public class EjemploMetodoGenerico {

	public static void imprimeArregloS(String[] arregloS) {
		for(int i=0;i<arregloS.length-1;i++) {
			System.out.print(arregloS[i]+",");
		}
		System.out.print(arregloS[arregloS.length-1]);
		System.out.println();
	}
	
	public static void imprimeArregloI(int[] arregloI) {
		for(int i=0;i<arregloI.length-1;i++) {
			System.out.print(arregloI[i]+",");
		}
		System.out.print(arregloI[arregloI.length-1]);
		System.out.println();
	}
	
	public static void imprimeArregloS(Double[] arregloD) {
		for(int i=0;i<arregloD.length-1;i++) {
			System.out.print(arregloD[i]+",");
		}
		System.out.print(arregloD[arregloD.length-1]);
		System.out.println();
	}
	
	public static void main (String[] args) {
		int[] enteros= {1,3,5,8,9,10};
		EjemploMetodoGenerico.imprimeArregloI(enteros);
	}
}
