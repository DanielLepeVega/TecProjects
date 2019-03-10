public class Naipe{

	private int valor, //0-> As, 1->2, 2->3 ...10->J, 11->Q, 12-> K
			palo; //0->Espadas, 1->Corazones, 2->Treboles, 3->Diamantes
	
	public static final String[] strValor=
{"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez","Joto","Reina","Rey"};
	
	public static final String[] strPalo={"Espadas","Corazones","Treboles","Diamantes"};

	public Naipe(int valor, int palo){
		this.valor=valor;
		this.palo=palo;
	}

	public String toString(){
		return Naipe.strValor[this.valor] + " de " + Naipe.strPalo[this.palo];
	}	

	public static void main (String[] args){
		Baraja nva=new Baraja();
		System.out.println(nva);
		nva.mezcla();
		System.out.println("La baraja ahora mezclada" + nva);
	}





}