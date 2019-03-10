public class Termometro{
	private int temp;
	
	public Termometro(){
		temp=26;
	}

	public Termometro(int t){
		temp=t;
	}
	
	public int getTemp(){
		return temp;
	}

	public void setTemp(int t){
		temp=t;
	}
}