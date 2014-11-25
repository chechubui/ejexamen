import javax.swing.JOptionPane;
public class Sueldo {
	//atributos
	private String nombre;
	private double horas; //horas que trabaja a la semana
	private double sueldoBruto; // sueldo bruto por semana
	private double deduccionHacienda; // en porcentaje
	private double deduccionSocial; // en porcentaje
	
	//geters
	 public String getNombre(){
		 return this.nombre;
		 
		 }
	public double getHoras(){
		 return this.horas;
		 
		 }	 
	
	public double getSueldoBruto(){
		 return this.sueldoBruto;
		 
		 }	
	
	public double getDeduccionHacienda(){
		 return this.deduccionHacienda;
		 
		 }
	
	public double  getDeduccionSocial(){
		 return this.deduccionSocial;
		 
		 }
		
	//setters
	
	public void setNombre (String nombre){
			this.nombre=nombre;
		
		}
	public void setHoras (double horas){
			this.horas=horas;
		
		}
	public void setSueldoBruto (double sueldo){
			this.sueldoBruto=sueldo;
		
		}
	
	public void setDeduccionHacienda (double hacienda){
			this.deduccionHacienda=hacienda;
		
		}
	
	public void setDeduccionSocial (double ss){
			this.deduccionSocial=ss;
		
		}
		
	//sueldo bruto
	public double sueldoBrutoTotal(){
		return this.sueldoBruto*this.horas;
		}
	
	//deducciones totales
	
	public double deduccionTotal(){
		return (this.deduccionHacienda+this.deduccionSocial)/100*this.sueldoBrutoTotal();
		
		}
		
	// Sueldo neto por semana
	
	public double sueldoNeto(){
		return this.sueldoBrutoTotal()-this.deduccionTotal();
		
		}	
	@Override
	public String toString(){
		return  "Nombre "+this.nombre+"\nSueldo Bruto semanal "+this.sueldoBrutoTotal()+"\nDeduccion Semanal total "+this.deduccionTotal()+"\nSueldo Neto "+this.sueldoNeto();
		
		}
}

class TestSueldo{
	public static void main (String args[]) {
		Sueldo s1= new Sueldo();
		String nombre= JOptionPane.showInputDialog("Introduce el Nombre : "); // no llamo a nombre otra vez porque es un String y no tengo que cambiarlo a double
		String hors = JOptionPane.showInputDialog("Introduce numero de Horas: ");
		String sueldo = JOptionPane.showInputDialog("Sueldo Bruto por hora: ");
		String deducHacien = JOptionPane.showInputDialog("Deduccion para hacienda: ");
		String deducSocial = JOptionPane.showInputDialog("Deduccion a la seguridad social: ");
		double horas = Double.parseDouble(hors);
		double sueldoBruto= Double.parseDouble(sueldo);
		double deduccionHacienda= Double.parseDouble(deducHacien);
		double deduccionSocial= Double.parseDouble(deducSocial);
		s1.setNombre(nombre);
		s1.setHoras(horas);
		s1.setSueldoBruto(sueldoBruto);
		s1.setDeduccionHacienda(deduccionHacienda);
		s1.setDeduccionSocial(deduccionSocial);
		JOptionPane.showMessageDialog(null,s1,"Informacion del trabajador",JOptionPane.INFORMATION_MESSAGE);
		System.out.println(s1);
		/*JOptionPane.showMessageDialog(null,s1.sueldoBrutoTotal(),"Sueldo Bruto",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,s1.deduccionTotal(),"Deduccion Total",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,s1.sueldoNeto(),"Sueldo Neto",JOptionPane.INFORMATION_MESSAGE);*/
		System.out.println("Sueldo Bruto: "+s1.sueldoBrutoTotal());
		System.out.println("Deduccion Total: "+s1.deduccionTotal());
		System.out.println("Sueldo Neto: "+s1.sueldoNeto());
		
		
		
		
	
	
	
	}
	
	
	
}








