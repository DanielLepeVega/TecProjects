//Daniel Lepe Vega
//A01633986

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Copy {

	public void CopiarArchivo(String a, String b) throws IOException{
		BufferedReader bf=new BufferedReader(new FileReader(a));
		PrintWriter pw=new PrintWriter(new FileWriter(b));
		String linea;
		while((linea=bf.readLine())!=null) {
			pw.println(linea);
		}
		bf.close();
		pw.close();
	}
	
	public static void main(String[] args) throws IOException {
		Copy a=new Copy();
		a.CopiarArchivo(args[0], args[1]);
	}
}
