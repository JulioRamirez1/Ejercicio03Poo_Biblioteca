
public class Libro {
	private String titulo;
	private String autor;
	private Integer cantEjemplares;
	private Integer cantEjemplaresPrestado;
	
	public Libro() {
		cantEjemplaresPrestado = 0;
	}

	public Libro(String titulo, String autor, Integer cantEjemplares) {
		this.titulo = titulo;
		this.autor = autor;
		this.cantEjemplares = cantEjemplares;
		cantEjemplaresPrestado = 0;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getCantEjemplares() {
		return cantEjemplares;
	}

	public void setCantEjemplares(Integer cantEjemplares) {
		this.cantEjemplares = cantEjemplares;
	}

	public Integer getCantEjemplaresPrestado() {
		return cantEjemplaresPrestado;
	}

	public void setCantEjemplaresPrestado(Integer cantEjemplaresPrestado) {
		this.cantEjemplaresPrestado = cantEjemplaresPrestado;
	}
	
	public String detalleLibro() {
		return this.titulo + ", " + this.autor + ", " + this.cantEjemplares;
	}
	
	public void prestarLibro(int cantLibroPrestar) {
		if (cantLibroPrestar <= cantEjemplares) {
			System.out.println("Hay libros para prestar");
			
			if (this.esPrestamo(cantLibroPrestar)) {
				System.out.println("Se ha prestado el libro " + this.titulo);
			} else {
				System.out.println("No quedan ejemplares del libro " + this.titulo + " para prestar");
			}
			
		} else {
			System.out.println("No hay suficientes libros para prestar, solo hay " + cantEjemplares);
		}		
	
	}
	
	public void pevolverLibro() {
		if (this.esDevolucion()) {
			System.out.println("Se ha devuelto el libro " + this.titulo);
		} else {
			System.out.println("No hay ejemplares del libro " + this.titulo + " prestados");
		}
	}
	
	private boolean esPrestamo(int cantidad) {
		boolean esprestado = true;
		
		if (cantEjemplaresPrestado < cantEjemplares) {
			cantEjemplaresPrestado = cantEjemplaresPrestado + cantidad;
		} else {
			esprestado = false;
		}
		
		return esprestado;
	}
	
	private boolean esDevolucion() {
		boolean esdevocion = true;
		
		if (cantEjemplaresPrestado == 0) {
			esdevocion = false;
		} else {
			cantEjemplaresPrestado --;
		}
		
		return esdevocion;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", cantEjemplares=" + cantEjemplares
				+ ", cantEjemplaresPrestado=" + cantEjemplaresPrestado + "]";
	}
	
}
