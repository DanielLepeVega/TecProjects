public class Termometro{
	private int temp;

	public Termometro(){
		temp=30;
	}
	
	public Termometro(int t){
		temp=t;
	}

	public void setTemp(int t){
		temp=t;
	}

	public int getTemp(){
		return temp;
	}
}