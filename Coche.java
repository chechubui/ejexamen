public class Coche{
	//atributo
	
	private double cantidad;
	private double consumo;
	
	//getters
	public double getCantidad(){
		return this.cantidad;
		
		}
	public double getConsumo(){
		return this.consumo;
	
		}
	public double getNumeroskm(){
		return this.cantidad*100/ this.consumo;
		
		}
	//setters
	public void setCantidad(double cantidad){
			this.cantidad=cantidad;
		
		}
	public void setConsumo(double consumo){
		this.consumo=consumo;
		
		}
	
	//este metodo no lo solicita el ejercicio
	// método que ajusta el consumo despues de recorrer
	// cierta distancia
	
	public void combustibleRestante(double km){
			this.cantidad -= km * this.consumo/100;
			//this.cantidadRestante = this.cantidadRestante -(km * this.consumo/100)
			
			//variable que me dice (TRUE o FALSE) si se puede puede hacer ese trayecto
			boolean posibleTrayecto =this.cantidad >=0;
			System.out.println("¿Puede realizar el trayecto de "+km+" km?"+posibleTrayecto);
		}
	
}

class TestCoche{
	public static void main (String args[]){
	
	Coche c1=new Coche();
	c1.setCantidad(5);
	c1.setConsumo(4.5);
	System.out.println("Le metemos al coche "+c1.getCantidad()+" el consumo del coche  : "+c1.getConsumo()+" \n Entonces el coche Puede recorrer "+c1.getNumeroskm());
	 
	Coche c2=new Coche();
	c2.setCantidad(5);
	c2.setConsumo(6.5);
	
	System.out.println("Le metemos al coche "+c2.getCantidad()+" el consumo del coche  : "+c2.getConsumo()+" \n Entonces el coche Puede recorrer "+c2.getNumeroskm()); 
	
	//el coche c1 y c2 recorren 100 KM
	c1.combustibleRestante(km);
	c2.combustibleRestante(km);
	
	System.out.println("El coche c1 le queda de combustible"+c1.getConsumo()+"litros");
	System.out.println("El coche c2 le queda de combustible"+c2.getConsumo()+"litros");
}
	
	
	}
