import javax.swing.*;

public class IntroJava{
	
	public static void calificacion(){
		String strCal=JOptionPane.showInputDialog("Cuál es tu calificación: ");
		int cal=Integer.parseInt(strCal);
		if(cal<70){
			System.out.println("Reprobado");
			JOptionPane.showMessageDialog(null,"Reprobado");
		}			
		else {
			System.out.println("Aprobado");
			JOptionPane.showMessageDialog(null,"Aprobado");
		}
	}

	public static void numerosDel1al100(){
		for(int i=0;i<100;i++){
			System.out.println(i+1);
		}
	}

	public static void serie(int x){
		for(int i=0;i<50;i++){
			System.out.println(x*(i+1));
		}
	}

	public static int calorias(){
		int numComidas=Integer.parseInt(JOptionPane.showInputDialog("Cuántas comidas tuviste el día de hoy?: "));
		int caloriasTotales=0;
		for(int i=0;i<numComidas;i++){
			caloriasTotales += Integer.parseInt(JOptionPane.showInputDialog("Cuántas calorías consumiste en la comida: " + (i+1) + " ?"));
		}
		return caloriasTotales;
	}

	public static void main(String[] args){
		calificacion();
		numerosDel1al100();
		serie(7);
		serie(5);
		int calorias=calorias();
		System.out.println("El total de calorías consumidas hoy fue: " + calorias);
	}
}