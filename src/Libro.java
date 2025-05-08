public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible = true;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    
    public void mostrarDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("Estado: " + (disponible ? "Disponible" : "No disponible"));
    }
    

    public void prestar() {
        if (!disponible) {
            System.out.println("El libro no está disponible para préstamo");
            return;
        }
        disponible = false;
        System.out.println("Libro prestado con éxito");
    }
    
    public void devolver() {
        disponible = true;
        System.out.println("Libro devuelto con éxito");
    }
    

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    
    public int getAnioPublicacion() { return anioPublicacion; }
    public void setAnioPublicacion(int anioPublicacion) { this.anioPublicacion = anioPublicacion; }
    
    public boolean isDisponible() { return disponible; }
}