//Daniel Lepe Vega
//A01633986

import javax.swing.*;
public class Division {
	public static int division(int num, int den) {
		return num/den;
	}
	
	public static void main(String[] args) {
		boolean x=true;
		while(x) {
			try {
				String strNum=JOptionPane.showInputDialog("Introduce el numerador");
				String strDen=JOptionPane.showInputDialog("Introduce el denominador");
				int num=Integer.parseInt(strNum);
				int den=Integer.parseInt(strDen);
				JOptionPane.showMessageDialog(null, "El resultado de dividir " + num + " entre " + den + " es " + division(num, den));
				break;
			}
			catch(NumberFormatException e){
				System.out.println("Solo puedes introducir numeros enteros");
			}
			catch(ArithmeticException ex) {
				System.out.println("Tu denominador tiene que ser diferente a cero");
			}
		}	
	}	
}
