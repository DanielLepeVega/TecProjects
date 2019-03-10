import javax.swing.*;
public class EjemploException {
	 public void metodoD() throws Exception {
		 throw new Exception("Excepcion");
	 }
	 
	 public void metodoC() throws Exception {
		 metodoD();
	 }
	 
	 public void metodoB() throws Exception {
		 metodoC();
	 }
	 
	 public void metodoA() throws Exception {
		 metodoB();
	 }
	 
	 public static void main(String[] args) {
		 try {
			 EjemploException ee=new EjemploException();
			 ee.metodoA();
		 }
		 catch(Exception ee) {
			 JOptionPane.showMessageDialog(null,ee.getMessage());
		 }
		 
	 }
}
