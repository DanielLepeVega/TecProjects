import java.util.ArrayList;

public class EjemploWildcard {

	public static double suma(ArrayList<? extends Number>numeros) {
		double res;
		res = 0.0;
		for(int i=0;i<numeros.size();i++) {
			res+=numeros.get(i).doubleValue();
			
		}
		return res;
	}
	
	public static void main(String[] args) {
		ArrayList<Number> numeros=new ArrayList<>();
		numeros.add(10);
		numeros.add(10);
		numeros.add(10.2);
		numeros.add(17.4);
		numeros.add(1.10);
		numeros.add(10.2);
		numeros.add(10.6);
		numeros.add(10.8);
		numeros.add(10.9);
		System.out.println(suma(numeros));
		ArrayList<String> palabras=new ArrayList<>();
		palabras.add("Hola");
		System.out.println(palabras);
	}
}
