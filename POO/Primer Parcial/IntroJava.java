import javax.swing.*;

public class IntroJava{
	public static void calificacion(){
		String strCalif=JOptionPane.showInputDialog("Dime tu calificacion");
		int calif=Integer.parseInt(strCalif);
		if(calif>=70){
			System.out.println("Aprobado");
		}
		else{
			System.out.println("Reprobado");
		}
	}

	public static void num(){
		for(int numm=1;numm<101;numm++){
			System.out.println(numm);
		}
	}

	public static void serie(int Base){
		for(int n=0;n<50;n++){
			System.out.println(Base*(n+1));
		}
	}	

	public static void comidas(){
		String strcom=JOptionPane.showInputDialog("Cuantas comidas tuviste el dia de hoy?");
		int com=Integer.parseInt(strcom);
		int totcal=0;
		for(int nn=1;nn<(com+1);nn++){
			System.out.print("Cuantas calorias consumiste en la comida ");
			System.out.print(nn);
			System.out.println("?");
			String strcal=JOptionPane.showInputDialog("Cuantas calorias consumiste?");
			int cal=Integer.parseInt(strcal);
			totcal=totcal+cal;
		}
		JOptionPane.showMessageDialog(null,"El dia de hoy consumiste: " + totcal);
	}	

	public static void main(String[] args){
		calificacion();
		num();
		serie(5);
		comidas();
	}
}
