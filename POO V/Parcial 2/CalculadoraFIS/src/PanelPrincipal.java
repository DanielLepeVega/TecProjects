//A01209423 - Miguel Angel Grimaldo
//A01633986 - Daniel Lepe Vega
//POO
//23-06-2018
// 50-50

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanelPrincipal extends JPanel{
	
	private JButton btGraph,
					btCalc;
	private JLabel lbVersion;
	
	public PanelPrincipal() {
		super();
		this.setPreferredSize(new Dimension(700, 500));
		this.setLayout(null);
		this.setBackground(Color.CYAN);
		
		this.btGraph = new JButton("Graficadora");
		this.btGraph.setBounds(200, 150, 300, 100);
		this.btGraph.setFont(new Font("Arial", Font.PLAIN, 40));
		this.btGraph.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent evt) {
				new VentanaGrafica();
				close();
			}
		});
		this.add(this.btGraph);
		
		this.btCalc = new JButton("Calculadora");
		this.btCalc.setBounds(200, 275, 300, 100);
		this.btCalc.setFont(new Font("Arial", Font.PLAIN, 40));
		this.btCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				new Ventana();
				close();
			}
		});
		this.add(this.btCalc);
		
		this.lbVersion = new JLabel("v1.0.0");
		this.lbVersion.setBounds(660, 455, 60, 60);
		this.add(this.lbVersion);
		
	}
	
	public void close() {
		((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
	}
}
