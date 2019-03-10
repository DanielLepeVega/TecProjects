import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class Ventana extends JFrame {

	public Ventana() {
		super("Mi primer ventana");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PanelDibujo pd=new PanelDibujo();
		this.add(pd);
		this.setSize(800, 600);
		this.add(new PanelControles(pd),BorderLayout.WEST);
		this.pack();
		this.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		Ventana miVentanita=new Ventana();
	}
}
