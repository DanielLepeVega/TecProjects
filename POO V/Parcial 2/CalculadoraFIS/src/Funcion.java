//A01209423 Miguel Ángel Grimaldo Martinez
//A01633986 Daniel Lepe Vega
//POO
//23-06-2018
// 50-50

import java.awt.Color;
import java.awt.Graphics;

public class Funcion {

	private int nums,
				grado;
	public int[] fun,
					valX,
					valY;
	private Color colorFx;
	
	public Funcion(int num) {
		this.fun = new int[num];
		this.nums = 1;
		this.grado = 2;
		this.colorFx = Color.RED;
		this.valX = new int[17];
		this.valY = new int[17];
	}
	
	public int getTamFun() {
		return this.fun.length;
	}
	
	public void setValorFun(int pos,int num) {
		this.fun[pos] = num;
	}
	
	public void setColor(Color color) {
		this.colorFx = color;
	}
	
	public Color getColor() {
		return this.colorFx;
	}
	
	public void setGrado(int num) {
		this.grado = num;
	}
	
	public int getGrado() {
		return this.grado;
	}
	
	
	public int getNums() {
		return this.nums;
	}
	
	public void setNums(int num) {
		this.nums = num;
	}
	
	
	public void tabulaFunLineal() {
		for(int i=0;i<this.valY.length;i++) {
			this.valX[i] = ((i-8)*this.nums);
			this.valY[i] = (this.valX[i])*this.fun[0] + this.fun[1]; 
		}
	}
	
	public void tabulaFunCuad() {
		for(int i=0;i<this.valY.length;i++) {
			this.valX[i] = ((i-8)*this.nums);
			this.valY[i] = (int) (this.fun[0]*Math.pow(this.valX[i],2) + this.valX[i]*this.fun[1] + this.fun[2]); 
		}
	}
	
	public void tabulaFunCub() {
		for(int i=0;i<this.valY.length;i++) {
			this.valX[i] = ((i-8)*this.nums);
			this.valY[i] = (int) (this.fun[0]*Math.pow(this.valX[i],3) + this.fun[1]*Math.pow(this.valX[i],2) + this.valX[i]*this.fun[2] + this.fun[3]); 
		}
	}
	
}
