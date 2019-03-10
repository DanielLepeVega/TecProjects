import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EjemploEscritor {

	public static void main(String[] args) {
		try {
			PrintWriter pw=new PrintWriter(new FileWriter("C:\\Users\\yo_da\\OneDrive - Instituto Tecnologico y de Estudios Superiores de Monterrey\\Daniel ITESM\\Segundo Semestre ITI\\POO\\Segundo Parcial\\nuevo.txt"));
			pw.println("Este es un archivo de texto");
			for(int i=0;i<10;i++) {
				pw.println(i+1+")");
			}
			pw.close();
		}
		catch(IOException e) {
			System.out.println("No se pudo escribir en el archivo");
		}
	}
}
