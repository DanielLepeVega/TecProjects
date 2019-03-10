//Daniel Lepe Vega
//A01633986
//Programación Orientada a Objetos

public class Libro{

	private String titulo;
	private String autor;
	private String editorial;
	private String isbn;

	public Libro(){
		titulo="Titulo";
		autor="Autor";
		editorial="Editorial";
		isbn="ISBN";
	}

	public Libro(String tit, String aut, String edi, String isb){
		titulo=tit;	
		autor=aut;
		editorial=edi;
		isbn=isb;
	}

	public void setTitulo(String tit){
		titulo=tit;
	}
		
	public void setAutor(String aut){
		autor=aut;
	}

	public void setEditorial(String edi){
		editorial=edi;
	}

	public void setIsbn(String isb){
		isbn=isb;
	}

	public String getTitulo(){
		return titulo;
	}

	public String getAutor(){
		return autor;
	}

	public String getEditorial(){
		return editorial;
	}

	public String getIsbn(){
		return isbn;
	}

	public static void main(String[] args){
	Libro HarryPotter = new Libro();
	Libro ProgramandoAndo = new Libro("Programando Ando","El Mero Mero","Lepe","jkl");

	System.out.println(HarryPotter.getTitulo() +" "+ HarryPotter.getAutor());
	System.out.println(ProgramandoAndo.getEditorial() + " " + ProgramandoAndo.getIsbn());

	HarryPotter.setTitulo("Hola que tal");
	HarryPotter.setAutor("J.K.Rowling");	

	System.out.println(HarryPotter.getTitulo() +" "+ HarryPotter.getAutor());
	}

}

