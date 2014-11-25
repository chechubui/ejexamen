//ecuacion de segundo grado


public class EcuacionSegundoGrado {
	
	//atributos
	private double a;
	private double b;
	private double c;
	
	//constructor
	public EcuacionSegundoGrado(double a, double b, double c){
		this.a=a;
		this.b=b;
		this.c=c;
			
		}
	public boolean esResoluble(){
		return Math.pow(this.b,2)-4*this.a*this.c >=0;
		
		}
	
	public boolean solucionUnica(){
		return 0 == Math.pow(this.b,2)-4*this.a*this.c;
		
		}
		
	public double getResultado1(){
		
		return ((-this.b +(Math.sqrt(this.b*this.b-(4*this.a*this.c))))/(2*this.a));
		}
	
	public double getResultado2(){
		
		return ((-this.b -(Math.sqrt(this.b*this.b-(4*this.a*this.c))))/(2*this.a));
		}
	@Override
	public String toString(){
		return  "Ecuacion de segundo grado"+this.a+"x²"+this.b+"x"+this.c+"=0";
		
		}
	
}

class TestEcuacionSegundoGrado{
		
		public static void main (String args[]) {
		
		EcuacionSegundoGrado e=new EcuacionSegundoGrado(1,-5,6);
		System.out.println(e);
		System.out.println("¿Es Resolube?"+e.esResoluble());
		System.out.println("Tiene una unica solucion"+e.solucionUnica());
		System.out.println("Solucion 1:"+e.getResultado1());
		System.out.println("Solucion 2:"+e.getResultado2());
		
	}
}
