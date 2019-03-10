//A01209423 - Miguel Angel Grimaldo
//A01633986 - Daniel Lepe Vega
//POO
//23-06-2018
// 50-50

import javax.swing.*;

public class VentanaPrincipal extends JFrame{
	
	public VentanaPrincipal() {
		super("Calculadora Graficadora");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PanelPrincipal pp = new PanelPrincipal();
		this.add(pp);
		this.pack();
		this.setVisible(true);
		
	}
	

	public static void main(String[] args) {
		VentanaPrincipal vp = new VentanaPrincipal();
	}

}
