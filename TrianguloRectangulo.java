import javax.swing.JOptionPane;
public class TrianguloRectangulo {
	
	//atributos
	private double cateto1; 
	private double cateto2; 
	
	//getters 
	public double getCateto1(){
		return this.cateto1;
		}
		
	public double getCateto2(){
		return this.cateto2;
		}
	//setters
	
	public void setCateto1(double cateto1){
		this.cateto1=cateto1;
		}
	
	public void setCateto2(double cateto2){
		this.cateto2=cateto2;
		}
		
	@Override
	public String toString(){
		return  "El Cateto1 "+this.cateto1+"\nCateto2 "+this.cateto2;
		
		}
	
	//metodo hipotenusa
	
	public double hipotenusa(){
		return Math.hypot(this.cateto1,this.cateto2);
	
	}
	
	public double area(){
		return (this.cateto1*this.cateto2)/2;
	
	}
	public double perimetro(){
		return (this.cateto1+this.cateto2+this.hipotenusa());
	
	}
	
	
}
class TestTrianguloRectangulo{
	
	public static void main (String args[]) {
	TrianguloRectangulo t=new TrianguloRectangulo();
	String cat1 = JOptionPane.showInputDialog("Introduce el Cateto 1: ");
	String cat2 = JOptionPane.showInputDialog("Introduce el Cateto 2 ");
	double cateto1 = Double.parseDouble(cat1);
	double cateto2 = Double.parseDouble(cat2); 
	t.setCateto1(cateto1);
	t.setCateto2(cateto2);
	System.out.println(t);
	JOptionPane.showMessageDialog(null,t.hipotenusa(),"El resultado es de la hipotenusa",JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null,t.area(),"El resultado del area es ",JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null,t.perimetro(),"El resultado del perimetro",JOptionPane.WARNING_MESSAGE);
	System.out.println("la hipotenusa es: "+t.hipotenusa());
	System.out.println("El area es es: "+t.area());
	System.out.println("El perimetro es: "+t.perimetro());
	
	
		
	}
	
}
