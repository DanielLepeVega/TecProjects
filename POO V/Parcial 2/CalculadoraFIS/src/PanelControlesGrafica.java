//A01209423 Miguel Ángel Grimaldo Martinez
//A01633986 Daniel Lepe Vega
//POO
//23-06-2018
// 50-50

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.awt.*;

import javax.swing.*;

public class PanelControlesGrafica extends JPanel {

	private PanelGrafica pg;
	
	private JRadioButton jrb1,
							jrb2,
							jrb3;
	
	private JButton jbtAceptar,
					jbtGraf,
					jbtMenu;
	
	private JTextField jtfcons,
						jtfx1,
						jtfx2,
						jtfx3,
						jtfFun;
	
	private JLabel jlcons,
					jlx1,
					jlx2,
					jlx3;
	
	private JPanel panelColor; 
	
	public PanelControlesGrafica(PanelGrafica pg) {
		super();
		this.setPreferredSize(new Dimension(200,1000));
		this.pg = pg;
		this.setBackground(Color.GRAY);
		
		//Instanciar componentes
		this.jrb1 = new JRadioButton("Gráfica Lineal");
		this.jrb1.setFont(new Font("Arial",Font.PLAIN,20));
		this.jrb2 = new JRadioButton("Gráfica Cuadrática");
		this.jrb2.setFont(new Font("Arial",Font.PLAIN,20));
		this.jrb3 = new JRadioButton("Gráfica Cúbica");
		this.jrb3.setFont(new Font("Arial",Font.PLAIN,20));
		this.jbtAceptar = new JButton("Aceptar");
		this.jbtAceptar.setFont(new Font("Arial",Font.PLAIN,20));
		ButtonGroup bg = new ButtonGroup();
		bg.add(this.jrb1);
		bg.add(this.jrb2);
		bg.add(this.jrb3);
		boolean temp = false;
		this.jtfcons = new JTextField();
		this.jtfcons.setFont(new Font("Arial",Font.PLAIN,20));
		this.jtfcons.setPreferredSize(new Dimension(180,25));
		this.jtfcons.setVisible(temp);
		this.jtfx1 = new JTextField();
		this.jtfx1.setFont(new Font("Arial",Font.PLAIN,20));
		this.jtfx1.setPreferredSize(new Dimension(180,25));
		this.jtfx1.setVisible(temp);
		this.jtfx2 = new JTextField();
		this.jtfx2.setFont(new Font("Arial",Font.PLAIN,20));
		this.jtfx2.setPreferredSize(new Dimension(180,25));
		this.jtfx2.setVisible(temp);
		this.jtfx3 = new JTextField();
		this.jtfx3.setFont(new Font("Arial",Font.PLAIN,20));
		this.jtfx3.setPreferredSize(new Dimension(180,25));
		this.jtfx3.setVisible(temp);
		this.jlcons = new JLabel("Constante");
		this.jlcons.setFont(new Font("Arial",Font.PLAIN,20));
		this.jlcons.setVisible(temp);
		this.jlx1 = new JLabel("X Lineal");
		this.jlx1.setFont(new Font("Arial",Font.PLAIN,20));
		this.jlx1.setVisible(temp);
		this.jlx2 = new JLabel("X Cuadrática");
		this.jlx2.setFont(new Font("Arial",Font.PLAIN,20));
		this.jlx2.setVisible(temp);
		this.jlx3 = new JLabel("X Cúbica");
		this.jlx3.setFont(new Font("Arial",Font.PLAIN,20));
		this.jlx3.setVisible(temp);
		this.jbtGraf = new JButton("   Color   ");
		this.jbtGraf.setEnabled(false);
		this.jbtGraf.setFont(new Font("Arial",Font.PLAIN,20));
		this.panelColor = new JPanel();
		this.panelColor.setPreferredSize(new Dimension(100,100));
		this.panelColor.setBackground(this.pg.getColorFx());
		this.jbtMenu = new JButton("   Menu   ");
		this.jbtMenu.setFont(new Font("Arial",Font.PLAIN,20));
		this.jtfFun = new JTextField();
		this.jtfFun.setFont(new Font("Arial",Font.BOLD,10));
		this.jtfFun.setEditable(false);
		this.jtfFun.setPreferredSize(new Dimension(180,25));
		
		//Añadir Listeners
		
		this.jbtAceptar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jrb1.isSelected() == true) {
					pg.setNumsFx(1);
					pg.repaint();
					jlcons.setVisible(true);
					jtfcons.setVisible(true);
					jlx1.setVisible(true);
					jtfx1.setVisible(true);
					//---------------------
					jlx2.setVisible(false);
					jtfx2.setVisible(false);
					jlx3.setVisible(false);
					jtfx3.setVisible(false);
					//---------------------
					
				}
				else if(jrb2.isSelected() == true) {
					pg.setNumsFx(1);
					pg.repaint();
					jlcons.setVisible(true);
					jtfcons.setVisible(true);
					jlx1.setVisible(true);
					jtfx1.setVisible(true);
					jlx2.setVisible(true);
					jtfx2.setVisible(true);
					//---------------------
					jlx3.setVisible(false);
					jtfx3.setVisible(false);
					//---------------------
					
				}
				else if(jrb3.isSelected() == true) {
					pg.setNumsFx(1);
					pg.repaint();
					jlcons.setVisible(true);
					jtfcons.setVisible(true);
					jlx1.setVisible(true);
					jtfx1.setVisible(true);
					jlx2.setVisible(true);
					jtfx2.setVisible(true);
					jlx3.setVisible(true);
					jtfx3.setVisible(true);
					
				}
			}
		});
		
		this.jtfx1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pg.setFuncion(2);
				pg.setGrado(2);
				pg.setValorFuncion(1, Integer.parseInt(jtfcons.getText()));
				pg.setValorFuncion(0, Integer.parseInt(jtfx1.getText()));
				pg.repaint();
				jtfFun.setText("f(x) = " + jtfx1.getText() + "x + (" + jtfcons.getText() + ")");
			}
		});
		
		this.jtfx2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pg.setFuncion(3);
				pg.setGrado(3);
				pg.setValorFuncion(2, Integer.parseInt(jtfcons.getText()));
				pg.setValorFuncion(1, Integer.parseInt(jtfx1.getText()));
				pg.setValorFuncion(0, Integer.parseInt(jtfx2.getText()));
				pg.repaint();
				jtfFun.setText("f(x) = " + jtfx2.getText() + "x^2 +(" + jtfx1.getText() + ")x + (" + jtfcons.getText() + ")");
			}
		});
		
		this.jtfx3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pg.setFuncion(4);
				pg.setGrado(4);
				pg.setValorFuncion(3, Integer.parseInt(jtfcons.getText()));
				pg.setValorFuncion(2, Integer.parseInt(jtfx1.getText()));
				pg.setValorFuncion(1, Integer.parseInt(jtfx2.getText()));
				pg.setValorFuncion(0, Integer.parseInt(jtfx3.getText()));
				pg.repaint();
				jtfFun.setText("f(x) = " + jtfx3.getText() + "x^3 + (" + jtfx2.getText() + ")x^2 +(" + jtfx1.getText() + ")x + (" + jtfcons.getText() + ")");
			}
		});
		
		this.panelColor.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				Color colorfx = JColorChooser.showDialog(PanelControlesGrafica.this, "Selecciona el color de la Funcion", pg.getBackground());
				pg.setColorFx(colorfx);
				panelColor.setBackground(colorfx);
				pg.repaint();
			}
		});
		
		this.jbtMenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new VentanaPrincipal();
				close();
			}
		});
		
		//Añadir los componentes al Panel
		this.add(this.jrb1);
		this.add(this.jrb2);
		this.add(this.jrb3);
		this.add(this.jbtAceptar);
		this.add(this.jlcons);
		this.add(this.jtfcons);
		this.add(this.jlx1);
		this.add(this.jtfx1);
		this.add(this.jlx2);
		this.add(this.jtfx2);
		this.add(this.jlx3);
		this.add(this.jtfx3);
		this.add(this.jtfFun);
		this.add(this.jbtGraf);
		this.add(this.panelColor);
		this.add(this.jbtMenu);
		
	}
	
	public void close() {
		((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
	}
}
