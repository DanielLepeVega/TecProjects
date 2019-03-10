public class Clock{

	private int hr, 
			min, 
			sec;
	private String cd;
	
	public Clock(){
		this(12,0,0,"CDMX");
	}
	public Clock(int hr, int min, int sec, String cd){
		this.setTime(hr,min,sec);
		this.cd = cd;
	}

	pubic void setCiudad(String cd){
		this.cd = cd;	
	}

	public String getCd(){
		return this.cd;
	}
	
	public void setTime(int hr, int min, int sec){
		if(hr>=0 && hr<24){
			this.hr = hr;
		}
		else{
			this.hr = 12;
		}		
		if(min>=0 && min<24){
			this.min = min;
		}
		else{
			this.min = 0;
		}
		if(sec>=0 && sec<60){
			this.sec = sec;
		}
		else{
			this.sec = 0;
		}
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

	public void printTime(){
		System.out.println("La hora en " + this.cd + "es"this.hr + ":" + this.min + ":" + this.sec);
	}

	public void incrementHours(){
		//this.hr=++this.hr%24;
		if(this.hr==23){
			this.hr = 0;
		}
		else{
			this.hr++;
		}
	}

	public void incrementMinutes(){
		this.min=(this.min+1)%60;
		if(this.min==0){
			this.incrementHours();
		}
	}

	public void incrementSeconds(){
		this.sec=++this.sec%60;
		if(sec==0){
			this.incrementMinutes();
		}
	}

	public boolean equals(Clock reloj){
		if(this.hr == reloj.hr && this.min == reloj.min && this.sec == reloj.sec){
			return true;
		}
		else{
			return false;
		}
		//return this.hr == reloj.hr && this.min == reloj.min && this.sec == reloj.sec;
	}

	public void makeCopy(Clock reloj){
		this.hr = reloj.hr;
		this.min = reloj.min;
		this.sec = reloj.sec;
		//this.setTime(reloj.hr,reloj.min,reloj.sec);
	}

	public Clock getCopy(){
		return new Clock(this.hr,this.min,this.sec,this.cd);
	}

	public String toString(){
		return "La hora en " + this.cd + "es"this.hr + ":" + this.min + ":" + this.sec;
	}

}