import java.util.*;

public class Baraja{
	private Naipe[] naipes;

	public Baraja(){
		this.naipes = new Naipe[52];
		int x = 0;
		for(int i=0;i<4;i++){
			for(int j=0;j<13;j++){
				this.naipes[x]= new Naipe(j,i);
				x++;
			}
		}
	}
	
	public String toString(){
		String baraja="";
		for(int i=0;i<this.naipes.length;i++){
			baraja += this.naipes[i] + "\n";
		}
		return baraja;
	}
		
	public void mezcla(){
		Random ran = new Random();
		int posAle;
		Naipe tmp;
		for(int i=0;i<this.naipes.length;i++){
			posAle=ran.nextInt(52);
			tmp=this.naipes[i];
			this.naipes[i]=this.naipes[posAle];
			this.naipes[posAle]=tmp;
		}
	}

	public static void main(String[] args){
		Baraja b1 = new Baraja();
		System.out.println(b1);
		b1.mezcla();
		System.out.println("---------------------------------");
		System.out.println(b1);
	}
	
}
	