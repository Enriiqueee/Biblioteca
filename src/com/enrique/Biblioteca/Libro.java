package com.enrique.Biblioteca;

public class Libro {
    //Atributos
    private Integer id;
    private String titulo;
    private Integer isb;
    private String autor;
    private String genero;
    private String fechapublicacion;

    //Metodos
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {

        this.id = id;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getIsb() {
        return isb;
    }

    public void setIsb(Integer isb) {
        this.isb = isb;
    }
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getFechapublicacion() {
        return fechapublicacion;
    }

    public void setFechapublicacion(String fechapublicacion) {
        this.fechapublicacion = fechapublicacion;
    }
}
