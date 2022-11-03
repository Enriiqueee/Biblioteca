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

}
