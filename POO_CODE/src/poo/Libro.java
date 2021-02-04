package poo;

public class Libro {

    private String titulo;
    private String fechaPublicacion;
    private String isbn;

    public Libro() {

    }
    
    public Libro(String titulo, String fecha, String isbn) {
        this.titulo = titulo;
        this.fechaPublicacion = fecha;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getISBN() {
        return isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFechaPublicacion(String fecha) {
        this.fechaPublicacion = fecha;
    }

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }
    
    public String mostrar() {
        String info = "Titulo: "+this.titulo+"\nFecha de publicación: "+this.fechaPublicacion+ "\nISBN: "+this.isbn;
        
        return info;
    }

}
