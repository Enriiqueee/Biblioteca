package com.enrique.Biblioteca;

public class Prestamos {
    private Integer id;
    private String libroprestado;
    private String usuario;
    private Integer fechaprestamo;
    private Integer fechadevolucion;

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public String getLibroprestado(){
        return libroprestado;
    }
    public void setLibroprestado(String libroprestado){
        this.libroprestado=libroprestado;
    }
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuario){
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
    public void setFechadevolucion(Integer fechaprestamo){
        this.fechaprestamo=fechaprestamo;
    }
}
