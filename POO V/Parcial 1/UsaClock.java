public class UsaClock{
	
	public static void main(String[] args){
		Clock gda = new Clock();
		Clock mty = new Clock();
		
		gda.printTime();

		gda.setTime(10,14,16);
		gda.printTime();

		gda.incrementHours();
		gda.printTime();

		mty = gda.getCopy();

		System.out.println("La hora en gdl es la misma que en mty " + gda.equals(mty));	
	}
}