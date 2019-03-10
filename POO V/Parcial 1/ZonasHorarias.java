public class ZonasHorarias{
	private Clock[] zonasHorarias;
	
	public ZonasHorarias(){
		zonasHorarias = new Clock[10];
	}

	public void ponerHora(int pos, int hr, int min, int sec, String cd}{
		if(this.zonasHorarias[pos] == null){
			this.zonasHorarias[pos] = new Clock(hr,min,sec,cd);
		}
		else{
			this.zonasHorarias[pos].setTime(hr,min,sec);
			this.zonasHorarias[pos].setCd(cd);
		}
	}
	
	public String toString(){
		String res="";
		for(int i=0;i<this.zonasHorarias.length;i++){
			if(this.zonasHorarias[i] != null){
				res += this.zonasHorarias[i] + "\n";
			}
		}
		return res;
	}

	public void cambiarHorarioInvierno(){
		for(int i=0;i<this.zonasHorarias.length;i++){
			if(this.zonasHorarias[i] != null){
				this.zonasHorarias[i].incrementHours();
			}
		}
	}

	public static void main(String[] args){
		ZonasHorarias zh = new ZonasHorarias;
		zh.ponerHora(0,19,15,30,"Guadalajara");
		zh.ponerHora(1,1,15,30,"Lóndres");
		zh.ponerHora(2,9,15,30,"Tokio");
		zh.ponerHora(3,4,15,30,"Dubai");
		System.out.println(zh);
		zh.ponerHora(0,33,15,"Guadalajara");
		System.out.println(zh);
		zh.cambiarHorarioInvierno();
		System.out.println(zh);
	}

}