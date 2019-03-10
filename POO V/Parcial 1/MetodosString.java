import javax.swing.*;

public class MetodosString{
	public static void main(String[] args){
		String hola="Guadalajara";
		System.out.println("La longitud es: " + hola.length);
		int indice=hola.indexOf('d');
		System.out.println("La posición de la letra es: " + indice);
		indice=hola.indexOf('a');//La primera vez que aparezca 
		System.out.println("La posición de la letra es: " + indice);
		indice=hola.lastIndexOf('a');
		System.out.println("La posición de la letra es: " + indice);
		indice=hola.lastIndexOf('la');
		System.out.println("La posición de "\la\" es: " + indice);
		char letra=hola.charAt(7);
		System.out.println("En la posicion 7 se encuentra " + letra);
		System.out.println(hola.substring(4));	
		System.out.println(hola.substring(4,7));
		System.out.println("adrian".compareTo("arturo"));
		System.out.println("hola".substring(2));
		boolean contenido=hola.contains("laj");
		System.out.println("      Quitando caracteres extras     ".trim() + ".");
		System.out.println(hola.toUpperCase());
		System.out.println(hola.toLowerCase());
		String passwd = "Abretesesamo";
		String passwdUsr = JOptionPane.showInputDialog("Escribe la contraseña");
		if(passwd.equals(passwdUsr)){
			JOptionPane.showMessageDialog(null, "La contraseña es correcta"));
		}
		else{
			JOptionPane.showMessageDialog(null, "La contraseña es incorrecta"));
		}
	}
}