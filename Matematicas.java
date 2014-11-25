public class Matematicas {
	//atributos
	private double numero;	
	//private double numero2;
	
	//getter
	public double getNumero(){
		return this.numero;
		}
		
	/*public double getNumero2(){
		return this.numero2;
		}*/
		
	//setters
	public void setNumero(double numero){
		this.numero=numero;
		}
	
	/*public void setNumero2(double numero2){
		this.numero2=numero2;
		}*/
		
	//metodo raiz 
	public double raiz(){
		return Math.sqrt(this.numero);
		
		}
	//metodo cubica
	public double cubica(){
		return Math.cbrt(Math.abs(this.numero));
	}
	/*//valor absoluto
	public double valorabsoluto(){
		return Math.abs(this.numero);	
	}
	//valor maximo de los numeros
	public double max(){
		return Math.max(this.numero,this.numero2);	
	}
	//valor minimo de los numeros
	public double min(){
		return Math.min(this.numero,this.numero2);	
	}*/
	//valor aleatorio de los numeros
	public double aleatorio(){		//tambien se le puede poner long para que salga sin .0
		return Math.round(Math.random()*numero);	
	}
	//redondeo
	public long redondeo(){      //se pone long para que el numero que me de no salga .0
		return Math.round(Math.abs(this.numero));	
	}

	
}

class TestMatematicas{
	public static void main (String args[]){
		Matematicas m1=new Matematicas();
		//Matematicas m2=new Matematicas();
		m1.setNumero(9);
		System.out.println("\nel numero introducido es: "+m1.getNumero());
		System.out.println("la raiz cuadrada es :"+m1.raiz());
		m1.setNumero(-27);
		System.out.println("\nEl nuemero ahora es  :"+m1.getNumero());
		System.out.println("la raiza cubica es :"+m1.cubica());
		/*m1.setNumero(-3);
		System.out.println("El nuemero ahora es  :"+m1.getNumero());
		System.out.println("la raiza cubica es :"+m1.valorabsoluto());
		m1.setNumero(3.2);
		m1.setNumero2(3);
		System.out.println("El numero mayor es :"+m1.max());
		System.out.println("El numero menor es :"+m1.min());*/
		m1.setNumero(3.3);
		System.out.println("\nEl numero aleatorio es :"+m1.aleatorio());
		m1.setNumero(-2.4659);
		System.out.println("\nEl numero ahora es  :"+m1.getNumero());
		System.out.println("El numero Redondeado es :"+m1.redondeo());
		
		
		}	
}


