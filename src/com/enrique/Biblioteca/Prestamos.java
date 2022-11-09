package com.enrique.Biblioteca;

public class Prestamos {
    private Integer id;
    private String libro;
    private Usuario usuario;
    private Integer fechaprestamo;
    private Integer fechadevolucion;

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public String getLibro(){
        return libro;
    }
    public void setLibro(String libro){
        this.libro=libro;
    }
    public Usuario getUsuario(){
        return usuario;
    }
    public void setUsuario(){
        this.usuario=usuario;
    }
    public Integer getFechaprestamo(){
        return fechaprestamo;
    }
    public void setFechaprestamo(Integer fechaprestamo){
        this.fechaprestamo=fechaprestamo;
    }
    public Integer getFechadevolucion(){
        return fechadevolucion;
    }
    public void setFechadevolucion(Integer fechadevolucion){
        this.fechadevolucion=fechadevolucion;
    }
}
