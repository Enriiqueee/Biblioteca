package com.enrique.Biblioteca;
import java.util.ArrayList;
import java.util.List;

public class Prestamos {
    private Integer id;
    private Libro libro;
    private Usuario usuario;
    private String fechaprestamo;
    private String fechadevolucion;

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public Libro getLibro(){
        return libro;
    }
    public void setLibro(){
        this.libro=libro;
    }
    public Usuario getUsuario(){
        return usuario;
    }
    public void setUsuario(){
        this.usuario=usuario;
    }
    public String getFechaprestamo(){
        return fechaprestamo;
    }
    public void setFechaprestamo(String fechaprestamo){
        this.fechaprestamo=fechaprestamo;
    }
    public String getFechadevolucion(){
        return fechadevolucion;
    }
    public void setFechadevolucion(String fechadevolucion){
        this.fechadevolucion=fechadevolucion;
    }
}
