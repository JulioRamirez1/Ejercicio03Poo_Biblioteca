import java.util.Scanner;

public class PooBiblioteca {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		Libro libro = new Libro();		
		/*Libro libro2 = new Libro();
		libro2.setTitulo("POO02");
		libro2.setAutor("Julio02");
		libro2.setCantEjemplares(1);*/
		
		System.out.println("Ingrese el titulo");
		libro.setTitulo(scanner.nextLine());
		System.out.println("Ingrese el autor");
		libro.setAutor(scanner.nextLine());
		System.out.println("Ingrese cantidad de ejemplares");
		libro.setCantEjemplares(scanner.nextInt());
		
		String detalle = libro.detalleLibro();
		System.out.println(detalle);
		
		libro.prestarLibro(6);
		/*libro.pevolverLibro();
		libro.prestarLibro(2);
		libro.prestarLibro(3);*/
		
		System.out.println(libro);
	}
}
