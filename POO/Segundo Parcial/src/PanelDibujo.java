import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.Image;
import javax.swing.*;

public class PanelDibujo extends JPanel implements Runnable{

	private int xV, 
				yV, 
				xL, 
				yL;
	private Image fondo;
	private String strNombre;
	private boolean movimiento;
	private Color color1;

	public PanelDibujo() {
		super();
		this.setPreferredSize(new Dimension(800,600));	
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Se dio un click " + e.getX() + e.getY());
				new Thread().start();
				movimiento=true;
			}
		});
		
		this.addMouseMotionListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent e) {
				xL=e.getX();
				yL=e.getY();
				repaint();
			}
		});
		this.xV=this.yV=0;
		this.xL=100;
		this.yL=570;
		this.fondo=new ImageIcon("images.jpg").getImage();
		this.strNombre = "Pocoyo";
		this.movimiento=false;
		this.color1=Color.RED;
		Thread hilo=new Thread(this);
	}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		g.drawImage(this.fondo,0,0,this.getWidth(),this.getHeight(),this);
		g.setColor(Color.ORANGE);
		g.fillOval(50+this.xV, 500+this.yV, 200, 100);
		g.setColor(Color.BLACK);
		g.drawString("Vamos " + this.strNombre, this.xL, this.yL);
		
		g.setColor(Color.CYAN);
		g.fillArc(50+this.xV, 500+this.yV, 200, 100, 0, 115);
		g.setColor(Color.BLACK);
		g.drawLine(100+this.xV, 507+this.yV, 100+this.xV, 407+this.yV);
		g.setColor(this.color1);
		g.fillOval(50+this.xV, 307+this.yV, 100, 100);
	}
	
	public void setNombre(String nombre) {
		this.strNombre=nombre;
		repaint();
	}
	
	public void setColorg(Color color) {
		this.color1=color;
	}
	
	public void run() {
		try {
			while(this.xV <550) {
				if(this.movimiento) {
					this.xV+=2;
					this.yV--;
					repaint();			
				}
				Thread.sleep(10);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Error en sleep " + e);
		}
	}

}
