public class Libros{
	private String titulo;
	private String isbn;
	private String autor;
	private boolean disponible=true;
	
//constructor

	public Libros (String autor,String isbn, String titulo){
			this.titulo=titulo;
			this.autor=autor;
			this.isbn=isbn;
		}
	public String getTitulo(){
		return this.titulo;
		
		}
	
	public String getAutor(){
		
		return this.autor;
		
		}
		
	public String getIsbn(){
		
		return this.isbn;
		}
	
	public boolean getDisponible(){
		
		return this.disponible;
		}
	public void setIsbn(String isbn){
			this.isbn=isbn;
		
		}
	public void prestar(){
		
		this.disponible=false;
		
		}
@Override
	public String toString(){
		
		return "Libros":+this.autor+"de isbn"+this.isbn+"de titulo"+this.titulo;
		}
}
