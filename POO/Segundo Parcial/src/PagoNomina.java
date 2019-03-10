//Daniel Lepe Vega
//A01633986

import java.io.*;
import java.util.StringTokenizer;

public class PagoNomina {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\yo_da\\OneDrive - Instituto Tecnologico y de Estudios Superiores de Monterrey\\Daniel ITESM\\Segundo Semestre ITI\\POO\\Segundo Parcial\\horasTrabajadas.txt"));
		PrintWriter pw=new PrintWriter(new FileWriter("C:\\Users\\yo_da\\OneDrive - Instituto Tecnologico y de Estudios Superiores de Monterrey\\Daniel ITESM\\Segundo Semestre ITI\\POO\\Segundo Parcial\\nomina.csv"));
		StringTokenizer st;
		String linea;
		String nombre,
				apellido;
		int hrs;
		double tabulador;
		bf.readLine();
		pw.println("Apellido Nombre Pago");
		while((linea=bf.readLine())!=null) {
			st=new StringTokenizer (linea," ");
			nombre=st.nextToken();
			apellido=st.nextToken();
			hrs=Integer.parseInt(st.nextToken());
			tabulador=Double.parseDouble(st.nextToken());
			pw.println(apellido + " " + nombre + " " + hrs*tabulador);
		}
		bf.close();
		pw.close();
	}
}
