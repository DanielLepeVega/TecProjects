//A01209423 Miguel Ángel Grimaldo Martinez
//A01633986 Daniel Lepe Vega
//POO
//23-06-2018
// 50-50

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class VentanaGrafica extends JFrame {

	public VentanaGrafica() {
		super("Graficadora");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PanelGrafica pg = new PanelGrafica();
		this.add(new PanelControlesGrafica(pg),BorderLayout.WEST);
		this.add(pg);
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		VentanaGrafica vg = new VentanaGrafica();
	}
}
