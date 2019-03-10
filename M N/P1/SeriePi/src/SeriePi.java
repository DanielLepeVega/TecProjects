import javax.swing.*;
public class SeriePi {
	
	public static void main(String[] args) {
		String StrN=JOptionPane.showInputDialog("Ingresa el valor de N: ");
		int N=Integer.parseInt(StrN);
		double res=0,
				sum=0;
		
		for(int i=0;i<N;i++) {
			res = 4*Math.pow(-1, i)/(2*i+1);
			sum +=res;
		}
		
		System.out.println("El resultado de la sumatoria de pi es: " + sum);
	}
}
