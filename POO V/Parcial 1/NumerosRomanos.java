//Daniel Lepe Vega
//A01633986
//Programación Orientada a Objetos
//29 de mayo de 2018

public class NumerosRomanos{
	
	public static String convierteValor(int x){
		String res = "";
		int M=x/1000;
		for(int i=0;i<M;i++){
			res+="M";
		}
		x-=M*1000;
		if(x>=500){
			if(x>=900){
				res += "CM";
				x -= 900;
			}
			else{
				res += "D";
				x -= 500;
			}
		}
		int C=x/100;
		if(C<4){
			for(int i=0;i<C;i++){
			res+="C";
			}
			x-=C*100;
		}
		else{
			res+="CD";
			x -= 400;
		}
		if(x>=50){
			if(x>=90){
				res += "XC";
				x -= 90;
			}
			else{
				res += "L";
				x -= 50;
			}
		}
		int X=x/10;
		if(X<4){
			for(int i=0;i<X;i++){
			res+="X";
			}
			x-=X*10;
		}
		else{
			res+="XL";
			x -= 40;
		}
		if(x>=5){
			if(x==9){
				res += "IX";
				x -= 9;
			}
			else{
				res += "V";
				x -= 5;
			}
		}
		if(x<4){
			for(int i=0;i<x;i++){
			res+="I";
			}
			x-= x;
		}
		else{
			res+="IV";
			x -= x;
		}
		
		return res;
	}
	
	public static void main(String[] args){
		String z=convierteValor(2851);
		System.out.println(z);
	}
	
}

