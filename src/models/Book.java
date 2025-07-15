package models;

public class Book implements Comparable<Book> {
    private String titulo;
    private String autor;
    private int anio;

    public Book(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public int compareTo(Book o) {
        if(o.getTitulo().compareTo(this.titulo) < 0) {
            return o.getTitulo().compareTo(this.titulo);
        }else if(this.titulo.compareTo(o.getTitulo()) == 0) {
            if(this.anio > o.getAnio()) {
                return Integer.compare(this.anio, o.getAnio());
            }
        } else if (this.anio == o.getAnio()) {
            System.out.println(" anio iguales");;
        }
        return 0;
    }
}
