//Daniel Lepe Vega
//A01633986

public class Clase{
	private String titulo,
			autor,
			editorial,
			isbn;
	
	public Clase(){
		titulo="Programming for dummies";
		autor="Daniel Lepe";
		editorial="TEC";
		isbn="12345";
	}
	
	public Clase(String tit, String aut, String edit, String is){
		titulo=tit;
		autor=aut;
		editorial=edit;
		isbn=is;	
	}

	public void setTitulo(String tit){
		titulo=tit;
	}

	public String getTitulo(){
		return titulo;
	}	

	public void setAutor(String aut){
		autor=aut;
	}

	public String getAutor(){
		return autor;
	}

	public void setEditorial(String edit){
		editorial=edit;
	}

	public String getEditorial(){
		return editorial;
	}

	public void setIsbn(String is){
		isbn=is;
	}

	public String getIsbn(){
		return isbn;
	}	
	
	public static void main(String[] args){
	
		Clase libro_1= new Clase();
		
		System.out.println(libro_1.getTitulo());
		System.out.println(libro_1.getAutor());
		System.out.println(libro_1.getEditorial());
		System.out.println(libro_1.getIsbn());
		
		Clase libro_2= new Clase("Programacion 1", "Daniel Lepe Vega", "TECGDA", "13");
		
		System.out.println(libro_2.getTitulo());
		System.out.println(libro_2.getAutor());
		System.out.println(libro_2.getEditorial());
		System.out.println(libro_2.getIsbn());
		
		libro_1.setTitulo("La vida");
		libro_1.setEditorial("TEC CDMX");
		libro_1.setAutor("Miguel Grim");
		libro_1.setIsbn("89");

		
		System.out.println(libro_1.getTitulo());
		System.out.println(libro_1.getAutor());
		System.out.println(libro_1.getEditorial());
		System.out.println(libro_1.getIsbn());

	}	

}
