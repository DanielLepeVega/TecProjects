import java.util.Random;

public class Baraja{

	private Naipe[] cartas;
		
	public Baraja(){
		this.cartas=new Naipe[52];
		int c=0;
		for(int i=0; i<Naipe.strPalo.length; i++){
			for(int j=0; j<Naipe.strValor.length; j++){
				this.cartas[c++]=new Naipe(j,i);
			}
		}
	}

	public String toString(){
		String res="";
		for(int i=0;i<cartas.length;i++){
			res+=cartas[i] + "\n";
		}
		return res;
	}

	public void mezcla(){
		Random ran=new Random();
		int aleatorio;
		Naipe tmp;
		for(int i=0;i<cartas.length;i++){
			aleatorio=ran.nextInt(52);
			tmp=cartas[i];
			cartas[i]=cartas[aleatorio];
			cartas[aleatorio]=tmp;
		}
		cartas[0].setAsdeEspadas();
	}
}