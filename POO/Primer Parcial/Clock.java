//Daniel Lepe Vega
//A01633986

public class Clock implements Comparable{
	private int hr,
		min,
		sec;
		
	private String cd;

	public Clock(){
		this(12,0,0,"Guadalajara");
	}

	public Clock(int hr, int min, int sec, String cd){
		this.setTime(hr,min,sec);
		this.cd=cd;
	}

	public void setTime(int hr, int min, int sec){
		if (hr>=0 && hr<24){
			this.hr=hr;
		}
		else{
			this.hr=12;
		}
		if (min>=0 && min<60){
			this.min=min;
		}
		else{
			this.min=0;
		}
		if (sec>=0 && sec<60){
			this.sec=sec;
		}
		else{
			this.sec=0;
		}
	}

	public void setCiudad(String cd){
		this.cd=cd;
	}
	
	public int getHours(){
		return this.hr;	
	}

	public int getMinutes(){
		return this.min;
	}

	public int getSeconds(){
		return this.sec;
	}

	public String getCiudad(){
		return this.cd;
	}

	public void printTime(){
		if(this.hr<10){
			System.out.print("0"+this.hr+":");
		}
		else{
			System.out.print(this.hr+":");
		}
		if(this.min<10){
			System.out.print("0"+this.min+":");
		}
		else{
			System.out.print(this.min+":");
		}
		if(this.sec<10){
			System.out.println("0"+this.sec);
		}
		else{
			System.out.println(this.sec);
		}
	}

	public String toString(){
		String resultado=this.cd+""+"\t";
		if(this.hr<10){
			resultado+="0"+this.hr+":";
		}
		else{
			resultado+=this.hr+":";
		}
		if(this.min<10){
			resultado+="0"+this.min+":";
		}
		else{
			resultado+=this.min+":";
		}
		if(this.sec<10){
			resultado+="0"+this.sec;
		}
		else{
			resultado+=this.sec;
		}
		return resultado;
	}
	public void incrementHours(){
		this.hr=++this.hr%24;
	}
	
	public void incrementMinutes(){
		this.min=++this.min%60;
		if(this.min==0){
			this.incrementHours();
		}
	}

	public void incrementSeconds(){
		this.sec=++this.sec%60;
		if(this.sec==0){
			this.incrementMinutes();
		}
	}
	
	public boolean equals(Clock reloj){
		return this.hr==reloj.getHours() && this.min==reloj.getMinutes() &&
this.sec==reloj.getSeconds();
	}

	public void makeCopy(Clock reloj){
	//	this.setTime(reloj.hr, reloj.min, reloj.sec);
		this.hr=reloj.hr;
		this.min=reloj.min;
		this.sec=reloj.sec;
		this.cd=reloj.cd;
	}

	public Clock getCopy(){
		return new Clock(this.hr,this.min,this.sec,this.cd);
	}	
	
	public int compareTo(object a) {
		Clock r2=(Clock)a;
		int time1=this.hr*3600+this.min*60+this.sec;
		int time2=r2.hr*3600+r2.min*60+r2.sec;
		return time1-time2;
	}
}