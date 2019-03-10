//A01209423 Miguel Ángel Grimaldo Martinez
//A01633986 Daniel Lepe Vega
//POO
//23-06-2018
// 50-50

import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.geom.AffineTransform;

import javax.swing.JPanel;

public class PanelGrafica extends JPanel {
	
	private Funcion fx;
	private int nums,
				grado;
	
	public PanelGrafica() {
		super();
		this.setPreferredSize(new Dimension(1000,800));
		this.grado = 0;
		this.fx = new Funcion(this.grado);
		this.nums = 1;
	}
	
	public void setFuncion(int num) {
		this.fx = new Funcion(num);
	}
	
	public void setValorFuncion(int pos, int num) {
		this.fx.setValorFun(pos, num);
	}
	
	public void setGrado(int num) {
		this.grado = num;
	}
	
	public int getGrado() {
		return this.grado;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.setStroke(new BasicStroke((float)5.0));
		g2d.drawLine(500, 0, 500, 1000);
		g2d.drawLine(0, 400, 1000, 400);
		//Numeros
		g.setColor(Color.ORANGE);
		g.setFont(new Font("Arial",Font.BOLD,20));
		int v10 = 10;
		g.drawString("-" + (v10*this.getNumsFx()), 0, 380);
		for(int i=-10;i<-1;i++) {
			g.drawString("" + (i+1)*this.getNumsFx(), 540 + (i*50), 380);
		}
		for(int i=0;i<9;i++) {
			g.drawString("" + (i+1)*this.getNumsFx(), 540 + (i*50), 380);
		}
		g.drawString("" + (v10*this.getNumsFx()), 980, 380);
		int v8 = 8;
		g.drawString("" + (v8*this.getNumsFx()), 510, 15);
		for(int i=0;i<8;i++) {
			g.drawString("" + (i+1)*this.getNumsFx(), 510, (-50*i)+350);
		}
		for(int i=0;i<7;i++){
			g.drawString("-" + (i+1)*this.getNumsFx(), 510,(i*50) + 450);
		}
		g.drawString("-" + (v8*this.getNumsFx()),510,790);
		//Linea x+ 
		g.setColor(Color.BLACK);
		g.drawLine(550, 390, 550, 410);
		g.drawLine(600, 390, 600, 410);
		g.drawLine(650, 390, 650, 410);
		g.drawLine(700, 390, 700, 410);
		g.drawLine(750, 390, 750, 410);
		g.drawLine(800, 390, 800, 410);
		g.drawLine(850, 390, 850, 410);
		g.drawLine(900, 390, 900, 410);
		g.drawLine(950, 390, 950, 410);
		g.drawLine(1000, 390, 1000, 410);
		//Linea x- 
		g.drawLine(450, 390, 450, 410);
		g.drawLine(400, 390, 400, 410);
		g.drawLine(350, 390, 350, 410);
		g.drawLine(300, 390, 300, 410);
		g.drawLine(250, 390, 250, 410);
		g.drawLine(200, 390, 200, 410);
		g.drawLine(150, 390, 150, 410);
		g.drawLine(100, 390, 100, 410);
		g.drawLine(50, 390, 50, 410);
		g.drawLine(0, 390, 0, 410);
		//Linea y+
		g.drawLine(490, 350, 510, 350);
		g.drawLine(490, 300, 510, 300);
		g.drawLine(490, 250, 510, 250);
		g.drawLine(490, 200, 510, 200);
		g.drawLine(490, 150, 510, 150);
		g.drawLine(490, 100, 510, 100);
		g.drawLine(490, 50, 510, 50);
		g.drawLine(490, 0, 510, 0);
		//Linea y-
		g.drawLine(490, 450, 510, 450);
		g.drawLine(490, 500, 510, 500);
		g.drawLine(490, 550, 510, 550);
		g.drawLine(490, 600, 510, 600);
		g.drawLine(490, 650, 510, 650);
		g.drawLine(490, 700, 510, 700);
		g.drawLine(490, 750, 510, 750);
		g.drawLine(490, 800, 510, 800);
		
		if(this.grado == 2) {
			this.pintaFunLin(g);
			this.repaint();
		}
		else if(this.grado == 3) {
			this.pintaFunCuad(g);
			this.repaint();
		}
		else if(this.grado == 4){
			this.pintaFunCub(g);
			this.repaint();
		}
	}
	
	public void setNums(int num) {
		this.nums = num;
	}
	
	public int getNums() {
		return this.nums;
	}
	
	public void setNumsFx(int num) {
		this.fx.setNums(num);
	}
	
	public int getNumsFx() {
		return this.fx.getNums();
	}

	public void setColorFx(Color color) {
		this.fx.setColor(color);
		this.repaint();
	}
	
	public Color getColorFx() {
		return this.fx.getColor();
	}

	public void pintaFunLin(Graphics g) {
		this.fx.tabulaFunLineal();
		this.setColorFx(this.getColorFx());
		g.setColor(this.getColorFx());
		for(int i=0;i<16;i++) {
			g.fillOval(100 + 50*i, -(50*(this.fx.valY[i]*this.getNumsFx())-400), 10, 10);
			g.drawLine(100 + 50*i, -(50*(this.fx.valY[i]*this.getNumsFx())-400), 100 + 50*(i+1), -(50*(this.fx.valY[i+1]*this.getNumsFx())-400));
		}
		this.repaint();
	}
	
	public void pintaFunCuad(Graphics g) {
		this.fx.tabulaFunCuad();
		this.setColorFx(this.getColorFx());
		g.setColor(this.getColorFx());
		for(int i=0;i<16;i++) {
			g.fillOval(100 + 50*i, -(50*(this.fx.valY[i]*this.getNumsFx())-400), 10, 10);
			g.drawLine(100 + 50*i, -(50*(this.fx.valY[i]*this.getNumsFx())-400), 100 + 50*(i+1), -(50*(this.fx.valY[i+1]*this.getNumsFx())-400));
		}
		this.repaint();
	}
	
	public void pintaFunCub(Graphics g) {
		this.fx.tabulaFunCub();
		this.setColorFx(this.getColorFx());
		g.setColor(this.getColorFx());
		for(int i=0;i<16;i++) {
			g.fillOval(100 + 50*i, -(50*(this.fx.valY[i]*this.getNumsFx())-400), 10, 10);
			g.drawLine(100 + 50*i, -(50*(this.fx.valY[i]*this.getNumsFx())-400), 100 + 50*(i+1), -(50*(this.fx.valY[i+1]*this.getNumsFx())-400));
		}
		this.repaint();
	}
	
}
