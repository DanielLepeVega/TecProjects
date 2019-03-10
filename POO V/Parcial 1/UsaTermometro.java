public class UsaTermometro{
	public static void main(String[] args){
		Termometro gda=new Termometro();
		Termometro mty=new Termometro(30);
		Termometro dub=new Termometro(34);

		System.out.println("La temperatura en Guadalajara es: " + gda.getTemp());
		System.out.println("La temperatura en Monterrey es: " + mty.getTemp());
		System.out.println("La temperatura en Dubai es: " + dub.getTemp());

		gda.setTemp(29);
		dub.setTemp(38);
		mty.setTemp(33);

		System.out.println("La temperatura en Guadalajara es: " + gda.getTemp());
		System.out.println("La temperatura en Monterrey es: " + mty.getTemp());
		System.out.println("La temperatura en Dubai es: " + dub.getTemp());		
	}
}