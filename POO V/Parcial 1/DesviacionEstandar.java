//Daniel Lepe Vega
//A01633986
//Programación Orientada a Objetos
//29 de mayo de 2018

import javax.swing.*;
public class DesviacionEstandar{
		
	public static double calculaDesviacion(){
		double cont = 0.0,
			cuadrados = 0.0;
		for(int i=0;i<10;i++){
			double numeros=Double.parseDouble(JOptionPane.showInputDialog("Introduzca el número " + (i+1)));
			cont += numeros;
			cuadrados += Math.pow(numeros,2);
		}
		System.out.println("La media es: " + cont/10); 
		return Math.pow((cuadrados - (Math.pow(cont,2))/10)/9,.5);
	}

	public static void main(String[] args){
		System.out.println("La desviación estandar es: " + calculaDesviacion());
	}
}