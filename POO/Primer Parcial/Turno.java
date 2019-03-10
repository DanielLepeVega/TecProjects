import java.util.Random;
import javax.swing.*;

public class Turno{
	public static void PiedraPapelTijera(){
		Random rrnd=new Random();	
		int rnd=rrnd.nextInt(3);
		String x="piedra",
			y="papel",
			z="tijeras";
		String strnum=JOptionPane.showInputDialog("Dime un numero del 0 al 2 (0 es piedra, 1 es papel y 2 es tijera): ");
		int num=Integer.parseInt(strnum);
		System.out.println("Escogiste: " + rnd);
		if(num==0 && num==rnd){
			System.out.println("Empate " + x + " con " + x);
		}
		else if(num==1 && num==rnd){
			System.out.println("Empate " + y + " con " + y);
		}
		else if(num==2 && num==rnd){
			System.out.println("Empate " + z + " con " + z);
		}
		else if(num==0 && rnd==2){
			System.out.println("Ganaste, la " + x + " le gana a las " + z);
		}
		else if(num==0 && rnd==1){
			System.out.println("Perdiste, la " + x + " pierde contra el " + y);
		}
		else if(num==1 && rnd==0){
			System.out.println("Ganaste, el " + y + " le gana a la " + x);
		}
		else if(num==1 && rnd==2){
			System.out.println("Perdiste, el " + y + " pierde contra las " + z);
		}
		else if(num==2 && rnd==1){
			System.out.println("Ganaste, las " + z + " le ganan al " + y); 
		}		
		else if(num==2 && rnd==0){
			System.out.println("Perdiste, las " + z + " pierden contra la " + x);
		}
		else{
			System.out.println("Número no valido");
		}
	}

	public static void main(String[] args){
		PiedraPapelTijera();
	}
}