import java.io.*;

public class EjemploLector {

	public static void main(String[] args) {
		try {
			String linea;
			BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\yo_da\\OneDrive - Instituto Tecnologico y de Estudios Superiores de Monterrey\\Daniel ITESM\\Segundo Semestre ITI\\POO\\Segundo Parcial\\nuevo.txt"));
			linea=br.readLine();
			while(linea!=null) {
				System.out.println(linea);
				linea=br.readLine();
			}
			br.close();
		}
		catch(FileNotFoundException ex){
			System.out.println("No se encontro el archivo");
		}
		catch(IOException e) {
			System.out.println("No se pudo abrir el archivo");
		}
	}
}
