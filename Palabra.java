//ejercicio 4.2
public class Palabra {
	
	//atributo
	private String contenido;
	
	//contructor
	public Palabra(String c){
		
		this.contenido=c;
		}	
	@Override
	public String toString(){
		return ""+this.contenido;
		}
	//metodo de mayuscula
	public String mayuscula(){
		return this.contenido.toUpperCase();//aqui lo hacemos mayuscula
		}
		
	//metodo minuscula
	public String minuscula(){
		return this.contenido.toLowerCase();//aqui lo hacemos minuscula
		}	
		
	//metodo para remplazo de palabras
	public String reemplazar(char vieja,char nueva){
		return this.contenido.replace(vieja,nueva);
		}
	public char empiezaPor1(){
		return this.contenido.charAt(0);
		
		}	
	public String empiezaPor2(){
		return this.contenido.substring(0,1);
		
		}
		
		public int numeroCaracteres(){  // te cuenta todo
		return this.contenido.length();
		}	
		
		// metodo para quitar espacios en blanco al principio y al final
	public String eliminaBlancosPrincipioFinal(){
			return this.contenido.trim();
		
		}
		// metodo que elimina todos los espacios en blanco
	public String eliminaTodosBlancos(){
			return this.contenido.replace(" ","");
		
		}	
		
		public char acabaPor(){
			return this.contenido.charAt(this.contenido.length()-1);
			//otra forma de hacerlo return this.contenido.charAt(this.numeroCaracteres()-1)
			}		
		public String acabaPor2(){
			return this.contenido.substring(this.contenido.length()-1);
			//otra forma de hacerlo return this.contenido.substring(this.contenido.length()-1,this.contenido.length());
			}	
}

class TestPalabra{

	public static void main (String args[]) {
	
	Palabra  p1=new Palabra(" Esto es una cadena ");
	System.out.println(p1);
	System.out.println("\nLa palabra en mayuscula "+p1.mayuscula()); 
	System.out.println(p1);
	System.out.println("\nLa palabra en miniscula "+p1.minuscula());
	System.out.println("\nReemplazar e i :"+p1.reemplazar('e','i'));//remplazo de letras
	System.out.println(p1);
	System.out.println("\nEmpieza por: "+p1.empiezaPor1());
	System.out.println("Empieza por: "+p1.empiezaPor2());
	
	System.out.println("\nNumero de letras "+p1.numeroCaracteres());
	System.out.println("\nUltima letra "+p1.acabaPor());
	System.out.println("\nUltima letra "+p1.acabaPor2());
	
	System.out.println("\nquitando espacio al principio y al final:\n"+ p1.eliminaBlancosPrincipioFinal());
	System.out.println("\nquitando todos los espacion:\n"+p1.eliminaTodosBlancos());
	
	
	}
}

