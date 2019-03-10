import java.io.*;
import java.util.StringTokenizer;

public class CalculaNomina {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("horasTrabajadas.txt"));
			PrintWriter pw = new PrintWriter(new FileWriter("NominaCalculada.csv"));
			String linea;
			String nombre,
					apellido;
			int hrs;
			double tabulador;
			StringTokenizer st;
			br.readLine();
			pw.println("Nombre Completo, Pago");
			while ((linea = br.readLine()) != null) {
				st = new StringTokenizer(linea);
				nombre = st.nextToken();
				apellido = st.nextToken();
				hrs = Integer.parseInt(st.nextToken());
				tabulador = Double.parseDouble(st.nextToken());
				pw.println(nombre + " " + apellido + ", " + hrs * tabulador);
			}	
			br.close();
			pw.close();
			System.out.println("Final");
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}
