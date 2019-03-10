public class Naipe{
	private int valor,// 0-> As, 1-> Dos, 2-> Tres, ..., 10-> Joto, 11-> Reina, 12-> Rey
			figura;//0-> Espadas, 1-> Corazones, 2-> Treboles, 3-> Diamantes

	private static String[] sValores = {"As", "Dos", "Tres", "Cuatro",
"Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Joto", "Reina", "Rey"},
			 sFiguras = {"Espadas", "Corazones", "Treboles", "Diamantes"};

	//Guarda en clase no en el objeto
	public Naipe(int valor, int figura){
		this.valor = valor;
		this.figura = figura;
	}
	
	public String toString(){
		return Naipe.sValores[this.valor] + " de " + Naipe.sFiguras[this.figura];
	}
	
	public static void main(String[] args){
		Naipe sieteCorazones = new Naipe(6,1);
		System.out.println(sieteCorazones);
		Naipe asEspadas = new Naipe(0,0);
		System.out.println(asEspadas);
	}
}