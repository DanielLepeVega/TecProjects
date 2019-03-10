public class UsaClock{
	public static void main(String[] args){
		Clock gda=new Clock(9,7,20);
		Clock tij=new Clock(7,7,20);
		Clock ny=new Clock(10,7,20);
		Clock lon=new Clock(23,59,59);
		lon.incrementHours();
		lon.incrementSeconds();
		

		gda.printTime();
		tij.printTime();
		ny.printTime();
		lon.printTime();


		if(gda.equals(tij)){
			System.out.println("La hora en Gda y Tij son la misma");
		}
		else{
			System.out.println("La hora en Gda y Tij NO son la misma");
		}

		gda.makeCopy(tij);
		gda.printTime();

		Clock cdmx=gda.getCopy();
		cdmx.printTime();
		
		if(gda.compareTo(tij)==0) {
			System.out.println("Mismas horas en Gda y Tijuana");
		}
		else if(gda.compareTo(tij)<0) {
			System.out.println("En Gda es más temprano que en Tijuana");
		}
		else {
			System.out.println("En Gda es más tarde que en Tijuana");
		}
	}
}