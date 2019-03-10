import java.util.Random;

public class PruebaRandom{
	
	public static void yolo(){
		Random rrnd=new Random();
		int rnd=rrnd.nextInt(3);
		System.out.println("Tu numero es:" + rnd);
	}

	public static void main(String[] args){
		yolo();
	}	
}