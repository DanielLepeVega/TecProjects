//A01209423 - Miguel Angel Grimaldo
//A01633986 - Daniel Lepe Vega
//POO
//23-06-2018
// 50-50

import javax.swing.JFrame;

public class Ventana extends JFrame{
	
	public Ventana() {
		super("Calculadora");
		PanelCalculadora pnc = new PanelCalculadora();
		this.add(pnc);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		Ventana a = new Ventana();
	
	}
}
