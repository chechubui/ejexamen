public class TestLibros {
	
	public static void main (String args[]) {
		//creamos objetos
		Libros l1=new Libros("Cervantes","485-451-121577","El Quijote");
		Libros l2=new Libros("Anonimo","469-621-4214212","El lazarillo");
		Libros l3=new Libros("F.de Rojas","429-661-6214252","La Celestina");
		//vamos a invocar al metodo toString()
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		//consulta de disponibilidad
		System.out.println(l1+"Disponible"+l1.getDisponible());
		System.out.println(l2+"Disponible"+l2.getDisponible());
		System.out.println(l3+"Disponible"+l3.getDisponible());
		//prestamos
		l1.prestar();
		l2.prestar();
		System.out.println(l1+"Disponible"+l1.getDisponible());
		System.out.println(l2+"Disponible"+l2.getDisponible());
		System.out.println(l3+"Disponible"+l3.getDisponible());
		
	}
}

