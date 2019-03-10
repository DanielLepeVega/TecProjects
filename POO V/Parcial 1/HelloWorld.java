import javax.swing.*;

public class HelloWorld{

	public static  void main(String[] args){
		String nombre=JOptionPane.showInputDialog("Dime tu nombre: ");
		System.out.println("Hola " + nombre);
	}
}