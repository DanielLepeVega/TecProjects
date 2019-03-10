public class MaximoComunDivisor{
	public static void mcd(int x,int y){
		int mcd=0,
			xx,
			yy,
			n=1;
		while(n<=x && n<=y){
			xx=x%n;
			yy=y%n;
			if(xx==0 && yy==0){
				n++;
				mcd=n;
			}
			else{
				n++;
			}
		}
		mcd=mcd-1;
		System.out.println("El mcd de " + x + " y de " + y + " es " + mcd);
	}
	
	public static void main(String[] args){
		mcd(27,81);
	}
}